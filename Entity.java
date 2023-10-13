import java.util.Map;

import greenfoot.*;

public class Entity extends Actor
{
    // ----- Lifecycle ---------- //
    
    public Entity()
    {
        SetupAnimation();
        SetupMovement();
    }
    
    public void act()
    {
        if (Animations != null && !Animations.isEmpty()) 
        Animations.get(EState).TickComponent();
        Movement              .TickComponent();
    }

    // ----- Properties ---------- //

    protected int Direction = 1;
    protected EntityState EState = EntityState.IDLE;

    public void SetState(EntityState Value) { EState = Value; }

    // ----- Attributes ---------- //

    private int MaxHealth = 100;
    private int Health    = MaxHealth;

    public void ReceiveDamage(int Damage)
    {
        Health = Health - Damage <= 0 ? 0 : Health - Damage;
        System.out.println(this.toString() + " health is now " + Health);

        if (Health == 0)
            Die();
    }

    private void Die()
    {
        System.out.println(this.toString() + " Should Die!");
    }

    // ----- Components ---------- //

    protected Map<EntityState, AnimationComponent> Animations;
    protected MovementComponent Movement;

    /* Should setup animation here */
    protected void SetupAnimation()
    {
        // Do nothing in here
    }

    protected void SetupMovement()
    {
        Movement = new MovementComponent(this);
    }

    // ----- Physics ---------- //

    public boolean IsOnGround()
    {
        Actor Ground = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);

        return Ground != null;
    }
}
