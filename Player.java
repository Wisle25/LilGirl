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
        Animations.put(EntityState.WALK, new AnimationComponent(this, Path + "Walk", 10));
        Animations.put(EntityState.RUN, new AnimationComponent(this, Path + "Run", 15));
    }

    @Override
    protected void SetupMovement()
    {
        super.SetupMovement();

        WalkSpeed = 2;
        RunSpeed  = 4;

        Movement.SetAcceleration(15);
        Movement.SetDeceleration(20);
        Movement.SetMaxSpeed(RunSpeed);
        Movement.SetJumpStrength(20);
    }

    @Override
    public void act()
    {
        super.act();

        HandleInput();
        HandleState();
    }

    // ----- Handler ---------- //

    private void HandleInput()
    {
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            Flip(-1);
            Movement.AddVelocity(-1);
        }
        else if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
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

    private void HandleState()
    {
        int Speed = Math.abs(Movement.GetVelocity());

        if      (Speed == 0)                     EState = EntityState.IDLE;
        else if (0 < Speed && Speed <= WalkSpeed) EState = EntityState.WALK;
        else if (WalkSpeed < Speed && Speed <= RunSpeed)  EState = EntityState.RUN;
        // else if (Movement.IsFalling())                                        EState = EntityState.FALL;
    }
}
