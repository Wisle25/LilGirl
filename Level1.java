import greenfoot.GreenfootImage;

public class Level1 extends UWorld
{
    public Level1()
    {
        // real one
        // super(800, 600, 1, 5500, 1500);        
        super(5000, 1800, 1, 2500, 1500);

        // super(5000, 1000, 1, 800, 500);
        prepare();
    }
    
    private void prepare()
    {
        // Decoration & Jendela ground
        Decoration door = new Decoration("doorlocked", 0.85);
        AddObject(door, 76, 518 + 900);

        AddObject(new Decoration("torch", 0.85), 134, 462 + 900);         
        AddObject(new Ground("kendi", 0.8), 346, 540 + 900);       
      
        AddObject(new Decoration("torch"), 440, 397 + 900);          
        AddObject(new Ground("box", 0.8), 516, 467 + 900);       
        
        AddObject(new Decoration("jendela", 0.85), 706, 352 + 900);
        AddObject(new Ground("JENDELAT", 0.85), 706, 379 + 900);
        AddObject(new Decoration("torch", 0.85), 755, 365 + 900);
        AddObject(new Ground("box", 0.8), 918, 430 + 900);       
        AddObject(new Decoration("jendela", 0.85), 930, 352 + 900);
        AddObject(new Ground("JENDELAT", 0.85), 930, 379 + 900);
        
        AddObject(new Decoration("jendela", 0.85), 1161, 268 + 900);
        AddObject(new Ground("JENDELAT", 0.85), 1161, 300 + 900);
        
        AddObject(new Decoration("jendela", 0.85), 1295, 268 + 900);
        AddObject(new Ground("JENDELAT", 0.85), 1295, 300 + 900);

        AddObject(new Ground("pintuFinish", 0.85), 1737, -411 + 900);

        AddObject(new Decoration("jendela", 0.85), 2000, 15 + 900);
        AddObject(new Ground("JENDELAT", 0.85), 2000, 47 + 900);
        AddObject(new Decoration("jendela", 0.85), 2422, 17 + 900);
        AddObject(new Ground("JENDELAT", 0.85), 2422, 49 + 900);

        // AddObject(new Gear(), getHeight(), getCellSize());

        // Player
        Player M_Player = new Player();
        SetPlayer(M_Player, 700, 400);
        M_Player.setLocation(2300, 30 + 900);

        // BG
        GreenfootImage bg = new GreenfootImage("images/Bg/bg1.png");
        SetScrollingBackground(bg);

        
        
        // Obsctacles 
        AddObject(new Spike(false), 237, 544 + 900);
        

        AddObject(new Spike(), 733, 432 + 900);
        AddObject(new Spike(), 700, 432 + 900);

        AddObject(new Spike(false), 1154, 361 + 900);
        AddObject(new Spike(false), 1229, 361 + 900);        
        AddObject(new Spike(false), 1304, 361 + 900);
        AddObject(new Spike(false), 1691, 189+ 900);
        AddObject(new Spike(false), 1640, 189+ 900);        
        AddObject(new Spike(false), 2392, 297+ 900);



        AddObject(new STrow(90, 5), 1489, 189 + 900);

        AddObject(new STrow(90, 5), 1815, 30 + 900);
        AddObject(new STrow(90, 5), 2149, -504 + 900);
        AddObject(new STrow(90, 5), 2193, -328 + 900);
        AddObject(new STrow(0, 5), 1745, -199 + 900);
        AddObject(new STrow(180, 5), 2658, -354 + 900);



        Spike Spikemv1 = new Spike(true);        

        Spikemv1.SetDefaultLocation(2334, -137 + 900);        
        AddObject(Spikemv1, 2334, -137 + 900);

        // Ground
        AddObject(new Ground("platform1", 0.9), 86 + 110, 489 + 86 + 900);
        AddObject(new Ground("platform22", 0.9), 427,555 + 900);
        AddObject(new Ground("platform22", 0.9), 497,518 + 900);
        AddObject(new Ground("platform3", 0.9), 764,534 + 900);
        AddObject(new Ground("platform4", 0.9), 1439,498 + 900);
        AddObject(new Ground("platform5", 0.9), 2117,356 + 900);
        AddObject(new Ground("platformj4", 0.9), 2522,253 + 900);   
        AddObject(new Ground("platformj4", 0.9), 2570,175 + 900);   
        AddObject(new Ground("platformj4", 0.9), 2489,81 + 900);   
        AddObject(new Ground("platform8", 0.9), 2414, 489 + 900);        
        AddObject(new Ground("platform7", 0.9), 2989,49 + 900);   
        
        
        
        // AddObject(new Ground("platformj2", 0.9), 2412, 315 + 900);  
        AddObject(new Ground("platformj2", 0.9), 2112, 31 + 900);          
        AddObject(new Ground("platformj2", 0.9), 1663, 209 + 900);              
        
        AddObject(new Ground("platformj3", 0.9), 2232, -28 + 900);    
        AddObject(new Ground("platformj2", 0.9), 2364, -119 + 900);             
        
        AddObject(new Ground("platformj4", 0.9), 2256, -233 + 900);         
        AddObject(new Ground("platformj4", 0.9), 2245, -370 + 900);        
        AddObject(new Ground("platformj4", 0.9), 2180, -410 + 900);           
        
        AddObject(new Ground("platformj2", 0.9), 1800, -148 + 900);        
        AddObject(new Ground("platformj2", 0.9), 1941, -148 + 900);              
        AddObject(new Ground("platformj2", 0.9), 2082, -148 + 900);  
                    
      
        // AddObject(new Ground("platform9", 0.9), 1802, -366 + 900);       
        
        AddObject(new Ground("platformj2", 0.9), 1778, -361 + 900);        
        AddObject(new Ground("platformj2", 0.9), 1919, -361 + 900);              
        AddObject(new Ground("platformj2", 0.9), 2060, -361 + 900);  

        // AddObject(new Ground("platform9", 0.9), 2598, -317 + 900);

        AddObject(new Ground("platformj3", 0.9), 2353, -317 + 900); 
        AddObject(new Ground("platformj2", 0.9), 2438, -317 + 900);        
        AddObject(new Ground("platformj2", 0.9), 2579, -317 + 900);              
        AddObject(new Ground("platformj2", 0.9), 2720, -317 + 900); 

        
        AddObject(new Ground("platform10", 0.9), 1629, -451 + 900);              
        AddObject(new Ground("platform7a", 0.9), 2989, -504 + 900);               

        AddObject(new Ground("platformpinggir", 0.75),  6, 428 + 900);
        AddObject(new Ground("platforma1", 0.9), 195,286 + 900);
        AddObject(new Ground("platforma2", 0.9), 433,252 + 900);
        AddObject(new Ground("platforma2", 0.9), 501,218 + 900);
        AddObject(new Ground("platforma2", 0.9), 363,286 + 900);
        AddObject(new Ground("platforma3", 0.9), 765, 184 + 900);
        AddObject(new Ground("platforma4", 0.9), 1061, 133 + 900);
        AddObject(new Ground("platforma5", 0.9), 1230, 81 + 900);
        AddObject(new Ground("platforma6", 0.9), 1458, 116 + 900);
        AddObject(new Ground("platformp2", 0.9), 1574,-88 + 900);
        AddObject(new Ground("platformp3", 0.9), 1739, 133 + 900);        
        AddObject(new Ground("platformp3", 0.9), 1739, -10 + 900);        

        AddObject(new Ground("platforma7", 0.9), 2295, -556 + 900);

        
        
    }
}
