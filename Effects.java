import greenfoot.Actor;

public class Effects extends Actor
{
    // ----- Lifecycle ---------- //

    public Effects(String EffectPath, int AnimSpeed)
    {
        String Folder = "images/Effects/";

        Anim = new AnimationComponent(this, Folder + EffectPath, AnimSpeed);
    }

    public void act()
    {
        Anim.TickComponent();
        EndEffect();
    }

    // ----- Effects ---------- //

    private AnimationComponent Anim;

    private void EndEffect()
    {
        if (Anim.IsFinished())
        {
            // Remove the effect
            UWorld World = getWorldOfType(UWorld.class);

            World.RemoveObject(this);
        }
    }
}
