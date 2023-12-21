import java.util.HashMap;

public class Kunti extends Enemy 
{
    // ===== Lifecycles ========== //

    @Override
    protected void SetupAnimation()
    {
        Animations = new HashMap<>();

        Animations.put(EntityState.IDLE, new AnimationComponent(this, "images/Kunti", 8));
        Animations.forEach((key, anis) -> {
            anis.SetScale(0.6);
        });
    }

    
}
