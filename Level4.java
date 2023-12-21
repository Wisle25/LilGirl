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
        super(5000 + 1000, 600 + 1000 + 500, 1, 2500, 1500);
        
        prepare();
    }
    
    public void prepare()
    {

        // Player
        Player M_Player = new Player();
        SetPlayer(M_Player, 300, 400);
        M_Player.setLocation(130, 437 + 1000 + 500);

        AddObject(new Weapon("Kapak", 0.8, 8, 15, 500, 50), 180, 437 + 1000 + 500);


        // obstacles
        AddObject(new Pocong(), 882, 458 + 1000 + 500);
        AddObject(new Kunti(), 1082, 458 + 1000 + 500);
        AddObject(new Jalangkung(), 1282, 458 + 1000 + 500);
        AddObject(new Jalangkung(), 1482, 458 + 1000 + 500);

        AddObject(new Kunti(), 1171, -268 + 1000 + 500);
        AddObject(new Pocong(), 1071, -268 + 1000 + 500);
        AddObject(new Jalangkung(), 971, -268 + 1000 + 500);
        AddObject(new Kunti(), 871, -268 + 1000 + 500);
        AddObject(new Jalangkung(), 771, -268 + 1000 + 500);
        AddObject(new Pocong(), 671, -268 + 1000 + 500);
        AddObject(new Jalangkung(), 571, -268 + 1000 + 500);
        
        AddObject(new Jalangkung(), 1121, -786 + 1000 + 500);
        AddObject(new Pocong(), 1321, -786 + 1000 + 500);
        AddObject(new Kunti(), 1521, -786 + 1000 + 500);
        AddObject(new Jalangkung(), 1721, -786 + 1000 + 500);
        AddObject(new Jalangkung(), 1921, -786 + 1000 + 500);

        
        AddObject(new Kunti(), 2121, -786 + 1000 + 500);
        AddObject(new Kunti(), 2321, -786 + 1000 + 500);
        AddObject(new Jalangkung(), 2521, -786 + 1000 + 500);
        AddObject(new Jalangkung(), 2721, -786 + 1000 + 500);
        AddObject(new Pocong(), 2921, -786 + 1000 + 500);;

        AddObject(new Kunti(), 3121, -786 + 1000 + 500);
        AddObject(new Pocong(), 3321, -786 + 1000 + 500);
        AddObject(new Jalangkung(), 3521, -786 + 1000 + 500);
        AddObject(new Pocong(), 3721, -786 + 1000 + 500);
        AddObject(new Kunti(), 3921, -786 + 1000 + 500);

        AddObject(new Kunti(), 4121, -786 + 1000 + 500);
        AddObject(new Kunti(), 4321, -786 + 1000 + 500);
        AddObject(new Pocong(), 4521, -786 + 1000 + 500);
        AddObject(new Pocong(), 4721, -786 + 1000 + 500);
        AddObject(new Kunti(), 4921, -786 + 1000 + 500);

        AddObject(new Weapon("Shuriken", 60, 16, 15, 500, 25), 1484, -268 + 1000 + 500);
        AddObject(new Weapon("Botol", 20, 30, 15, 500, 10), 1084, -268 + 1000 + 500);

        AddObject(new Web(), 1730, -770 + 1000 + 500);
        AddObject(new Web(), 1780, -770 + 1000 + 500);
        AddObject(new Web(), 1830, -770 + 1000 + 500);
        AddObject(new Web(), 3280, -770 + 1000 + 500);
        AddObject(new Web(), 3330, -770 + 1000 + 500);
        AddObject(new Web(), 4700, -770 + 1000 + 500);
        AddObject(new Gear(), 1281, -955 + 1000 + 500);
        AddObject(new STrow(60, 5), 1480, -1200 + 1000 + 500);
        AddObject(new STrow(90, 5), 1520, -1200 + 1000 + 500);
        AddObject(new STrow(120, 5), 1560, -1200 + 1000 + 500);

        
        AddObject(new STrow(60, 5), 1880, -1200 + 1000 + 500);
        AddObject(new STrow(90, 5), 1920, -1200 + 1000 + 500);
        AddObject(new STrow(120, 5), 1960, -1200 + 1000 + 500);


        AddObject(new STrow(60, 5), 2480, -1200 + 1000 + 500);
        AddObject(new STrow(90, 5), 2520, -1200 + 1000 + 500);
        AddObject(new STrow(120, 5), 2560, -1200 + 1000 + 500);

        AddObject(new STrow(60, 5), 2880, -1200 + 1000 + 500);
        AddObject(new STrow(90, 5), 2920, -1200 + 1000 + 500);
        AddObject(new STrow(120, 5), 2960, -1200 + 1000 + 500);

        AddObject(new STrow(60, 5), 3480, -1200 + 1000 + 500);
        AddObject(new STrow(90, 5), 3520, -1200 + 1000 + 500);
        AddObject(new STrow(120, 5), 3560, -1200 + 1000 + 500);

        AddObject(new STrow(60, 5), 3880, -1200 + 1000 + 500);
        AddObject(new STrow(90, 5), 3920, -1200 + 1000 + 500);
        AddObject(new STrow(120, 5), 3960, -1200 + 1000 + 500);

        AddObject(new STrow(60, 5), 4480, -1200 + 1000 + 500);
        AddObject(new STrow(90, 5), 4520, -1200 + 1000 + 500);
        AddObject(new STrow(120, 5), 4560, -1200 + 1000 + 500);

        AddObject(new STrow(60, 5), 4880, -1200 + 1000 + 500);
        AddObject(new STrow(90, 5), 4920, -1200 + 1000 + 500);
        AddObject(new STrow(120, 5), 4960, -1200 + 1000 + 500);
        // object
        AddObject(new Ground("Level4/1-1", 0.9), 881, 544 + 1000 + 500);
        AddObject(new Ground("Level4/dinding", 0.9), 15, 348 + 1000 + 500);
        AddObject(new Ground("Level4/1-2", 0.9), 1751, -61 + 1000 + 500);
        AddObject(new Ground("Level4/1-3", 0.9), 1580, 97 + 1000 + 500);
        AddObject(new Ground("Level4/1-4", 0.9), 782, -60 + 1000 + 500);
        AddObject(new Ground("Level4/dinding-1", 0.9), 34, -729 + 1000 + 500);
        AddObject(new Ground("Level4/2-1", 0.9), 2961, -684 + 1000 + 500);
        AddObject(new Ground("Level4/j-2", 0.9), 230, -737 + 1000 + 500);
        AddObject(new Ground("Level4/j-2", 0.9), 230, -737 + 1000 + 500);
        AddObject(new Ground("Level4/atap-1", 0.9), 2701, -1231 + 1000 + 500);
        AddObject(new Ground("Level4/2-2", 0.9), 5382, -1035 + 1000 + 500);
        AddObject(new Ground("Level4/2-3", 0.9), 5542, -969 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 1077, -860 + 1000 + 500);

        AddObject(new Weapon("Kapak", 0.8, 6, 15, 500, 50), 1077, -915 + 1000 + 500);

        AddObject(new Ground("Level4/j-2", 0.9), 1208, -922 + 1000 + 500);
        AddObject(new Ground("Level4/j-4", 0.9), 1380, -981 + 1000 + 500);

        AddObject(new Ground("Level4/j-1", 0.9), 1575, -945 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 1700, -995 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 1900, -965 + 1000 + 500);

        AddObject(new Weapon("Botol", 20, 20, 15, 500, 10), 1900, -1020 + 1000 + 500);

        AddObject(new Ground("Level4/j-1", 0.9), 2100, -925 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 2300, -975 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 2500, -915 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 2700, -985 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 2900, -1005 + 1000 + 500);

        AddObject(new Weapon("Shuriken", 60, 20, 15, 500, 25), 2900, -1005 -55 + 1000 + 500);

        AddObject(new Ground("Level4/j-1", 0.9), 3100, -965 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 3300, -865 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 3500, -965 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 3700, -965 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 3900, -1005 + 1000 + 500);
        AddObject(new Weapon("Shuriken", 60, 20, 15, 500, 25), 3900, -1005 -55 + 1000 + 500);

        AddObject(new Ground("Level4/j-1", 0.9), 4100, -925 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 4300, -1000 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 4500, -955 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 4700, -800 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 4900, -900 + 1000 + 500);
        AddObject(new Ground("Level4/j-1", 0.9), 5100, -1005 + 1000 + 500);

        AddObject(new Ground("Level4/j-2", 0.9), 1562, -237 + 1000 + 500);

        AddObject(new Decoration("pintuFinish", 0.85), 84, 454 + 1000 + 500);
        // AddObject(new Decoration("pintuFinish", 0.85), 99, 454  + 1000 + 1000 + 800 + 500); // start
        
        Checkpoint FinishCheckpoint = new Checkpoint("pintuFinish2", 0.85);
        AddObject(FinishCheckpoint, 4613, -2366 + 1000);
        FinishCheckpoint.OnArrived(() -> {
            Greenfoot.playSound("CloseDoor.wav");
            Greenfoot.setWorld(new TransitionWorld(new MainMenu(), "ToBeContinued", 100));
        });
        
        // Bg
        GreenfootImage bg = new GreenfootImage("images/Tiles/Level4/Bg3.png");
        bg.scale(4000, 4000);
        SetScrollingBackground(bg);
    }
}
