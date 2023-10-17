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
        Falling(); /* Same as simulating gravity */
        HandleDeceleration();
        HandleCollision();
        CreateCoyoteTimer();
    }

    // ----- Movement ---------- //

    private int VelocityX;
    private int VelocityY;
    private int MaxSpeed;
    private int Delta;

    private int Acceleration;
    private int Deceleration;
    private int JumpStrength;

    private int CoyoteTimer = 7;
    private boolean WasOnGround = false;

    /* Use this instead of "move" to move an entity */
    public void AddVelocity(int Factor)
    {
        Delta     = Factor;
        VelocityX = VelocityX + Acceleration * Delta;

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

            return true;
        }
        else if (EntityOwner.StateEqualTo(EntityState.CRAWLING) && Delta != EntityOwner.IsCrawling()) // Wall Jump
        {
            VelocityY = JumpStrength;
            VelocityX = 20 * Delta;

            EntityOwner.setLocation(EntityOwner.getX() + VelocityX, EntityOwner.getY() + VelocityY);

            return true;
        }

        return false;
    }

    public boolean CanJump()
    {
        UWorld World = EntityOwner.getWorldOfType(UWorld.class);

        boolean Coyote   = !World.GetTimerManager().IsTimerFinished("CoyoteTimer") && WasOnGround; 
        boolean bCanJump = EntityOwner.IsOnGround() ? true : Coyote;

        return bCanJump;
    }

    // ----- Handler ---------- //

    private boolean bIsFalling = false;
    private final int FallingFactor = 2; /* Basically its as same as Gravity */

    private void Falling()
    {
        // Only simulating when entity is not touching the ground
        if (EntityOwner.IsCrawling() != 0 && !EntityOwner.IsOnGround())
        {
            // Constant velocity
            final int ConstVal = 2;
            VelocityY          = ConstVal;

            EntityOwner.setLocation(EntityOwner.getX(), EntityOwner.getY() + VelocityY);
        }
        else if (!EntityOwner.IsOnGround())
        {
            EntityOwner.setLocation(EntityOwner.getX(), EntityOwner.getY() + VelocityY);

            bIsFalling = true;
            VelocityY += FallingFactor;
        }
        else if (EntityOwner.IsOnGround() && bIsFalling)
        {   
            // Fix the landing position
            Actor Ground = EntityOwner.GetGround();
            EntityOwner.setLocation(EntityOwner.getX(), Ground.getY() - (Ground.getImage().getHeight() + EntityOwner.getImage().getHeight() - 5) / 2);

            VelocityY   = 0;
            WasOnGround = true;
            bIsFalling  = false;
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
            EntityOwner.setLocation(EntityOwner.getX(), EntityOwner.getY()+1);
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

            World.GetTimerManager().StartTimer("CoyoteTimer", CoyoteTimer);
        }
    }

    // ----- Accessors ---------- //

    public boolean IsMaxSpeedEqual(int Value) { return MaxSpeed == Value; } 
    public boolean IsFalling()       { return bIsFalling; }
    public int     GetVelocity()     { return VelocityX; }

    // ----- Modifiers ---------- //

    public void SetAcceleration(int Value) { Acceleration = Value; }
    public void SetDeceleration(int Value) { Deceleration = Value; }
    public void SetMaxSpeed    (int Value) { MaxSpeed     = Value; }
    public void SetJumpStrength(int Value) { JumpStrength = -Value; }
}
