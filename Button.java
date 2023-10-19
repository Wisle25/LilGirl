import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    // ===== Lifecycle ========== //

    public Button(String ActiveFileName, String HoverFileName)
    {
        this.ActiveImg = new GreenfootImage(ActiveFileName);
        this.HoverImg  = new GreenfootImage(HoverFileName);

        setImage(this.ActiveImg);
    }

    public void act()
    {
        ExecutePressed();
        ExecuteHover();
    }

    // ===== Properties ========== //

    GreenfootImage ActiveImg;
    GreenfootImage HoverImg;

    public void SetScale(double NewX, double NewY)
    {
        ActiveImg.scale((int)(ActiveImg.getWidth() * NewX), (int)(ActiveImg.getHeight() * NewY));
        HoverImg.scale((int)(HoverImg.getWidth() * NewX), (int)(HoverImg.getHeight() * NewY));
    }

    // ===== Event Detection ========== //

    public interface EventCallback
    {
        void Execute();
    }

    /* Hovering */
    EventCallback HoverCb;
    boolean bIsHovering = false;

    private void ExecuteHover()
    {
        if (Greenfoot.mouseMoved(this) && !bIsHovering)
        {
            setImage(HoverImg);
            bIsHovering = true;
    
            if (HoverCb != null) HoverCb.Execute();
        }
        else if (bIsHovering && Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            bIsHovering = false;
            setImage(ActiveImg);
        }
    }
    
    public void OnHover(EventCallback Callback)
    {
        HoverCb = Callback;
    }

    /* Pressing */
    EventCallback PressedCb;

    private void ExecutePressed()
    {
        if (!Greenfoot.mousePressed(this)) return;

        setImage(ActiveImg);

        if (PressedCb != null) PressedCb.Execute();
    }

    public void OnPressed(EventCallback Callback)
    {
        PressedCb = Callback;
    }
}
