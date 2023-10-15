import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TimerManager 
{
    private Map<String, Integer> TimerHandle;
    private Set<String>          TimerToRemove;

    // ----- Lifecycle ---------- //
    
    public TimerManager()
    {
        TimerHandle   = new HashMap<>();
        TimerToRemove = new HashSet<>();
    }

    public void TickManager()
    {
        TimerHandle  .forEach(this::RunTimer);
        TimerToRemove.forEach(TimerHandle::remove);
        TimerToRemove.clear();
    }
    
    // ----- Timer ---------- //

    public void StartTimer(String Handler, int Timer)
    {
        TimerHandle.put(Handler, Timer);
    }

    private void RunTimer(String Key, Integer Timer)
    {
        --Timer;

        if (Timer <= 0) TimerToRemove.add(Key);
        else            TimerHandle.put(Key, Timer);
    }

    public boolean IsTimerFinished(String Timer) 
    { 
        if (!TimerHandle.containsKey(Timer)) return true;

        return false; 
    }
}
