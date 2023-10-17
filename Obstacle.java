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
    private Effects BloodSplash = new Effects("BloodSplash", 1);

    protected void SetScale(double Value)
    {
        int newWidth  = (int)(getImage().getWidth() / Value);
        int newHeight = (int)(getImage().getHeight() / Value);
        
        getImage().scale(newWidth, newHeight);
    }

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
            World.GetTimerManager().StartTimer("Damaging", 15);

            // Spawn blood and sound effect
            World.addObject(BloodSplash, Character.getX(), Character.getY());
            Greenfoot.playSound("bloodsplash.wav");
        }
    }

}
