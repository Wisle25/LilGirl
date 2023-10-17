public class Log extends Obstacle
{
    // ----- Lifecycle ---------- //

    public Log()
    {
        setImage("images/Traps/Log.png");
        SetScale(2);
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
