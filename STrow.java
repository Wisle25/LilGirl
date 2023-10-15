public class STrow extends Environment
{
    // ----- Lifecycle ---------- //

    public STrow(int Rotation, int Speed)
    {
        this.Speed = Speed;

        setImage("images/Traps/Shuriken/STrow.png");
        setRotation(Rotation);
    }

    public void act()
    {
        super.act();

        Shoot();
    }

    // ----- Combat ---------- //

    private int ShootTimer = 300;
    private int EachShootTimer = 20;
    private int Count = 3;
    private int Speed;

    private void Shoot()
    {
        UWorld World = getWorldOfType(UWorld.class);

        boolean bCanShoot = World.GetTimerManager().IsTimerFinished("ShootTimer");

        if (!bCanShoot) return;

        boolean bShootEach = World.GetTimerManager().IsTimerFinished("EachShootTimer");

        if (bShootEach && Count > 0)
        {
            World.AddObject(new Shuriken(getRotation(), Speed), getX(), getY());

            --Count;

            World.GetTimerManager().StartTimer("EachShootTimer", EachShootTimer);
        }
        else if (bShootEach && Count == 0)
        {
            // Create new timer to shoot
            World.GetTimerManager().StartTimer("ShootTimer", ShootTimer);
        }
    }
}