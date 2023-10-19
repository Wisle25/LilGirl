public class TimerHandle 
{
    private int Timer;

    public TimerHandle()
    {
        
    }

    public void SetTimer(int Timer)
    {
        this.Timer = Timer;
    }

    public void Run()
    {
        --Timer;
    }

    public boolean IsFinished()
    {
        return Timer <= 0;
    }
}
