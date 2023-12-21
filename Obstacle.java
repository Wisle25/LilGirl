import greenfoot.Greenfoot;

public class Obstacle extends Environment
{
    // ----- Lifecycle ---------- //

    public void act()
    {
        if (Anim != null) Anim.TickComponent();
        Damaging();
    }

    // ----- Components ---------- //

    protected AnimationComponent Anim;

    public void SetScale(double Value)
    {
        int newWidth  = (int)(getImage().getWidth() / Value);
        int newHeight = (int)(getImage().getHeight() / Value);
        
        getImage().scale(newWidth, newHeight);
    }

    // ----- Combat ---------- //

    private TimerHandle DamageTimerHandler = new TimerHandle();

    protected int Damage      = 20;
    protected DamageType Type = DamageType.GEAR;

    protected void Damaging()
    {
        UWorld World       = getWorldOfType(UWorld.class);
        boolean bCanDamage = World.GetTimerManager().IsTimerFinished(DamageTimerHandler);

        if (!bCanDamage) return;

        Player Character = (Player)getOneIntersectingObject(Player.class);

        if (Character != null && !Character.StateEqualTo(EntityState.DIE))
        {
            // Randomize damage
            int MinDmg = Damage - 10;
            int MaxDmg = Damage + 10;
            int RandDamage = Greenfoot.getRandomNumber(MaxDmg - MinDmg + 1) + MinDmg;

            Character.ReceiveDamage(RandDamage, Type);

            // Start new timer
            World.GetTimerManager().StartTimer(DamageTimerHandler, 30);
        }
    }
}
