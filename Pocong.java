import java.util.HashMap;

public class Pocong extends Enemy
{
    @Override
    protected void SetupAnimation()
    {
        Animations = new HashMap<>();

        Animations.put(EntityState.IDLE, new AnimationComponent(this, "images/Poci/Idle", 5));
    }
}
