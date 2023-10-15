public class Shuriken extends Obstacle
{
    // ----- Lifecycle ---------- //

    public Shuriken(int Rotation, int Speed)
    {
        Anim       = new AnimationComponent(this, "images/Shuriken/Shuriken", 5);
        this.Speed = Speed;

        setRotation(Rotation);
    }

    public void act()
    {
        super.act();

        Shoot();
    }

    // ----- Combat ---------- //

    private int Speed;
    private int Distance    = 0;
    private int MaxDistance = 50;

    private void Shoot()
    {   
        if (Distance <= MaxDistance)
        {
            Distance += Speed;
            move(Speed);
        }
        else
        {
            UWorld World = getWorldOfType(UWorld.class);

            World.RemoveObject(this);
        }
    }

}
