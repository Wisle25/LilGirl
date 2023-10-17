import java.util.HashMap;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Entity
{
    // ----- Movement ---------- //

    private int WalkSpeed;
    private int RunSpeed;

    // ----- Lifecycle ---------- //

    @Override
    protected void SetupAnimation()
    {
        Animations = new HashMap<>();

        // Adding idle pose as default anim
        setImage("images/Barudak/Idle/idle1.png");

        // Adding animation
        String Path = "images/Barudak/";

        Animations.put(EntityState.IDLE, new AnimationComponent(this, Path + "Idle", 15));
        Animations.put(EntityState.WALK, new AnimationComponent(this, Path + "Walk", 7));
        Animations.put(EntityState.RUN, new AnimationComponent(this, Path + "Run", 4));
        Animations.put(EntityState.FALL, new AnimationComponent(this, Path + "Jump", 5));
        Animations.put(EntityState.DIE, new AnimationComponent(this, Path + "Die", 9));

        // Edit some properties
        Animations.get(EntityState.FALL).SetPauseAtEnd(true);
        Animations.get(EntityState.DIE) .SetPauseAtEnd(true);

        Animations.forEach((Key, Value) -> {
            Value.SetScale(1.2);
        });
    }

    @Override
    protected void SetupMovement()
    {
        super.SetupMovement();

        WalkSpeed = 1;
        RunSpeed  = 4;

        Movement.SetAcceleration(7);
        Movement.SetDeceleration(11);
        Movement.SetMaxSpeed(RunSpeed);
        Movement.SetJumpStrength(11);
    }

    @Override
    public void act()
    {
        super.act();

        HandleInput();
    }

    // ----- Handler ---------- //

    private void HandleInput()
    {
        if (EState == EntityState.DIE) return;

        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            Flip(-1);
            Movement.AddVelocity(-1);
        }
        
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            Flip(1);
            Movement.AddVelocity(1);
        }

        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))
            Movement.Jump();

        if      (Greenfoot.isKeyDown("shift")  && Movement.IsMaxSpeedEqual(RunSpeed))
            Movement.SetMaxSpeed(WalkSpeed);
        else if (!Greenfoot.isKeyDown("shift") && Movement.IsMaxSpeedEqual(WalkSpeed))
            Movement.SetMaxSpeed(RunSpeed);
    }

    private void Flip(int Value)
    {
        int LastDirection = Direction;
        Direction = Value;

        if (LastDirection != Direction)
            Animations.forEach((Key, Anim) -> {
                Anim.Flip();
            });
    }

    @Override
    protected void HandleState()
    {
        // If the entity is died...no need to handle the state anymore
        if (EState == EntityState.DIE) return;

        int Speed = Math.abs(Movement.GetVelocity());
        
        if      (Movement.IsFalling()) SetState(EntityState.FALL);
        else if (Speed == 0)           SetState(EntityState.IDLE);
        else if (0 < Speed && Speed <= WalkSpeed)         SetState(EntityState.WALK);
        else if (WalkSpeed < Speed && Speed <= RunSpeed)  SetState(EntityState.RUN);
    }
}
