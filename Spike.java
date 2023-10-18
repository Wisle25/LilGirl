public class Spike extends Obstacle
{
    private boolean bAllowMoving = false;

    // ----- Lifecycle ---------- //

    public Spike()
    {
        setImage("images/Traps/Spike/Spike.png");
        getImage().scale(82, 18);
    }

    public Spike(boolean AllowMoving)
    {
        bAllowMoving = AllowMoving;

        setImage("images/Traps/Spike/Spike.png");
        getImage().scale(82, 18); 
    }

    public void act()
    {   
        super.act();

        MovingTimer();
        Moving();
    }

    // ----- Transformation ---------- //

    private int DefaultY;
    private int TargetY;
    private int MoveTimer = 200;

    private boolean bShouldMove = false;
    private boolean bGoingDown  = true;

    public void SetDefaultLocation(int X, int Y)
    {
        DefaultY = Y;
        TargetY  = Y + getImage().getHeight();

        System.out.println("DefaultY: " + DefaultY + ". TargetY: " + TargetY);
    }

    private void MovingTimer()
    {
        if (!bAllowMoving) return;

        UWorld World = getWorldOfType(UWorld.class);

        if (World.GetTimerManager().IsTimerFinished("MovingTimer"))
            bShouldMove = true;
    }

    private void Moving()
    {
        if (!bShouldMove) return;
        
        System.out.println("CurrentY: " + getY() + ". TargetY: " + TargetY);
        if (bGoingDown && getY() <= TargetY)
        {
            setLocation(getX(), getY() + 2);
        }
        else if (bGoingDown && getY() > TargetY)
        {
            bShouldMove = false;
            bGoingDown  = false;

            // Start new timer
            getWorldOfType(UWorld.class).GetTimerManager().StartTimer("MovingTimer", MoveTimer);
        }

        if (!bGoingDown && getY() >= DefaultY)
            setLocation(getX(), getY() - 2);
        else if (!bGoingDown && getY() < DefaultY)
        {
            bShouldMove = false;
            bGoingDown  = true;

            // Start new timer
            getWorldOfType(UWorld.class).GetTimerManager().StartTimer("MovingTimer", MoveTimer);
        }
    }
}
