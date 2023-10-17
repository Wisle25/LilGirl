import greenfoot.Actor;

public class Widget extends Actor
{
    // ----- Lifecycle ---------- //

    public Widget(Actor InOwner, String IconName, int InX, int InY)
    {
        X           = InX;
        Y           = InY;
        Owner       = InOwner;
        String Path = "images/Icon/";

        setImage(Path + IconName + ".png");
    }

    // ----- GameFramework ---------- //

    private Actor Owner;

    // ----- UI ---------- //

    int X, Y;

    public void AddText(String Text, int OffsetX, int OffsetY)
    {
        // If not added to world yet      
        if (Owner.getWorld().getObjects(this.getClass()).size() == 0)
            Owner.getWorld().addObject(this, X, Y);

        Owner.getWorld().showText(Text, getX() + OffsetX, getY() + OffsetY);
    }
}
