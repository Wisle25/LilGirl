public class STrow extends Environment
{
    // ----- Lifecycle ---------- //

    public STrow(int Rotation, int Speed)
    {
        setImage("images/Traps/Shuriken/STrow.png");
        getImage().scale(20, 20);
        setRotation(Rotation);
        CreateShuriken(Rotation, Speed);
    }

    public void act()
    {
        super.act();

        Shoot();
    }

    // ----- Combat ---------- //

    private Shuriken[] Shurikens = new Shuriken[3];

    private int ShootTimer = 100;
    private int EachShootTimer = 20;
    private int Count = 0;

    private void CreateShuriken(int Rotation, int Speed)
    {
        for (int I = 0; I < 3; ++I)
            Shurikens[I] = new Shuriken(getRotation(), Speed);
    }

    private void Shoot()
    {
        UWorld World = getWorldOfType(UWorld.class);

        boolean bCanShoot = World.GetTimerManager().IsTimerFinished("ShootTimer");

        if (!bCanShoot) return;

        boolean bShootEach = World.GetTimerManager().IsTimerFinished("EachShootTimer");

        if (bShootEach && Count < 3)
        {
            World.AddObject(Shurikens[Count++], getX(), getY());

            World.GetTimerManager().StartTimer("EachShootTimer", EachShootTimer);
        }
        else if (bShootEach && Count == 3)
        {
            Count = 0;

            // Create new timer to shoot
            World.GetTimerManager().StartTimer("ShootTimer", ShootTimer);
        }
    }
}