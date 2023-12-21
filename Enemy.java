import java.util.Random;

public abstract class Enemy extends Entity
{
    // ===== Lifecycles ========== //
    @Override
    protected void SetupMovement()
    {
        super.SetupMovement();

        Movement.SetAcceleration(13);
        Movement.SetDeceleration(17);
        Movement.SetMaxSpeed(PatrolSpeed);
    }

    public void act()
    {
        ReferenceInitializer();
        Patrolling();
        CheckPlayer();
        Chasing();
        Attacking();
        Dissolve();

        super.act();
    }

    // ===== References ========== //

    UWorld World;
    Player player;

    // Intended to be called once in the begining
    private void ReferenceInitializer()
    {
        if (World == null)
        {
            World  = getWorldOfType(UWorld.class);

            // Start patrolling
            World.GetTimerManager().StartTimer(PatrolTimerHandle, PatrolTimer, this::StartPatrolling);
            xSpawn = getX();
        }
        if (player == null) player = World.GetPlayer();
    }

    // ===== Attributes ========== //

    private EnemyState enemyState = EnemyState.CHECKING;
    private int PatrolRadius = 500;
    private int xSpawn;

    // ===== Combat ========== //

    protected int Damage = 10;

    private TimerHandle DamagingTimerHandle = new TimerHandle();
    private int DamagingTimer = 100;
    private boolean Dissolving = false;

    private void Dissolve()
    {
        if (!Dissolving) return;

        getImage().setTransparency(
            getImage().getTransparency() - 30 >= 0 ? getImage().getTransparency() - 30
            : 0
        );

        if (getImage().getTransparency() == 0)
            getWorldOfType(UWorld.class).RemoveObject(this);
    }

    @Override
    protected void Die(DamageType Type)
    {
        Dissolving = true;
    }

    // ===== Behavior ========== //

    private TimerHandle PatrolTimerHandle = new TimerHandle();
    private int PatrolTimer = 500;
    private int PatrolSpeed = 1;
    private int PatrolTarget;

    private int Sight = 220;
    private int ChaseSpeed = 2; 
    private int InterestMax = 320;

    protected void StartPatrolling()
    {
        // Pick random patrol target
        int minTarget = xSpawn - PatrolRadius;
        int maxTarget = xSpawn + PatrolRadius;

        Random rnd = new Random();
        PatrolTarget = minTarget + rnd.nextInt(maxTarget - minTarget + 1);
        int TempDirection = PatrolTarget - getX() > 0 ? 1 : -1;
        Flip(TempDirection);

        enemyState = EnemyState.PATROLLING;
        Movement.SetMaxSpeed(PatrolSpeed);
    }

    protected void Patrolling()
    {
        if (enemyState != EnemyState.PATROLLING) return;
        
        boolean Right = getOneObjectAtOffset(getImage().getWidth() / 2 + 5, 0, Ground.class) != null;
        boolean Left  = getOneObjectAtOffset(-getImage().getWidth() / 2 - 5, 0, Ground.class) != null;

        if (GetPlayerDistance() < 5 || Right || Left)
        {
            if (Left)  Movement.AddVelocity(1);
            if (Right) Movement.AddVelocity(-1);

            enemyState = EnemyState.CHECKING;
            World.GetTimerManager().StartTimer(PatrolTimerHandle, PatrolTimer, () -> StartPatrolling());
        }
        else
            Movement.AddVelocity(Direction);
    }

    protected void CheckPlayer()
    {
        int Start = getX();
        int End   = Start + Sight * Direction;

        if (player.getX() >= Start && player.getX() <= End)
        {
            // Start chasing
            enemyState = EnemyState.CHASING;
            Movement.SetMaxSpeed(ChaseSpeed);

            // Getting the direction
            Direction = player.getX() - getX() > 0 ? 1 : -1;
        }
    }

    protected void Chasing()
    {
        if (enemyState != EnemyState.CHASING) return;

        if (GetPlayerDistance() <= InterestMax && GetPlayerDistance() > 2)
        {
            // Getting the direction
            Direction = player.getX() - getX() > 0 ? 1 : -1;
            Movement.AddVelocity(Direction);
        }
        // Losing interest
        else if (GetPlayerDistance() > InterestMax)
        {
            enemyState = EnemyState.CHECKING;
            World.GetTimerManager().StartTimer(PatrolTimerHandle, PatrolTimer, this::StartPatrolling);
        }
    } 

    protected void Attacking()
    {
        boolean CanDamage = getOneIntersectingObject(Player.class) != null
            && World.GetTimerManager().IsTimerFinished(DamagingTimerHandle);
        if (CanDamage)
        {
            player.ReceiveDamage(Damage, DamageType.GEAR);
            World.GetTimerManager().StartTimer(DamagingTimerHandle, DamagingTimer);
        }
    }

    protected int GetPlayerDistance()
    {
        return Math.abs(player.getX() - getX());
    }
}
