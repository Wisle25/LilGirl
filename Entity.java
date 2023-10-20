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
        HandleState();
        if (Animations != null && !Animations.isEmpty())
        Animations.get(EState).TickComponent();
        Movement              .TickComponent();
    }

    // ----- Properties ---------- //

    protected int Direction = 1;
    protected EntityState EState = EntityState.IDLE;

    public void SetState(EntityState Value) 
    { 
        if (EState == Value) return;

        EntityState LastState = EState;
        EState                = Value; 

        // Reset last animation state
        if (Animations.containsKey(LastState))
            Animations.get(LastState).Reset();

        // Setup new animation
        if (Animations.containsKey(EState))
            Animations.get(EState).Setup();
    }
    
    public boolean StateEqualTo(EntityState Value)
    {
        return EState == Value;
    }

    protected void HandleState()
    {
    }

    // ----- Attributes ---------- //

    protected int MaxHealth = 100;
    protected int Health    = MaxHealth;

    public void ReceiveDamage(int Damage, DamageType Type)
    {
        Health = Health - Damage <= 0 ? 0 : Health - Damage;

        if (Health == 0)
            Die(Type);
    }

    protected void Die(DamageType Type)
    {
        SetState(EntityState.DIE);
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

    public boolean CheckAbove()
    {
        return getOneObjectAtOffset(0, -getImage().getHeight()/2 - 1, Ground.class) != null;
    }

    public boolean CheckRight()
    {
        return getOneObjectAtOffset(getImage().getWidth() / 2, 0, Ground.class) != null;
    }

    public boolean CheckLeft()
    {
        return getOneObjectAtOffset(-getImage().getWidth() / 2, 0, Ground.class) != null;
    }

    public int IsCrawling()
    {
        boolean Left = getOneObjectAtOffset(-getImage().getWidth() / 2 - 1, 0, Ground.class) != null;
        boolean Right = getOneObjectAtOffset(getImage().getWidth() / 2 + 1, 0, Ground.class) != null;
        boolean Web   = getOneIntersectingObject(Web.class) != null;

        return Left ? -1 : Right || Web ? 1 : 0;
    }

    public boolean IsOnGround()
    {
        Actor Ground = getOneObjectAtOffset(0, getImage().getHeight() / 2 + 1, Ground.class);

        return Ground != null;
    }

    public Actor GetGround()
    {
        return getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
    }
}
