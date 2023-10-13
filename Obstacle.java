import greenfoot.*;

public class Obstacle extends Environment
{
    // ----- Lifecycle ---------- //

    public void act()
    {
        if (Anim != null) Anim.TickComponent();
        Damaging();
    }

    // ----- Components ---------- //

    protected AnimationComponent Anim;

    // ----- Combat ---------- //

    protected int Damage = 20;

    private void Damaging()
    {
        Player Character = (Player)getOneIntersectingObject(Player.class);

        if (Character != null)
        {
            Character.ReceiveDamage(Damage);
        }
    }
}
