import java.util.ArrayList;
import java.util.List;

import greenfoot.*;

public class UWorld extends World
{
    // ----- Lifecycle ---------- //

    public UWorld(int wide, int high, int cellSize, int scrollWide, int scrollHigh)
    {
        super(cellSize == 1 ? wide:(wide/2)*2+1, cellSize == 1 ? high : (high/2)*2+1, cellSize, false);

        ScrollType = (scrollWide > wide ? 1 : 0)+(scrollHigh>high?2:0);
        ScrollingWidth = ScrollType%2 == 1 ? scrollWide : wide;
        ScrollingHeight = ScrollType/2 == 1 ? scrollHigh : high;

        ConstructManagers();
    }
    
    @Override
    public void act()
    {
        M_TimerManager.TickManager();

        ScrollObjects();
        ScrollBackground();
    }

    // ----- World ---------- //

    public void AddObject(Actor Object, int PositionX, int PositionY, boolean Scroller)
    {
        super.addObject(Object, PositionX, PositionY);

        if (Scroller) GenActors.add(Object);
    }

    public void AddObject(Actor Object, int PositionX, int PositionY)
    {
        AddObject(Object, PositionX, PositionY, true);
    }

    public void RemoveObject(Actor Object)
    {
        if (Object == null) return;

        if (Object.equals(MainActor)) MainActor = null;
        else GenActors.remove(Object);

        super.removeObject(Object);
    }

    // ----- Managers ---------- //

    private void ConstructManagers()
    {
        M_TimerManager = new TimerManager();
    }

    private TimerManager M_TimerManager;
    public  TimerManager GetTimerManager() { return M_TimerManager; }

    // ----- Camera Follow ---------- //

    private int ScrollingWidth, ScrollingHeight; // dimensions of scrolling area
    private int ActorMinX, ActorMaxX, ActorMinY, ActorMaxY; // limits for main actor within world coordinates
    private int ScrolledX, ScrolledY; // horizontal and vertical scrolled amounts
    private int ScrollType; // indicates scrolling directions (0=none, 1=horizontal, 2=vertical, 3=both)
    
    Actor MainActor = null; // the actor that always stays visible

    private List<Actor>    GenActors  = new ArrayList<>(); // lists all generic scrolling actor objects
    private GreenfootImage Background = null;

    public void SetPlayer(Player NewPlayer, int RangeX, int RangeY)
    {
        super.addObject(NewPlayer, getWidth()/2, getHeight()/2);
        MainActor = NewPlayer;

        RangeX = Math.min(RangeX, getWidth());
        RangeY = Math.min(RangeY, getHeight());

        ActorMinX = getWidth() / 2 - RangeX / 2;
        ActorMaxX = getWidth() / 2 + RangeX / 2;
        ActorMinY = getHeight() / 2 - RangeY / 2;
        ActorMaxY = getHeight() / 2 + RangeY / 2;
    }

    public void SetScrollingBackground(GreenfootImage ScrollingBackground)
    {
        if (MainActor == null)
        {
            System.out.println("Must be Set Player first!");

            return;
        }

        Background = new GreenfootImage(ScrollingBackground);
        Background.scale(ScrollingWidth*getCellSize(), ScrollingHeight*getCellSize());
        
        ScrollBackground();
    }

    private void ScrollBackground()
    {
        if (Background == null) return;

        int Width   = getWidth();
        int Height  = getHeight();
        int Cell    = getCellSize();
        int BWidth  = Background.getWidth(); 
        int BHeight = Background.getHeight();

        getBackground().drawImage(Background, (Width * Cell - BWidth) / 2 - ScrolledX * Cell, (Height * Cell - BHeight) / 2 - ScrolledY * Cell);
    }

    private void ScrollObjects()
    {
        if (MainActor == null) return;

        // determine how far the main actor is outside its standard window limits
        int Dx = 0;
        int Dy = 0;

        if (MainActor.getX() < ActorMinX) Dx = ActorMinX - MainActor.getX();
        if (MainActor.getX() > ActorMaxX) Dx = ActorMaxX - MainActor.getX();
        if (MainActor.getY() < ActorMinY) Dy = ActorMinY - MainActor.getY();
        if (MainActor.getY() > ActorMaxY) Dy = ActorMaxY - MainActor.getY();

        if (Dx == 0 && Dy == 0) return; // not outside window limits

        // hold changes in scroll amount
        int DxSum = Dx, DySum = Dy;

        // track scroll amount
        ScrolledX -= Dx; ScrolledY -= Dy;

        // move main actor back within standard window limits
        MainActor.setLocation(MainActor.getX()+Dx, MainActor.getY()+Dy);

        // determine how far the background is inside the world limits
        Dx=0; Dy=0;

        if (ScrolledX > ScrollingWidth/2-getWidth()/2) Dx = ScrolledX-(ScrollingWidth/2-getWidth()/2);
        if (ScrolledX < getWidth()/2-ScrollingWidth/2) Dx = ScrolledX-(getWidth()/2-ScrollingWidth/2);
        if (ScrolledY > ScrollingHeight/2-getHeight()/2) Dy = ScrolledY-(ScrollingHeight/2-getHeight()/2);
        if (ScrolledY < getHeight()/2-ScrollingHeight/2) Dy = ScrolledY-(getHeight()/2-ScrollingHeight/2);

        // ** background does not completely cover world limits
        DxSum += Dx; DySum += Dy; // keep running sum of changes in scroll amount
        ScrolledX -= Dx; ScrolledY -= Dy; // adjust scroll amount
        // move all objects so background covers the world
        MainActor.setLocation(MainActor.getX()+Dx, MainActor.getY()+Dy);

        for (Object obj : GenActors)
        {
            Actor actor = (Actor)obj;
            actor.setLocation(actor.getX()+DxSum, actor.getY()+DySum);
        }

        // determine how far main actor is outside universal limits
        Dx = 0; Dy = 0;
        if (MainActor.getX() < 0) Dx = 0-MainActor.getX();
        if (MainActor.getX() > getWidth()-1) Dx = (getWidth()-1)-MainActor.getX();
        if (MainActor.getY() < 0) Dy = 0-MainActor.getY();
        if (MainActor.getY() > getHeight()-1) Dy = (getHeight()-1)-MainActor.getY();
        if (Dx == 0 && Dy == 0) return;

        // move main actor back within world limits
        MainActor.setLocation(MainActor.getX()+Dx, MainActor.getY()+Dy);
    }
}
