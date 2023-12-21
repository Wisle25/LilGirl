import java.util.HashMap;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Entity
{
    // ===== Components ========== //

    private InventoryComponent Inventory;

    // ----- Movement ---------- //

    private int WalkSpeed;
    private int RunSpeed;

    // ----- Lifecycle ---------- //

    public Player()
    {
        super();

        ConstructHUD();
        Inventory = new InventoryComponent();
    }

    @Override
    protected void SetupAnimation()
    {
        Animations = new HashMap<>();

        // Adding idle pose as default anim
        setImage("images/Barudak/Idle/idle1.png");
        getImage().scale((int)(getImage().getWidth() / 1.2), (int)(getImage().getHeight() / 1.2));

        // Adding animation
        String Path = "images/Barudak/";

        Animations.put(EntityState.IDLE, new AnimationComponent(this, Path + "Idle", 15));
        Animations.put(EntityState.WALK, new AnimationComponent(this, Path + "Walk", 7));
        Animations.put(EntityState.RUN, new AnimationComponent(this, Path + "Run", 4));
        Animations.put(EntityState.FALL, new AnimationComponent(this, Path + "Jump", 1));
        Animations.put(EntityState.DIE, new AnimationComponent(this, Path + "Die", 9));
        Animations.put(EntityState.CRAWLING, new AnimationComponent(this, Path + "Crawl", 1));
        Animations.put(EntityState.SHOOT, new AnimationComponent(this, Path + "Throw", 3));

        // Edit some properties
        Animations.get(EntityState.FALL) .SetPauseAtEnd(true);
        Animations.get(EntityState.DIE)  .SetPauseAtEnd(true);
        Animations.get(EntityState.SHOOT).SetPauseAtEnd(true);

        Animations.forEach((Key, Value) -> {
            Value.SetScale(1.2);
        });
    }

    @Override
    protected void SetupMovement()
    {
        super.SetupMovement();

        WalkSpeed = 4;
        RunSpeed  = 7;

        Movement.SetAcceleration(13);
        Movement.SetDeceleration(17);
        Movement.SetMaxSpeed(RunSpeed);
        Movement.SetJumpStrength(20);
    }

    @Override
    public void act()
    {
        HandleInput();
        UpdateHUD();
        SenseWeapon();

        super.act();
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
        {
            boolean SuccessJump = Movement.Jump();

            if (SuccessJump) Greenfoot.playSound("jump.wav");
        }

        if      (Greenfoot.isKeyDown("shift")  && Movement.IsMaxSpeedEqual(RunSpeed))
            Movement.SetMaxSpeed(WalkSpeed);
        else if (!Greenfoot.isKeyDown("shift") && Movement.IsMaxSpeedEqual(WalkSpeed))
            Movement.SetMaxSpeed(RunSpeed);

        if (Greenfoot.isKeyDown("F"))
            if (OverlappingWeapon != null) Inventory.AddToInventory(OverlappingWeapon, this);

        if (Greenfoot.mousePressed(null))
        {
            if (Greenfoot.getMouseInfo().getButton() == 1) // LMB
            {
                boolean SucessShooting = Inventory.Shoot(Movement.GetDirection());

                if (SucessShooting) EState = EntityState.SHOOT;
            }
        }

        String ChangePressed = Greenfoot.getKey();
        if (ChangePressed != null)
        {
            Inventory.ChangeSlot(ChangePressed.equals("q") ? -1 : ChangePressed.equals("e") ? 1 : 0);
            getWorldOfType(UWorld.class).getBackground().drawImage(new GreenfootImage(
                "Current Weapon: " + Inventory.GetSlot(), 10, Color.WHITE, null 
            ), MaxHealth, Direction);
        }

        // Reset the state when shooting
        if (EState == EntityState.SHOOT && Animations.get(EntityState.SHOOT).IsFinished())
            EState = EntityState.IDLE;
    }

    @Override
    protected void HandleState()
    {
        // If the entity is died...no need to handle the state anymore
        if (EState == EntityState.DIE) return;

        int Speed = Math.abs(Movement.GetVelocity());
        
        if      (IsCrawling() != 0 && !IsOnGround() && IsCrawling() == Movement.GetDirection()) SetState(EntityState.CRAWLING);
        else if (Movement.IsFalling())                   SetState(EntityState.FALL);
        else if (Speed == 0)                             SetState(EntityState.IDLE);
        else if (0 < Speed && Speed <= WalkSpeed)        SetState(EntityState.WALK);
        else if (WalkSpeed < Speed && Speed <= RunSpeed) SetState(EntityState.RUN);
    }

    // ===== Interactions ========== //

    private Weapon OverlappingWeapon;

    private void SenseWeapon()
    {
        OverlappingWeapon = (Weapon)getOneIntersectingObject(Weapon.class);
    }

    // ----- Combat ---------- //

    private TimerHandle DieTimerHandle = new TimerHandle();
    private int         DieTimer       = 150;

    @Override
    protected void Die(DamageType Type)
    {
        if (EState == EntityState.DIE) return;

        super.Die(Type);

        Greenfoot.playSound("dead.wav");

        // Delay before showing the ending
        getWorldOfType(UWorld.class).GetTimerManager().StartTimer(DieTimerHandle, DieTimer, () -> {
            Ending(Type);
        });
    }

    private void Ending(DamageType Type)
    {
        String Path;

        switch (Type)
        {
            case GEAR:
                Path = "TornedUp";
                break;

            case FALL:
                Path = "Fallen";
                break;
                    
            case SPIKE:
                Path = "Spiked";
                break;

            case GHOST:
                Path = "Ghost";
                break;

            default:
                Path = "Gear";
                break;
        }

        Greenfoot.playSound("dead.wav");
        Greenfoot.setWorld(new TransitionWorld(new MainMenu(), Path, 200));
    }

    // ----- UI ---------- //

    private HealthHUD Health_HUD;

    private void ConstructHUD()
    {
        Health_HUD = new HealthHUD(this, "heart", 700, 75);
    }

    private void UpdateHUD()
    {
        Health_HUD.UpdateHealth(Health);
    }

    // ===== Modifiers ========== //

    public void SetDirection(int Value)
    {
        Movement.SetDirection(Value);
    }
}
