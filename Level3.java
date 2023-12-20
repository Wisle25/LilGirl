import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends UWorld
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {
        // super(800, 600, 1, 8000, 6000);
        super(5000 + 1000, 600 + 1000 + 1000, 1, 2500, 1500);
        
        prepare();
    }
    
    public void prepare()
    {

        // Player
        Player M_Player = new Player();
        SetPlayer(M_Player, 300, 400);
        M_Player.setLocation(428, -589 + 1000 + 500);
        

        AddObject(new Decoration("pintuFinish", 0.85), 99, 454  + 1000 + 1000);
        // add object
        AddObject(new Ground("Level3/dinding", 0.9), 22, -1330 + 1000 + 1000);
        AddObject(new Ground("Level3/1", 0.9), 88, 549 + 1000 + 1000);
        AddObject(new Ground("Level3/2", 0.9), 1838, 449 + 1000 + 1000);
        AddObject(new Ground("Level3/1-3", 0.9), 1713, 483 + 1000 + 1000);
        AddObject(new Ground("Level3/ground", 0.9), 3700, 546 + 1000 + 1000);
        AddObject(new Ground("Level3/2-ground-2", 0.9), 2657, 10 + 1000 + 1000);
        AddObject(new Ground("Level3/2-ground-1", 0.9), 1240, 27 + 1000 + 1000);
        AddObject(new Ground("Level3/2-1", 0.9), 262, 135 + 1000 + 1000);
        AddObject(new Ground("Level3/2k-1", 0.9), 229, 268 + 1000 + 1000);
        AddObject(new Ground("Level3/2-3", 0.9), 620, 80 + 1000 + 1000);
        AddObject(new Ground("Level3/2-2", 0.9), 524, 96 + 1000 + 1000);
        
        AddObject(new Ground("Level3/j-2", 0.9), 3584, 475 + 1000 + 1000);
        AddObject(new Ground("Level3/j-3", 0.9), 3672, 367 + 1000 + 1000);
        AddObject(new Ground("Level3/j-4", 0.9), 3345, 77 + 1000 + 1000);
        AddObject(new Ground("Level3/j-1", 0.9), 3563, 297 + 1000 + 1000);
        AddObject(new Ground("Level3/j-2", 0.9), 3538, 124 + 1000 + 1000);
        AddObject(new Ground("Level3/j-4", 0.9), 3731, 200 + 1000 + 1000);       
        AddObject(new Ground("Level3/j-4", 0.9), 3991, 200 + 1000 + 1000);
        AddObject(new Ground("Level3/j-4", 0.9), 4261, 140 + 1000 + 1000);


        AddObject(new Ground("Level3/j-2", 0.9), 3584, 475 + 1000 + 1000);
        AddObject(new Ground("Level3/2-4", 0.9), 4884, 140 + 1000 + 1000);
        AddObject(new Ground("Level3/2-6", 0.9), 5165, -228 + 1000 + 1000);
        AddObject(new Ground("Level3/2-5", 0.9), 5344, -20 + 1000 + 1000);


        AddObject(new Ground("Level3/pipa", 0.9), 5344, -539 + 1000 + 1000);
        AddObject(new Ground("Level3/3-1", 0.9), 4919, -440 + 1000 + 1000);
        AddObject(new Ground("Level3/3-2", 0.9), 4280, -459 + 1000 + 1000);
        AddObject(new Ground("Level3/3-3", 0.9), 4190, -499 + 1000 + 1000);
        AddObject(new Ground("Level3/3-4", 0.9), 3976, -531 + 1000 + 1000);
        AddObject(new Ground("Level3/3-5", 0.9), 3886, -574 + 1000 + 1000);
        AddObject(new Ground("Level3/3-6", 0.9), 3551, -609 + 1000 + 1000);
        AddObject(new Ground("Level3/3-7", 0.9), 3533, -628 + 1000 + 1000);
        AddObject(new Ground("Level3/3-8", 0.9), 2700, -628 + 1000 + 1000);
        AddObject(new Ground("Level3/3-9", 0.9), 2202, -912 + 1000 + 1000);

        AddObject(new Ground("Level3/pipa", 0.9), 2502, -1000 + 1000 + 1000);

        AddObject(new Ground("Level3/j-1", 0.9), 3446, 13 + 1000 + 1000);
        AddObject(new Ground("Level3/j-1", 0.9), 3495, -101 + 1000 + 1000);
        AddObject(new Ground("Level3/j-1", 0.9), 3435, -191 + 1000 + 1000);
        AddObject(new Ground("Level3/j-1", 0.9), 3381, -296 + 1000 + 1000);
        AddObject(new Ground("Level3/j-1", 0.9), 3281, -396 + 1000 + 1000);
        AddObject(new Ground("Level3/j-1", 0.9), 3200, -496 + 1000 + 1000);
        AddObject(new Ground("Level3/j-1", 0.9), 3276, -596 + 1000 + 1000);

        AddObject(new Ground("Level3/pipa-2", 0.9), 347, -402 + 1000 + 1000);
        AddObject(new Ground("Level3/pipa-3", 0.9), 540, -373 + 1000 + 1000);
        AddObject(new Ground("Level3/j-4", 0.9), 627, -603 + 1000 + 1000);
        AddObject(new Ground("Level3/j-4", 0.9), 767, -603 + 1000 + 1000);
        AddObject(new Ground("Level3/j-1", 0.9), 645, -702 + 1000 + 1000);
       // checkpoint
        AddObject(new Ground("Level3/j-3", 0.9), 574, -783 + 1000 + 1000);
        AddObject(new Ground("Level3/j-3", 0.9), 485, -904 + 1000 + 1000);
        AddObject(new Ground("Level3/j-3", 0.9), 416, -1040 + 1000 + 1000);
        AddObject(new Ground("Level3/pipa-4", 0.9), 502, -1300 + 1000 + 1000);
        AddObject(new Ground("Level3/j-2", 0.9), 371, -1160 + 1000 + 1000);
        AddObject(new Ground("Level3/j-2", 0.9), 371, -1340 + 1000 + 1000);
        AddObject(new Ground("Level3/j-2", 0.9), 371, -1500 + 1000 + 1000);

        AddObject(new Ground("Level3/4-1", 0.9), 1800, -1500 + 1000 + 1000);
        AddObject(new Ground("Level3/4-2", 0.9), 1600, -1500 + 1000 + 1000);
        AddObject(new Ground("Level3/4-3", 0.9), 1400, -1500 + 1000 + 1000);
        AddObject(new Ground("Level3/4-4", 0.9), 1200, -1500 + 1000 + 1000);

        // AddObject(new Ground("Level3/2", 0.9), 265, 540  + 1000 + 1000);

        // Checkpoint   
        // AddObject(new Decoration("pintuFinish", 0.85), 122, 492  + 1000 + 1000);
        
        Checkpoint FinishCheckpoint = new Checkpoint("pintuFinish", 0.85 + 1000 + 1000);
        AddObject(FinishCheckpoint, 2862, -1201 + 1000 + 1000);
        FinishCheckpoint.OnArrived(() -> {
            Greenfoot.playSound("CloseDoor.wav");
            Greenfoot.setWorld(new TransitionWorld(new Level3(), "ToBeContinued", 100));
        });
        
        // Bg
        GreenfootImage bg = new GreenfootImage("images/Bg/bg1.png");
        SetScrollingBackground(bg);
    }
}
