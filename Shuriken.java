import greenfoot.Actor;

public class Shuriken extends Obstacle
{
    // ----- Lifecycle ---------- //

    public Shuriken(int Rotation, int Speed)
    {
        Anim       = new AnimationComponent(this, "images/Traps/Shuriken/Shuriken", 5);
        Anim.SetScale(10);
        this.Speed = Speed;
        this.Damage = 15;

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
    private int MaxDistance = 250;

    private void Shoot()
    {
        Actor Player = getOneIntersectingObject(Player.class);

        if (Player != null)
        {
            getWorldOfType(UWorld.class).RemoveObject(this);

            return;
        }
        
        if (Distance <= MaxDistance)
        {
            Distance += Speed;
            move(Speed);
        }
        else
        {
            Distance     = 0;
            UWorld World = getWorldOfType(UWorld.class);

            World.RemoveObject(this);
        }
    }

}
