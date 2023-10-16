public class Log extends Obstacle
{
    // ----- Lifecycle ---------- //

    public Log()
    {
        setImage("images/Traps/Log.png");
        getImage().scale(getImage().getWidth() / 2, getImage().getHeight() / 2);
    }

    public void act()
    {
        Spin();

        super.act();
    }

    // ----- Combat ---------- //

    private void Spin()
    {
        turn(3);
    }
}
