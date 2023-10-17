import greenfoot.GreenfootImage;

public class Level1 extends UWorld
{
    public Level1()
    {
        // real one
        super(1260, 800, 1, 2500, 1500);
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
        AddObject(new Ground("platform1", 1), 86,489);
        AddObject(new Ground("platform22", 1), 186,477);
        AddObject(new Ground("platform22", 1), 218,460);
        AddObject(new Ground("platform3", 1), 338,468);
        AddObject(new Ground("platform4", 1), 641,452);
        AddObject(new Ground("platform5", 1), 945,387);
        AddObject(new Ground("platform7", 1), 1344,249);        

        AddObject(new Ground("platform8", 1), 1077, 366);  
        AddObject(new Ground("platformj2", 1), 968, 261);              
        AddObject(new Ground("platformj3", 1), 1015, 231);             
        AddObject(new Ground("platformj4", 1), 918, 147);        
        AddObject(new Ground("platformj4", 1), 918, 97);        
        AddObject(new Ground("platformj4", 1), 918, 47);         
        AddObject(new Ground("platformj4", 1), 958, 122);        
        AddObject(new Ground("platformj4", 1), 958, 72);           

        AddObject(new Ground("platform9", 1), 873, 180);             
        AddObject(new Ground("platform9", 1), 815, 18);           
        AddObject(new Ground("platform10", 1), 737, -74);              
        AddObject(new Ground("platform7a", 1), 1344, -88);               
        AddObject(new Ground("platform7a", 1), 1344, -56);          
        AddObject(new Ground("platform7a", 1), 1344, -36);        

        AddObject(new Ground("platformpinggir", 6.f, 160.f),  3, 399);
        AddObject(new Ground("platforma1", 1), 88,312);
        AddObject(new Ground("platforma2", 1), 165,312);
        AddObject(new Ground("platforma2", 1), 196,297);
        AddObject(new Ground("platforma2", 1), 227,282);
        AddObject(new Ground("platforma3", 1), 347, 268);
        AddObject(new Ground("platforma4", 1), 480, 244);
        AddObject(new Ground("platforma5", 1), 556, 221);
        AddObject(new Ground("platforma6", 1), 659, 237);
        AddObject(new Ground("platformp2", 1), 712,144);
        AddObject(new Ground("platform8", 1), 750, 274);        
        AddObject(new Ground("platformp3", 1), 785, 282);        
        AddObject(new Ground("platformp3", 1), 785, 240);        

        AddObject(new Ground("platforma7", 1), 1037, -26);

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
