import greenfoot.GreenfootImage;

public class Level1 extends UWorld
{
    public Level1()
    {
        // real one
        super(800, 600, 1, 5500, 2500);        
        // super(5000, 1800, 1, 2500, 1500);

        prepare();

        super.act();
    }
    
    private void prepare()
    {
        // Decoration & Jendela ground
        Decoration door = new Decoration("doorlocked", 0.85);
        AddObject(door, 76, 518);

        AddObject(new Decoration("torch", 0.85), 134, 462);         
        AddObject(new Ground("kendi", 0.8), 346, 540);       

        AddObject(new Decoration("torch"), 440, 397);          
        AddObject(new Ground("box", 0.8), 516, 467);       

        AddObject(new Decoration("jendela", 0.85), 706, 352);
        AddObject(new Ground("jendelat", 0.85), 706, 379);
        AddObject(new Decoration("torch", 0.85), 755, 365);
        AddObject(new Decoration("box", 0.8), 918, 430);       
        AddObject(new Decoration("jendela", 0.85), 900, 320);
        AddObject(new Ground("jendelat", 0.85), 900, 347);

        AddObject(new Decoration("jendela", 0.85), 1161, 268);
        AddObject(new Ground("jendelat", 0.85), 1161, 300);

        AddObject(new Decoration("jendela", 0.85), 1295, 268);
        AddObject(new Ground("jendelat", 0.85), 1295, 300);

        AddObject(new Ground("pintuFinish", 0.85), 1737, -411);

        AddObject(new Decoration("jendela", 0.85), 2000, 0);
        AddObject(new Ground("jendelat", 0.85), 2000, 32);
        AddObject(new Decoration("jendela", 0.85), 2211, 15);
        AddObject(new Decoration("jendela", 0.85), 2422, 17);
        AddObject(new Ground("jendelat", 0.85), 2422, 49);
        AddObject(new Ground("box2", 0.85), 2127, 2);

        AddObject(new Decoration("jendela", 0.85), 1812, -242); 
        AddObject(new Ground("box", 0.85), 1747, -168);
        AddObject(new Ground("box2", 0.85), 2585, -342);
        AddObject(new Ground("kendi", 0.85), 2560, -342);

        AddObject(new Decoration("jendela", 0.85), 2000, -242);
        AddObject(new Decoration("jendelat", 0.85), 2000, -210);

        AddObject(new Decoration("jendela", 0.85), 2174, -242);
        AddObject(new Ground("jendelat", 0.85),  2174, -210);
        AddObject(new Decoration("jendela", 0.85), 1825, -460);
        AddObject(new Decoration("kurungan", 0.85), 1925, -505);

        // AddObject(new Gear(), getHeight(), getCellSize());

        // Player
        Player M_Player = new Player();
        SetPlayer(M_Player, 300, 400);
        M_Player.setLocation(70, 525);

        // BG
        GreenfootImage bg = new GreenfootImage("images/Bg/bg1.png");
        SetScrollingBackground(bg);

        // Obsctacles 
        AddObject(new Spike(), 237, 544);

        AddObject(new Spike(), 733, 432);
        AddObject(new Spike(), 700, 432);

        AddObject(new Spike(), 1154, 361);
        AddObject(new Spike(), 1229, 361);        
        AddObject(new Spike(), 1304, 361);
        AddObject(new Spike(), 1691, 189);
        AddObject(new Spike(), 1640, 189);        
        AddObject(new Spike(), 2398, 297);

        AddObject(new STrow(90, 5), 1489, 189);

        AddObject(new STrow(90, 5), 1815, 30);
        AddObject(new STrow(0, 5), 2003, -402);
        AddObject(new STrow(90, 5), 2193, -328);
        AddObject(new STrow(0, 5), 1745, -199);
        AddObject(new STrow(180, 5), 2500, -354);

        AddObject(new Spike(), 2334, -137);

        // Ground
        AddObject(new Ground("platform1", 0.9), 86 + 110, 489 + 86);
        AddObject(new Ground("platform22", 0.9), 427,555);
        AddObject(new Ground("platform22", 0.9), 497,518);
        AddObject(new Ground("platform3", 0.9), 764,534);
        AddObject(new Ground("platform4", 0.9), 1439,498);
        AddObject(new Ground("platform5", 0.9), 2117,356);
        AddObject(new Ground("platformj4", 0.9), 2522,253);   
        AddObject(new Ground("platformj4", 0.9), 2570,175);   
        AddObject(new Ground("platformj4", 0.9), 2489,81);   
        AddObject(new Ground("platform8", 0.9), 2414, 489);        
        AddObject(new Ground("platform7", 0.9), 2989,49);   

        // AddObject(new Ground("platformj2", 0.9), 2412, 315);  
        AddObject(new Ground("platformj2", 0.9), 2112, 31);          
        AddObject(new Ground("platformj2", 0.9), 1663, 209);              

        AddObject(new Ground("platformj3", 0.9), 2232, -28);    
        AddObject(new Ground("platformj2", 0.9), 2364, -119);             

        AddObject(new Ground("platformj4", 0.9), 2256, -233);         
        AddObject(new Ground("platformj4", 0.9), 2245, -370);        
        AddObject(new Ground("platformj4", 0.9), 2180, -410);           

        AddObject(new Ground("platformj2", 0.9), 1800, -148);        
        AddObject(new Ground("platformj2", 0.9), 1941, -148);              
        AddObject(new Ground("platformj2", 0.9), 2082, -148);  

        // AddObject(new Ground("platform9", 0.9), 1802, -366);       
        AddObject(new Ground("platformj2", 0.9), 1778, -361);        
        AddObject(new Ground("platformj2", 0.9), 1919, -361);              
        AddObject(new Ground("platformj2", 0.9), 2060, -361);  

        // AddObject(new Ground("platform9", 0.9), 2598, -317);

        AddObject(new Ground("platformj3", 0.9), 2353, -317); 
        AddObject(new Ground("platformj2", 0.9), 2438, -317);        
        AddObject(new Ground("platformj2", 0.9), 2579, -317);              
        AddObject(new Ground("platformj2", 0.9), 2720, -317); 

        AddObject(new Ground("platform10", 0.9), 1629, -451);              
        AddObject(new Ground("platform7a", 0.9), 2989, -504);               

        AddObject(new Ground("platformpinggir", 0.75),  6, 428);
        AddObject(new Ground("platforma1", 0.9), 195,286);
        AddObject(new Ground("platforma2", 0.9), 433,252);
        AddObject(new Ground("platforma2", 0.9), 501,218);
        AddObject(new Ground("platforma2", 0.9), 363,286);
        AddObject(new Ground("platforma3", 0.9), 765, 184);
        AddObject(new Ground("platforma4", 0.9), 1061, 133);
        AddObject(new Ground("platforma5", 0.9), 1230, 81);
        AddObject(new Ground("platforma6", 0.9), 1458, 116);
        AddObject(new Ground("platformp2", 0.9), 1574,-88);
        AddObject(new Ground("platformp3", 0.9), 1739, 133);        
        AddObject(new Ground("platformp3", 0.9), 1739, -10);        

        AddObject(new Ground("platforma7", 0.9), 2295, -556);

        
    }
}
