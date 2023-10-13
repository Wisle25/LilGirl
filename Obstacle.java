import greenfoot.*;

public class Obstacle extends Environment
{
    // ----- Lifecycle ---------- //

    public Obstacle()
    {

    }

    public void act()
    {
        if (Anim != null) Anim.TickComponent();
        Damaging();
    }

    // ----- Components ---------- //

    protected AnimationComponent Anim;

    // ----- Combat ---------- //

    protected int Damage = 20;

    private void Damaging()
    {
        UWorld World       = getWorldOfType(UWorld.class);
        boolean bCanDamage = World.GetTimerManager().IsTimerFinished("Damaging");

        if (!bCanDamage) return;

        Player Character = (Player)getOneIntersectingObject(Player.class);

        if (Character != null)
        {
            Character.ReceiveDamage(Damage);

            // Start new timer
            World.GetTimerManager().StartTimer("Damaging", 30);
        }
    }
}
