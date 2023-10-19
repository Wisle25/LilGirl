public class STrow extends Environment
{
    // ----- Lifecycle ---------- //

    public STrow(int Rotation, int Speed)
    {
        setImage("images/Traps/Shuriken/STrow.png");
        setRotation(Rotation);
        CreateShuriken(Rotation, Speed);

        int newWidth  = (int)(getImage().getWidth() * 2);
        int newHeight = (int)(getImage().getHeight() * 2);
        
        getImage().scale(newWidth, newHeight);
    }

    public void act()
    {
        super.act();

        Shoot();
    }

    // ----- Combat ---------- //

    private Shuriken[] Shurikens = new Shuriken[3];

    private TimerHandle ShootTimerHandler = new TimerHandle();
    private int ShootTimer = 170;

    private TimerHandle EachShootTimerHandler = new TimerHandle();
    private int EachShootTimer = 15;
    
    private int Count = 0;

    private boolean Shooting = false;

    private void CreateShuriken(int Rotation, int Speed)
    {
        for (int I = 0; I < 3; ++I)
            Shurikens[I] = new Shuriken(getRotation(), Speed);
    }

    private void Shoot()
    {
        UWorld World = getWorldOfType(UWorld.class);

        boolean bCanShoot  = World.GetTimerManager().IsTimerFinished(ShootTimerHandler);
        boolean bShootEach = World.GetTimerManager().IsTimerFinished(EachShootTimerHandler);
        
        if (bCanShoot)
        {
            Shooting = true;
        }

        if (Shooting && bShootEach && Count < 3)
        {
            World.AddObject(Shurikens[Count++], getX(), getY());

            World.GetTimerManager().StartTimer(EachShootTimerHandler, EachShootTimer);
        }
        else if (Shooting && bShootEach && Count == 3)
        {
            Count = 0;
            Shooting = false;

            // Create new timer to shoot
            World.GetTimerManager().StartTimer(ShootTimerHandler, ShootTimer);
        }
    } 
}