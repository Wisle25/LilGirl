import greenfoot.Actor;

public class HealthHUD extends Widget
{
    // ----- Lifecycle ---------- //

    public HealthHUD(Actor InActor, String IconName, int X, int Y)
    {
        super(InActor, IconName, X, Y);
    }

    // ----- UI ---------- //

    public void UpdateHealth(int CurrentHealth)
    {
        AddText(String.valueOf(CurrentHealth), 50, 0);
    }
}
