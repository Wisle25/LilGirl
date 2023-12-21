import greenfoot.Actor;

public class Weapon extends Actor 
{
    // ===== Lifecycles ========== //

    public Weapon(String Name, double Scale, int AddAmount, int Speed, int MaxDistance, int Damage)
    {
        this.AddAmount = AddAmount;
        this.Speed = Speed;
        this.MaxDistance = MaxDistance;
        this.Damage = Damage;

        String path = "images/Weapons/" + Name;

        setImage(path + "/" + Name + "1.png");
        getImage().scale((int)(getImage().getWidth() / Scale), (int)(getImage().getHeight() / Scale));
        Anim = new AnimationComponent(this, path, 2);
        Anim.SetScale(Scale);
    }

    public void act()
    {
        Floating();
        CheckCollision();
        Shooting();
    }
    
    // ===== Components ========== //

    private AnimationComponent Anim;

    // ===== References ========== //

    private Player PlayerOwner;

    // ===== Attributes ========== //

    int Count = 10;
    int AddAmount;
    int FloatingTimer = 0;

    WeaponState weaponState = WeaponState.IDLING;

    public void Add(Player PlayerOwner)
    {
        this.PlayerOwner = PlayerOwner;
        
        // Won't adding the count if its dropped already (means the player has own it earlier)
        if (weaponState != WeaponState.DROPPED && weaponState != WeaponState.IDLING) Count += AddAmount;
        
        weaponState = WeaponState.TAKEN;
        SetVisibility(false);
    }

    public void SetVisibility(boolean NewVisible)
    {
        getImage().setTransparency(NewVisible ? 255 : 0);
        Anim.SetVisibility(NewVisible);
    }

    public void Drop()
    {
        PlayerOwner = null;
        weaponState = WeaponState.DROPPED;
        SetVisibility(true);

        if (Count == 0)
            getWorldOfType(UWorld.class).RemoveObject(this);
    }

    // ===== Transformations ========== //

    private void Floating()
    {
        if (weaponState != WeaponState.IDLING) return;

        double yOffset = 2.0 * Math.sin(FloatingTimer * .1);

        setLocation(getX(), getY() + (int)yOffset);
        ++FloatingTimer;
    }

    // ===== Combat ========== //

    private int Direction;
    private int Distance = 0;
    private final int FALLING_FACTOR = 1;
    private int Speed;
    private int MaxDistance;
    private int Damage = 20;

    public boolean Shoot(int Direction)
    {
        System.out.println("Weapon Left: " + Count);
        if (weaponState == WeaponState.SHOOTING && Count == 0) return false;

        this.Direction = Direction;
        weaponState    = WeaponState.SHOOTING;
        --Count;

        setLocation(PlayerOwner.getX(), PlayerOwner.getY() - PlayerOwner.getImage().getHeight() / 2);
        SetVisibility(true);

        return true;
    }

    private void CheckCollision()
    {
        if (weaponState != WeaponState.SHOOTING) return;

        Enemy enemy = (Enemy)getOneIntersectingObject(Enemy.class);
        // Environment Env = (Environment)getOneIntersectingObject(Environment.class);

        if (enemy != null || /*Env != null ||*/ Distance >= MaxDistance)
        {
            Distance = 0;
            weaponState = WeaponState.TAKEN;
            SetVisibility(false);

            if (enemy != null) enemy.ReceiveDamage(Damage, null);
        }
    }

    private void Shooting()
    {
        if (weaponState != WeaponState.SHOOTING) return;

        Anim.TickComponent();

        // Affected to gravity too :)
        int xOffset = Speed * Direction;
        setLocation(getX() + xOffset, getY() + FALLING_FACTOR);
        Distance += Math.abs(xOffset);
    }

    public int GetCount()
    {
        return Count;
    }
}
