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
        super(800, 600, 1, 8000, 6000);
        // super(5000 + 1000, 600 + 1000 + 1000 + 800, 1, 2500, 1500);
        
        prepare();
    }
    
    public void prepare()
    {

        // Player
        Player M_Player = new Player();
        SetPlayer(M_Player, 300, 400);
        M_Player.setLocation(2400, -800 + 1000 + 1000 + 800);


        // obstacles
        AddObject(new Gear(), 228, 486 + 1000 + 1000 + 800);
        AddObject(new STrow(90, 5), 521, 238 + 1000 + 1000 + 800 );

        AddObject(new Log(), 1046, 419 + 1000 + 1000 + 800);
        
        AddObject(new Spike(), 3685, 340 + 1000 + 1000 + 800);
        AddObject(new Log(), 3381, -373 + 1000 + 1000 + 800);
        AddObject(new Gear(), 3303, -547 + 1000 + 1000 + 800);

        AddObject(new STrow(60, 5), 5200, -345 + 1000 + 1000 + 800 );
        AddObject(new STrow(110, 5), 5315, -345 + 1000 + 1000 + 800 );
        AddObject(new Spike(), 2872, -32 + 1000 + 1000 + 800);
        AddObject(new Spike(), 2947, -32 + 1000 + 1000 + 800);
        AddObject(new Log(), 2695, -99 + 1000 + 1000 + 800);
        AddObject(new Log(), 2595, -99 + 1000 + 1000 + 800);
        AddObject(new Log(), 2495, -99 + 1000 + 1000 + 800);
        AddObject(new STrow(180, 5), 780, -656 + 1000 + 1000 + 800 );
        AddObject(new Gear(), 393, -1098 + 1000 + 1000 + 800);
        AddObject(new Gear(), 410, -1550 + 1000 + 1000 + 800);
        AddObject(new Spike(), 955, -1595 + 1000 + 1000 + 800);
        AddObject(new Gear(), 1744, -2079 + 1000 + 1000 + 800);
        AddObject(new STrow(90, 5), 2282, -1263 + 1000 + 1000 + 800 );
        AddObject(new Log(), 1527, -1532 + 1000 + 1000 + 800);
        AddObject(new STrow(90, 5), 2402, -1570 + 1000 + 1000 + 800 );
        AddObject(new STrow(90, 5), 2402, -1206 + 1000 + 1000 + 800 );
        AddObject(new Spike(), 4648, -507 + 1000 + 1000 + 800);
        AddObject(new Web(), 4303, -552 + 1000 + 1000 + 800);
        AddObject(new Web(), 3782, -647 + 1000 + 1000 + 800);
        AddObject(new Log(), 3243, -792 + 1000 + 1000 + 800);
        AddObject(new Spike(), 1955, -2130 + 1000 + 1000 + 800);
        AddObject(new Spike(), 2095, -2130 + 1000 + 1000 + 800);
        AddObject(new Spike(), 2235, -2130 + 1000 + 1000 + 800);
        AddObject(new Spike(), 2375, -2130 + 1000 + 1000 + 800);
        AddObject(new Gear(), 3580, -2257 + 1000 + 1000 + 800);

        
        AddObject(new Decoration("pintuFinish", 0.85), 99, 454  + 1000 + 1000 + 800); // start
        // add object
        AddObject(new Ground("Level3/dinding", 0.9), 22, -1330 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/1", 0.9), 88, 549 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/2", 0.9), 1838, 449 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/1-3", 0.9), 1713, 483 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/ground", 0.9), 3700, 546 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/2-ground-2", 0.9), 2657, 10 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/2-ground-1", 0.9), 1240, 27 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/2-1", 0.9), 262, 135 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/2k-1", 0.9), 229, 268 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/2-3", 0.9), 620, 80 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/2-2", 0.9), 524, 96 + 1000 + 1000 + 800);
        
        AddObject(new Ground("Level3/j-2", 0.9), 3584, 475 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-3", 0.9), 3672, 367 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-4", 0.9), 3345, 77 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 3563, 297 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-2", 0.9), 3538, 124 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-4", 0.9), 3731, 200 + 1000 + 1000 + 800);       
        AddObject(new Ground("Level3/j-4", 0.9), 3991, 200 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-4", 0.9), 4261, 140 + 1000 + 1000 + 800);


        AddObject(new Ground("Level3/j-2", 0.9), 3584, 475 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/2-4", 0.9), 4884, 140 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/2-6", 0.9), 5165, -228 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/2-5", 0.9), 5344, -20 + 1000 + 1000 + 800);


        AddObject(new Ground("Level3/pipa", 0.9), 5344, -539 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/3-1", 0.9), 4919, -440 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/3-2", 0.9), 4280, -459 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/3-3", 0.9), 4190, -499 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/3-4", 0.9), 3976, -531 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/3-5", 0.9), 3886, -574 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/3-6", 0.9), 3551, -609 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/3-7", 0.9), 3533, -628 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/3-8", 0.9), 2700, -628 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/3-9", 0.9), 2202, -912 + 1000 + 1000 + 800);

        AddObject(new Ground("Level3/pipa-5", 0.9), 2348, -1150 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/pipa", 0.9), 2348, -1381 + 1000 + 1000 + 800);

        AddObject(new Ground("Level3/j-1", 0.9), 3446, 13 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 3495, -101 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 3435, -191 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 3381, -296 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 3281, -396 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 3200, -496 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 3276, -596 + 1000 + 1000 + 800);

        AddObject(new Ground("Level3/j-1", 0.9), 2400, -800 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 2400, -920 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 2400, -1040 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 2400, -1160 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 2400, -1280 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 2400, -1400 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 2400, -1520 + 1000 + 1000 + 800);


        AddObject(new Ground("Level3/pipa-2", 0.9), 347, -402 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/pipa-3", 0.9), 540, -373 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-4", 0.9), 627, -603 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-4", 0.9), 767, -603 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 645, -702 + 1000 + 1000 + 800);
       // checkpoint
        AddObject(new Ground("Level3/j-3", 0.9), 574, -783 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-3", 0.9), 485, -904 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-3", 0.9), 416, -1040 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/4-3", 0.9), 1178, -1329 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/4-4", 0.9), 983, -1407 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/pipa-4", 0.9), 502, -1300 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-2", 0.9), 371, -1160 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-2", 0.9), 371, -1340 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-2", 0.9), 371, -1500 + 1000 + 1000 + 800);

        AddObject(new Ground("Level3/4-1", 0.9), 1862, -1197 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/4-2", 0.9), 1562, -1235 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-2", 0.9), 1562, -1372 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/5-1", 0.9), 1943, -1481 - 90 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/5-2", 0.9), 1564, -1522 - 90 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/5-3", 0.9), 1391, -1566 - 90 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/5-4", 0.9), 1356, -1587 - 90 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/5-5", 0.9), 1285, -1623 - 90 + 1000 + 1000 + 800);

        AddObject(new Ground("Level3/j-4", 0.9), 923, -1479 - 90 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-4", 0.9), 1078, -1577 - 90 + 1000 + 1000 + 800);

        AddObject(new Ground("Level3/j-1", 0.9), 1285, -1823 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-1", 0.9), 1339, -1917 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-4", 0.9), 1439, -2000 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-4", 0.9), 1639, -2030 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/6-1", 0.9), 3229, -2067 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/6-2", 0.9), 1790, -2031 + 1000 + 1000 + 800);

        AddObject(new Ground("Level3/6-3", 0.9), 3746, -2241 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/6-4", 0.9), 4279, -2222 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/pipalg", 0.9), 3870, -2392 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/pipa-l", 0.9), 4722, -2470 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/atap", 0.9), 1780, -2700 + 1000 + 1000 + 800);

        AddObject(new Ground("Level3/j-2", 0.9), 3530, -2218 + 1000 + 1000 + 800);
        AddObject(new Ground("Level3/j-2", 0.9), 3599, -2299 + 1000 + 1000 + 800);


   

        // Checkpoint   
        // AddObject(new Decoration("pintuFinish", 0.85), 122, 492  + 1000 + 1000 + 800);
        
        Checkpoint FinishCheckpoint = new Checkpoint("pintuFinish2", 0.85);
        AddObject(FinishCheckpoint, 4613, -2366 + 1000 + 1000 + 800);
        FinishCheckpoint.OnArrived(() -> {
            Greenfoot.playSound("CloseDoor.wav");
            Greenfoot.setWorld(new TransitionWorld(new Level4(), "ToBeContinued", 100));
        });
        
        // Bg
        GreenfootImage bg = new GreenfootImage("images/Tiles/Level4/Bg3.png");
        SetScrollingBackground(bg);
    }
}
