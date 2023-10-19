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
        // super(800, 600, 1, 8000, 6000);
        super(5000, 1800, 1, 2500, 1500);
        
        prepare();
    }
    
    public void prepare()
    {

        // Player
        Player M_Player = new Player();
        SetPlayer(M_Player, 300, 400);
        M_Player.setLocation(3500, -100 + 1000);

        // Ground
        AddObject(new Ground("platform1"), 265, 566 + 1000 + 1000);
        AddObject(new Ground("platform2"), 34, 406 + 1000 + 1000);
        AddObject(new Ground("platform2"), 34, 300 + 1000 + 1000);
        AddObject(new Ground("platform3"), 547, 546 + 1000 + 1000);
        AddObject(new Ground("platform4"), 582, 528 + 1000 + 1000);
        AddObject(new Ground("platform5"), 720, 510 + 1000 + 1000);
        AddObject(new Ground("platform6"), 1181, 511 + 1000 + 1000);
        AddObject(new Ground("platform7"), 1675, 333 + 1000 + 1000);
        AddObject(new Ground("platform8"), 2063, 456 + 1000 + 1000);
        AddObject(new Ground("platform4"), 2311, 420 + 1000 + 1000);
        AddObject(new Ground("platform4"), 2347, 385 + 1000 + 1000);
        AddObject(new Ground("platform9"), 2413, 437 + 1000 + 1000);
        AddObject(new Ground("platformt3"), 2617, 296 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 2800, 296 + 1000 + 1000);
        AddObject(new Ground("platformt1"), 2950, 296 + 1000 + 1000);
        AddObject(new Ground("platformt3"), 3106, 296 + 1000 + 1000);
        AddObject(new Ground("platformt4"), 3228, 296 + 1000 + 1000);

        AddObject(new Ground("platformt2"), 3415, 238 + 1000 + 1000);
        AddObject(new Ground("platformt4"), 3523, 148 + 1000 + 1000);
        AddObject(new Ground("platformt4"), 3713, 81 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 3818, 81 + 1000 + 1000);
        AddObject(new Ground("platform12"), 3837, 203 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 3926, -32 + 1000 + 1000);
        AddObject(new Ground("platformp2"), 4361, -362 + 1000 + 1000);
        AddObject(new Ground("platforma11"), 3935, -605 + 1000 + 1000);
        AddObject(new Ground("platformp3"), 3685, -1064 + 1000 + 1000);
        AddObject(new Ground("platforma12"), 1520, -1313 + 1000 + 1000);
        AddObject(new Ground("platform2x1"), 1360, -1263 + 1000 + 1000);
        AddObject(new Ground("platform2x1"), 1680, -1364 + 1000 + 1000);
        AddObject(new Ground("platform2x1"), 1680, -1433 + 1000 + 1000);
        AddObject(new Ground("platformabgt"), 2657, -1485 + 1000 + 1000);
        AddObject(new Ground("platform12"), 1470, -882 + 1000 + 1000);
        AddObject(new Ground("platformt1"), 1503, -970 + 1000 + 1000);
        AddObject(new Ground("platform13"), 1718, -1004 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 1880, -1039 + 1000 + 1000);
        AddObject(new Ground("platformt1"), 1899, -1074 + 1000 + 1000);
        AddObject(new Ground("platforma7"), 1932, -1074 + 1000 + 1000);
        AddObject(new Ground("platform14"), 2019, -1127 + 1000 + 1000);
        AddObject(new Ground("platform13"), 2318, -1145 + 1000 + 1000);
        AddObject(new Ground("platformt1"), 2648, -1145 + 1000 + 1000);
        AddObject(new Ground("platformt4"), 2840, -1145 + 1000 + 1000);
        AddObject(new Ground("platformt4"), 2791, -961 + 1000 + 1000);
        AddObject(new Ground("platformt1"), 2684, -1063 + 1000 + 1000);
        AddObject(new Ground("platformt3"), 3459, -761 + 1000 + 1000);
        AddObject(new Ground("platformt3"), 3344, -873 + 1000 + 1000);
        AddObject(new Ground("platformt4"), 3563, -990 + 1000 + 1000);
        AddObject(new Ground("platformt1"), 3476, -990 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 3326, -1043 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 3289, -1078 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 3253, -1110 + 1000 + 1000);
        AddObject(new Ground("platform15"), 3112, -1145 + 1000 + 1000);
        AddObject(new Ground("platformt3"), 2932, -1027 + 1000 + 1000);
        AddObject(new Ground("platform12"), 2894, -1265 + 1000 + 1000);
        AddObject(new Ground("platform12"), 2894, -1398 + 1000 + 1000);

        AddObject(new Ground("platform10"), 3653, 523 + 1000 + 1000);
        AddObject(new Ground("platform11"), 4200, 185 + 1000 + 1000);

        
        AddObject(new Ground("platforma1"), 262,194 + 1000 + 1000);
        AddObject(new Ground("platforma2"), 471, 142 + 1000 + 1000);
        AddObject(new Ground("platforma3"), 900, 89 + 1000 + 1000);
        AddObject(new Ground("platforma4"), 1345, 162 + 1000 + 1000);
        AddObject(new Ground("platforma4"), 1345, 250 + 1000 + 1000);
        AddObject(new Ground("platforma5"), 1362, -47 + 1000 + 1000);
        AddObject(new Ground("platformp1"), 1326, -733 + 1000 + 1000);
        AddObject(new Ground("platforma9"), 1767, -622 + 1000 + 1000);
        AddObject(new Ground("platforma10"), 1820, -588 + 1000 + 1000);
        AddObject(new Ground("platform2x1"), 2209, -588 + 1000 + 1000);
        AddObject(new Ground("platform2x1"), 2243, -552 + 1000 + 1000);
        AddObject(new Ground("platform2x1"), 2275, -516 + 1000 + 1000);
        AddObject(new Ground("platform2x1"), 2309, -480 + 1000 + 1000);
        AddObject(new Ground("platformt1"), 2341, -462 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 2433, -396 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 2905, -396 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 2939, -432 + 1000 + 1000);

        AddObject(new Ground("platformt2"), 2965, -504 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 3001, -537 + 1000 + 1000);
        AddObject(new Ground("platformt2"),3029, -571 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 3064, -606 + 1000 + 1000);

        AddObject(new Ground("platforma9"), 3489, -622 + 1000 + 1000);
        AddObject(new Ground("platforma6"), 1929, -184 + 1000 + 1000);
        AddObject(new Ground("platforma7"), 2566, -255 + 1000 + 1000);
        AddObject(new Ground("platforma8"), 2689, -307 + 1000 + 1000);

        AddObject(new Ground("platformt1"), 2812, -289 + 1000 + 1000);
        AddObject(new Ground("platforma1"), 2954, -255 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 2954, -255 + 1000 + 1000);
        AddObject(new Ground("platformt4"), 2954, -255 + 1000 + 1000);
        AddObject(new Ground("platformt4"), 2954, -255 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 2954, -255 + 1000 + 1000);
        AddObject(new Ground("platform4x4"), 3429, -200 + 1000 + 1000);
        AddObject(new Ground("platforma1"), 3237, -255 + 1000 + 1000);
        AddObject(new Ground("platformt2"), 3499, -183 + 1000 + 1000);
        AddObject(new Ground("platform4x4"), 3499, -170 + 1000 + 1000);
  


        AddObject(new Ground("platform3x2"), 3429, -220 + 1000 + 1000);
        AddObject(new Ground("platformt1"), 3480, -220 + 1000 + 1000);
        AddObject(new Ground("platforma1"), 3659, -142 + 1000 + 1000);

        // Bg
        GreenfootImage bg = new GreenfootImage("images/Tiles/Level2/bg.png");
        SetScrollingBackground(bg);
    }
}
