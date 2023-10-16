import greenfoot.GreenfootImage;

public class Level1 extends UWorld
{
    public Level1()
    {
        // real one
        // super(1000, 1000, 1, 800, 500);
        super(5000, 1000, 1, 800, 500);
        prepare();
    }
    
    private void prepare()
    {
        Player M_Player = new Player();
        SetPlayer(M_Player, 500, 500);
        M_Player.setLocation(20, 950);

        GreenfootImage bg = new GreenfootImage("images/Bg/bg1.png");
        SetScrollingBackground(bg);

        // Ground
        AddObject(new Ground("platform1", 2), 86,989);
        AddObject(new Ground("platform22", 2), 186,977);
        AddObject(new Ground("platform22", 2), 218,960);
        AddObject(new Ground("platform3", 2), 338,968);
        AddObject(new Ground("platform4", 2), 641,952);
        AddObject(new Ground("platform5", 2), 945,887);
        AddObject(new Ground("platform7", 2), 1344,749);        

        AddObject(new Ground("platform8", 2), 1077, 866);  
        AddObject(new Ground("platformj2", 2), 968, 761);              
        AddObject(new Ground("platformj3", 2), 1015, 731);             
        AddObject(new Ground("platformj4", 2), 918, 647);        
        AddObject(new Ground("platformj4", 2), 918, 597);        
        AddObject(new Ground("platformj4", 2), 918, 547);         
        AddObject(new Ground("platformj4", 2), 958, 622);        
        AddObject(new Ground("platformj4", 2), 958, 572);           

        AddObject(new Ground("platform9", 2), 873, 680);             
        AddObject(new Ground("platform9", 2), 815, 518);           
        AddObject(new Ground("platform10", 2), 737, 474);              
        AddObject(new Ground("platform7a", 2), 1344,488);               
        AddObject(new Ground("platform7a", 2), 1344,456);          
        AddObject(new Ground("platform7a", 2), 1344,436);        

   
        
        AddObject(new Ground("platformpinggir", 6.f, 160.f),  3, 899);
        AddObject(new Ground("platforma1", 2), 88,812);
        AddObject(new Ground("platforma2", 2), 165,812);
        AddObject(new Ground("platforma2", 2), 196,797);
        AddObject(new Ground("platforma2", 2), 227,782);
        addObject(new Ground("platforma3", 2), 347,768);
        addObject(new Ground("platforma4", 2), 480,744);
        addObject(new Ground("platforma5", 2), 556,721);
        addObject(new Ground("platforma6", 2), 659, 737);
        AddObject(new Ground("platformp2", 2), 712,644);
        AddObject(new Ground("platform8", 2), 750, 774);        
        AddObject(new Ground("platformp3", 2), 785, 782);        
        AddObject(new Ground("platformp3", 2), 785, 740);        

        AddObject(new Ground("platforma7", 2), 1037, 426);

        // // Environment
        // Environment door = new Environment("doorlocked", 1.2);
        // AddObject(door, 56, 955);

        AddObject(new Spike(false), 116, 974);
        AddObject(new Spike(false), 294, 921);
        AddObject(new Spike(false), 310, 921);

        AddObject(new Spike(false), 538, 888);
        AddObject(new Spike(false), 560, 888);        
        AddObject(new Spike(false), 575, 888);

        AddObject(new Shuriken(90, 5), 630, 800);



    }
}
;