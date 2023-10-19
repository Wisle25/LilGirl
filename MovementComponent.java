import greenfoot.Actor;

public class MovementComponent  
{
    // ----- GameFramework ----- //

    private Entity EntityOwner;

    // ----- Lifecycle ---------- //

    public MovementComponent(Entity ActorOwner)
    {
        this.EntityOwner = ActorOwner;
        VelocityX = VelocityY = 0;
    }

    public void TickComponent()
    {
        HandleCollision();
        Falling(); /* Same as simulating gravity */
        HandleDeceleration();
        CreateCoyoteTimer();
    }

    // ----- Movement ---------- //

    private int VelocityX;
    private int VelocityY;
    private int MaxSpeed;
    private int Direction;

    private int Acceleration;
    private int Deceleration;
    private int JumpStrength;
    private int FallDistance = 0;

    private TimerHandle CoyoteTimerHandle = new TimerHandle();
    private int CoyoteTimer = 2;
    private boolean WasOnGround = false;
    private boolean bIsJumping   = false;

    /* Use this instead of "move" to move an entity */
    public void AddVelocity(int Factor)
    {
        Direction     = Factor;
        VelocityX = VelocityX + Acceleration * Direction;

        // Clamping the velocity if it reaches the MaxSpeed
        if (VelocityX >= MaxSpeed)  VelocityX = MaxSpeed;
        if (VelocityX <= -MaxSpeed) VelocityX = -MaxSpeed;

        EntityOwner.setLocation(EntityOwner.getX() + VelocityX, EntityOwner.getY());
    }

    /* Returning boolean to see is the jumping success */
    public boolean Jump()
    {      
        if (CanJump())
        {
            VelocityY = JumpStrength;
            EntityOwner.setLocation(EntityOwner.getX(), EntityOwner.getY() + VelocityY);

            bIsJumping = true;

            return true;
        }
        
        if (EntityOwner.StateEqualTo(EntityState.CRAWLING) && (Direction != EntityOwner.IsCrawling())) // Wall Jump
        {
            VelocityY = JumpStrength;
            VelocityX = 20 * Direction;

            EntityOwner.setLocation(EntityOwner.getX() + VelocityX, EntityOwner.getY() + VelocityY);
            bIsJumping = true;

            return true;
        }

        return false;
    }

    public boolean CanJump()
    {
        if (bIsJumping) return false;

        UWorld World = EntityOwner.getWorldOfType(UWorld.class);

        boolean CoyoteTime = !World.GetTimerManager().IsTimerFinished(CoyoteTimerHandle);

        // Remove the coyote timer so the coyote won't be triggered in the next jump request
        if (CoyoteTime) World.GetTimerManager().ClearTimer(CoyoteTimerHandle);

        boolean Coyote   = CoyoteTime;
        boolean bCanJump = EntityOwner.IsOnGround() ? true : Coyote;

        return bCanJump;
    }

    // ----- Handler ---------- //

    private boolean bIsFalling = false;
    private final int FallingFactor = 2; /* Basically its as same as Gravity */

    private void Falling()
    {
        if (EntityOwner.StateEqualTo(EntityState.CRAWLING))
        {
            // Constant velocity
            final int ConstVal = 2;
            VelocityY          = ConstVal;
            bIsJumping         = false;
            FallDistance       = 0;
            
            EntityOwner.setLocation(EntityOwner.getX(), EntityOwner.getY() + VelocityY);
        }
        // Only simulating when entity is not touching the ground
        else if (!EntityOwner.IsOnGround())
        {
            EntityOwner.setLocation(EntityOwner.getX(), EntityOwner.getY() + VelocityY);

            bIsFalling = true;
            VelocityY  = VelocityY + FallingFactor <= 20 ? VelocityY + FallingFactor : 20;
            FallDistance += VelocityY;
        }
        else if (EntityOwner.IsOnGround() && bIsFalling)
        {   
            // Fix the landing position
            Actor Ground = EntityOwner.GetGround();
            EntityOwner.setLocation(EntityOwner.getX(), Ground.getY() - (Ground.getImage().getHeight() + EntityOwner.getImage().getHeight()) / 2);

            // Apply fall damage if so
            if (FallDistance > 160)
                EntityOwner.ReceiveDamage((int)((FallDistance + 7600) / 160.f));

            VelocityY    = 0;
            FallDistance = 0;
            WasOnGround  = true;
            bIsFalling   = false;
            bIsJumping   = false;
        }
    }

    private void HandleDeceleration()
    {
        if (VelocityX > 0)
        {
            VelocityX -= Deceleration;

            if (VelocityX < 0) VelocityX = 0;
        }
        else if (VelocityX < 0)
        {
            VelocityX += Deceleration;
            if (VelocityX > 0) VelocityX = 0;
        }
    }

    private void HandleCollision()
    {
        while (EntityOwner.CheckAbove()) 
        {
            EntityOwner.setLocation(EntityOwner.getX(), EntityOwner.getY() + 1);
            VelocityY = 0;
        }

        while (EntityOwner.CheckRight())
        {
            EntityOwner.setLocation(EntityOwner.getX() - 1, EntityOwner.getY());
            VelocityX = 0;
        }

        while (EntityOwner.CheckLeft())
        {
            EntityOwner.setLocation(EntityOwner.getX() + 1, EntityOwner.getY());
            VelocityX = 0;
        }
    }

    private void CreateCoyoteTimer()
    {
        if (WasOnGround && !EntityOwner.IsOnGround())
        {
            WasOnGround  = false;
            UWorld World = EntityOwner.getWorldOfType(UWorld.class);

            World.GetTimerManager().StartTimer(CoyoteTimerHandle, CoyoteTimer);
        }
    }

    // ----- Accessors ---------- //

    public boolean IsMaxSpeedEqual(int Value) { return MaxSpeed == Value; } 
    public boolean IsFalling()       { return bIsFalling; }
    public int     GetVelocity()     { return VelocityX; }
    public int     GetDirection()    { return Direction; }

    // ----- Modifiers ---------- //

    public void SetAcceleration(int Value) { Acceleration = Value; }
    public void SetDeceleration(int Value) { Deceleration = Value; }
    public void SetMaxSpeed    (int Value) { MaxSpeed     = Value; }
    public void SetJumpStrength(int Value) { JumpStrength = -Value; }
}
