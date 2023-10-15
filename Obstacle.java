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

    // ----- Combat ---------- //

    protected int Damage = 20;

    protected void Damaging()
    {
        UWorld World       = getWorldOfType(UWorld.class);
        boolean bCanDamage = World.GetTimerManager().IsTimerFinished("Damaging");

        if (!bCanDamage) return;

        Player Character = (Player)getOneIntersectingObject(Player.class);

        if (Character != null)
        {
            Character.ReceiveDamage(Damage);

            // Start new timer
            World.GetTimerManager().StartTimer("Damaging", 20);
        }
    }
}
