import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TimerManager 
{
    private Map<String, Integer> TimerHandle;

    // ----- Lifecycle ---------- //
    
    public TimerManager()
    {
        TimerHandle = new HashMap<>();
    }

    public void TickManager()
    {
        Set<String> TimerToRemove = new HashSet<>();

        TimerHandle.forEach((Key, Timer) -> {
            --Timer;

            if (Timer <= 0) TimerToRemove.add(Key);
            else            TimerHandle.put(Key, Timer);
        });

        TimerToRemove.forEach(TimerHandle::remove);
    }
    
    // ----- Timer ---------- //

    public void StartTimer(String Handler, int Timer)
    {
        TimerHandle.put(Handler, Timer);
    }

    public boolean IsTimerFinished(String Timer) 
    { 
        if (!TimerHandle.containsKey(Timer)) return true;

        return TimerHandle.get(Timer) == 0; 
    }
}
