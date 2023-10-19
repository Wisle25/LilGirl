import java.util.HashSet;
import java.util.Set;

public class TimerManager 
{
    private Set<TimerHandle> TimerHandles;
    private Set<TimerHandle> TimerToRemove;

    // ----- Lifecycle ---------- //
    
    public TimerManager()
    {
        TimerHandles  = new HashSet<>();
        TimerToRemove = new HashSet<>();
    }

    public void TickManager()
    {
        TimerHandles .forEach(this::RunTimer);
        TimerToRemove.forEach(TimerHandles::remove);
        TimerToRemove.clear();
    }
    
    // ----- Timer ---------- //

    public void StartTimer(TimerHandle Handler, int Timer)
    {
        Handler     .SetTimer(Timer);
        TimerHandles.add(Handler);
    }

    private void RunTimer(TimerHandle Handler)
    {
        Handler.Run();

        if (Handler.IsFinished()) TimerToRemove.add(Handler);
    }

    public void ClearTimer(TimerHandle Key)
    {
        if (!TimerHandles.contains(Key)) return;

        TimerHandles.remove(Key);
    }

    public boolean IsTimerFinished(TimerHandle Timer) 
    { 
        if (!TimerHandles.contains(Timer)) return true;

        return false; 
    }
}
