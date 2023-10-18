import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends UWorld
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {
        // super(800, 600, 1, 5500, 1500);
        super(5000, 1800, 1, 2500, 1500);
        
        prepare();
    }
    
    public void prepare()
    {

        // Player
        Player M_Player = new Player();
        SetPlayer(M_Player, 300, 400);
        M_Player.setLocation(150, 500 + 1000);

        // Ground
        AddObject(new Ground("platform1"), 265, 566 + 1000);
        AddObject(new Ground("platform2"), 34, 406 + 1000);
        AddObject(new Ground("platform2"), 34, 300 + 1000);
        AddObject(new Ground("platform3"), 547, 546 + 1000);
        AddObject(new Ground("platform4"), 582, 528 + 1000);
        AddObject(new Ground("platform5"), 720, 510 + 1000);
        AddObject(new Ground("platform6"), 1181, 511 + 1000);
        AddObject(new Ground("platform7"), 1675, 333 + 1000);
        AddObject(new Ground("platform8"), 2063, 456 + 1000);
        AddObject(new Ground("platform4"), 2311, 420 + 1000);
        AddObject(new Ground("platform4"), 2347, 385 + 1000);
        AddObject(new Ground("platform9"), 2413, 437 + 1000);
        AddObject(new Ground("platformt3"), 2617, 296 + 1000);
        AddObject(new Ground("platformt2"), 2800, 296 + 1000);
        AddObject(new Ground("platformt1"), 2950, 296 + 1000);

        
        AddObject(new Ground("platforma1"), 262,194 + 1000);
        AddObject(new Ground("platforma2"), 471, 142 + 1000);
        AddObject(new Ground("platforma3"), 900, 89 + 1000);
        AddObject(new Ground("platforma4"), 1345, 162 + 1000);
        AddObject(new Ground("platforma4"), 1345, 250 + 1000);


        // Bg
        GreenfootImage bg = new GreenfootImage("images/Tiles/Level2/bg.png");
        SetScrollingBackground(bg);
    }
}
