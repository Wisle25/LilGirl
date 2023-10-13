import greenfoot.*;

public class UWorld extends World
{

    // ----- Lifecycle ---------- //

    public UWorld()
    {   
        super(1920, 1080, 1);
        // Construct Managers
        M_TimerManager = new TimerManager();
    }
    
    @Override
    public void act()
    {
        M_TimerManager.TickManager();
    }

    // ----- Managers ---------- //

    private TimerManager M_TimerManager;
    public  TimerManager GetTimerManager() { return M_TimerManager; }
}
