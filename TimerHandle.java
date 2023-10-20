public class TimerHandle 
{
    private int Timer;
    
    public interface TimerFinishedEvent
    {
        void Execute();
    }

    TimerFinishedEvent Event;

    public TimerHandle()
    {
        
    }

    public void SetTimer(int Timer)
    {
        this.Timer = Timer;
    }

    public void SetTimer(int Timer, TimerFinishedEvent Event)
    {
        this.Timer = Timer;
        this.Event = Event;
    }

    public void Run()
    {
        --Timer;

        if (IsFinished() && Event != null)
            Event.Execute();
    }

    public boolean IsFinished()
    {
        return Timer <= 0;
    }
}
