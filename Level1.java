import greenfoot.GreenfootImage;

public class Level1 extends UWorld
{
    public Level1()
    {
        // real one
        // super(800, 600, 1, 2500, 1500);        
        super(2000, 600, 1, 2500, 1500);

        // super(5000, 1000, 1, 800, 500);
        prepare();
    }
    
    private void prepare()
    {
        Player M_Player = new Player();
        SetPlayer(M_Player, 600, 100);
        M_Player.setLocation(20, 460);

        GreenfootImage bg = new GreenfootImage("images/Bg/bg1.png");
        SetScrollingBackground(bg);

        // Ground
        AddObject(new Ground("platform1", 0.9), 86 + 110,489 + 86);
        AddObject(new Ground("platform22", 0.9), 427,555);
        AddObject(new Ground("platform22", 0.9), 497,518);
        AddObject(new Ground("platform3", 0.9), 764,534);
        AddObject(new Ground("platform4", 0.9), 641 + 110,452 + 86);
        AddObject(new Ground("platform5", 0.9), 945 + 110,387 + 86);
        AddObject(new Ground("platform7", 0.9), 1344 + 110,249 + 86);        

        AddObject(new Ground("platform8", 0.9), 1077 + 110, 366);  
        AddObject(new Ground("platformj2", 0.9), 968 + 110, 261);              
        AddObject(new Ground("platformj3", 0.9), 1015 + 110, 231);             
        AddObject(new Ground("platformj4", 0.9), 918 + 110, 147);        
        AddObject(new Ground("platformj4", 0.9), 918 + 110, 97);        
        AddObject(new Ground("platformj4", 0.9), 918 + 110, 47);         
        AddObject(new Ground("platformj4", 0.9), 958 + 110, 122);        
        AddObject(new Ground("platformj4", 0.9), 958 + 110, 72);           

        AddObject(new Ground("platform9", 0.9), 873, 180);             
        AddObject(new Ground("platform9", 0.9), 815, 18);           
        AddObject(new Ground("platform10", 0.9), 737, -74);              
        AddObject(new Ground("platform7a", 0.9), 1344, -88);               
        AddObject(new Ground("platform7a", 0.9), 1344, -56);          
        AddObject(new Ground("platform7a", 0.9), 1344, -36);        

        AddObject(new Ground("platformpinggir", 0.9),  3, 399);
        AddObject(new Ground("platforma1", 0.9), 88,312);
        AddObject(new Ground("platforma2", 0.9), 165,312);
        AddObject(new Ground("platforma2", 0.9), 196,297);
        AddObject(new Ground("platforma2", 0.9), 227,282);
        AddObject(new Ground("platforma3", 0.9), 347, 268);
        AddObject(new Ground("platforma4", 0.9), 480, 244);
        AddObject(new Ground("platforma5", 0.9), 556, 221);
        AddObject(new Ground("platforma6", 0.9), 659, 237);
        AddObject(new Ground("platformp2", 0.9), 712,144);
        AddObject(new Ground("platform8", 0.9), 750, 274);        
        AddObject(new Ground("platformp3", 0.9), 785, 282);        
        AddObject(new Ground("platformp3", 0.9), 785, 240);        

        AddObject(new Ground("platforma7", 0.9), 1037, -26);

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
