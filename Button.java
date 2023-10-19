import greenfoot.Actor;
import greenfoot.Greenfoot;

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
        this.ActiveFileName = ActiveFileName;
        this.HoverFileName  = HoverFileName;

        setImage(this.ActiveFileName);
    }

    public void act()
    {
        ExecutePressed();
        ExecuteHover();
    }

    // ===== Properties ========== //

    String ActiveFileName;
    String HoverFileName;

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
            setImage(HoverFileName);
            bIsHovering = true;
    
            if (HoverCb != null) HoverCb.Execute();
        }
        else if (bIsHovering && Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            bIsHovering = false;
            setImage(ActiveFileName);
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

        setImage(ActiveFileName);

        if (PressedCb != null) PressedCb.Execute();
    }

    public void OnPressed(EventCallback Callback)
    {
        PressedCb = Callback;
    }
}
