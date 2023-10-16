public class Gear extends Obstacle
{
    // ----- Components ---------- //

    public Gear()
    {
        setImage("images/Traps/Gear/1.png");

        Anim = new AnimationComponent(this, "images/Traps/Gear" , 2);
    }
}
