import java.util.HashMap;

public class Jalangkung extends Enemy
{
    @Override
    protected void SetupAnimation()
    {
        Animations = new HashMap<>();

        Animations.put(EntityState.IDLE, new AnimationComponent(this, "images/Jalangkung", 5));
        Animations.forEach((key, anis) -> {
            anis.SetScale(0.6);
        });
    }
}
