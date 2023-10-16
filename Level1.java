import greenfoot.GreenfootImage;

public class Level1 extends UWorld
{
    public Level1()
    {
        super(3000, 1000, 1, 1000, 1000);

        prepare();
    }
    
    private void prepare()
    {
        Player M_Player = new Player();
        SetPlayer(M_Player, 500, 500);
        M_Player.setLocation(120, 870);

        GreenfootImage bg = new GreenfootImage("images/Bg/bg1.png");
        SetScrollingBackground(bg);

        AddObject(new Ground("platform1", 2, 2), 313,947);
        AddObject(new Ground("platform22", 2, 2), 622,925);
        AddObject(new Ground("platform22", 2, 2), 718,872);
        AddObject(new Ground("platform3", 2, 2), 1076,893);
        AddObject(new Ground("platform4", 2, 2), 1987,845);
        AddObject(new Ground("platform5", 2, 2), 2904,654);
        AddObject(new Ground("platform66", 2, 2), 3520,997);
        AddObject(new Ground("platform7", 2, 2), 4098,237);
        AddObject(new Ground("platformpinggir", 2, 2),  54, 776);
        AddObject(new Ground("platforma1", 2, 2), 311,611);
        AddObject(new Ground("platforma2", 2, 2), 539,612);
        AddObject(new Ground("platforma2", 2, 2), 633,565);
        AddObject(new Ground("platforma2", 2, 2), 727,518);
        addObject(new Ground("platforma3", 2, 2), 1085,470);
        addObject(new Ground("platforma4", 2, 2), 1485,400);
        addObject(new Ground("platforma5", 2, 2), 1728,330);
        addObject(new Ground("platforma6", 2, 2), 2039, 377);
    }
}
;