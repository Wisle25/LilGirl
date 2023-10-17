import greenfoot.GreenfootImage;

public class Level1 extends UWorld
{
    public Level1()
    {
        // real one
        super(800, 600, 1, 5500, 1500);        
        // super(5000, 1800, 1, 2500, 1500);

        // super(5000, 1000, 1, 800, 500);
        prepare();
    }
    
    private void prepare()
    {
        Player M_Player = new Player();
        SetPlayer(M_Player, 700, 400);
        M_Player.setLocation(50, 500);

        GreenfootImage bg = new GreenfootImage("images/Bg/bg1.png");
        SetScrollingBackground(bg);

        // Ground
        AddObject(new Ground("platform1", 0.9), 86 + 110, 489 + 86);
        AddObject(new Ground("platform22", 0.9), 427,555);
        AddObject(new Ground("platform22", 0.9), 497,518);
        AddObject(new Ground("platform3", 0.9), 764,534);
        AddObject(new Ground("platform4", 0.9), 1439,498);
        AddObject(new Ground("platform5", 0.9), 2117,356);
        AddObject(new Ground("platform7", 0.9), 2989,49);        

        AddObject(new Ground("platform8", 0.9), 2416, 308);  
        AddObject(new Ground("platformj2", 0.9), 2112, 31);              
        AddObject(new Ground("platformj3", 0.9), 2232, -47);             
        AddObject(new Ground("platformj4", 0.9), 2180, -192);        
        AddObject(new Ground("platformj4", 0.9), 2320, -268);        
        AddObject(new Ground("platformj4", 0.9), 2250, -228);         
        AddObject(new Ground("platformj4", 0.9), 2250, -370);        
        AddObject(new Ground("platformj4", 0.9), 2180, -410);           

        AddObject(new Ground("platform9", 0.9), 1935, -154);              
        AddObject(new Ground("platform9", 0.9), 1802, -366);           
        AddObject(new Ground("platform9", 0.9), 2598, -317);             
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
        AddObject(new Ground("platform8", 0.9), 1665, 203);        
        AddObject(new Ground("platformp3", 0.9), 1739, 133);        
        AddObject(new Ground("platformp3", 0.9), 1739, -10);        

        AddObject(new Ground("platforma7", 0.9), 2295, -556);

        // // Environment
        // Environment door = new Environment("doorlocked", 1.2);
        // AddObject(door, 56, 955);

        AddObject(new Spike(false), 116, 474);
        AddObject(new Spike(false), 294, 421);
        AddObject(new Spike(false), 310, 421);

        AddObject(new Spike(false), 538, 388);
        AddObject(new Spike(false), 560, 388);        
        AddObject(new Spike(false), 575, 388);
        AddObject(new STrow(90, 5), 654, 269);
    }
}
