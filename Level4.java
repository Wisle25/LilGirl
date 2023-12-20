import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends UWorld
{

    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {
        // super(800, 600, 1, 8000, 6000);
        super(5000 + 1000, 600 + 1000 + 1000 + 800, 1, 2500, 1500);
        
        prepare();
    }
    
    public void prepare()
    {

        // Player
        Player M_Player = new Player();
        SetPlayer(M_Player, 300, 400);
        M_Player.setLocation(2400, -800 + 1000 + 1000 + 800);

        // obstacles
   

        
        Checkpoint FinishCheckpoint = new Checkpoint("pintuFinish2", 0.85);
        AddObject(FinishCheckpoint, 4613, -2366 + 1000 + 1000 + 800);
        FinishCheckpoint.OnArrived(() -> {
            Greenfoot.playSound("CloseDoor.wav");
            Greenfoot.setWorld(new TransitionWorld(new Level4(), "ToBeContinued", 100));
        });
        
        // Bg
        GreenfootImage bg = new GreenfootImage("images/Bg/bg1.png");
        SetScrollingBackground(bg);
    }
}
