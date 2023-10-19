public class Gear extends Obstacle
{
    // ----- Components ---------- //

    public Gear()
    {
        setImage("images/Traps/Gear/1.png");

        Anim = new AnimationComponent(this, "images/Traps/Gear" , 2);
        getImage().scale(getImage().getWidth() * 2, getImage().getHeight() * 2);
        Anim.SetScale(0.5);
    }
}
