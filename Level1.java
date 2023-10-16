import greenfoot.GreenfootImage;

public class Level1 extends UWorld
{
    public Level1()
    {
        super(6000, 1000, 1, 1000, 1000);

        prepare();
    }
    
    private void prepare()
    {
        Player M_Player = new Player();
        SetPlayer(M_Player, 500, 500);
        M_Player.setLocation(120, 870);

        GreenfootImage bg = new GreenfootImage("images/Bg/bg1.png");
        SetScrollingBackground(bg);

        Platform2 platform2 = new Platform2();
        AddObject(platform2,313,947);

        PlatformTAngga platformTAngga = new PlatformTAngga();
        AddObject(platformTAngga,622,925);
        PlatformTAngga platformTAngga2 = new PlatformTAngga();
        AddObject(platformTAngga2,718,872);
        Platform3 platform3 = new Platform3();
        AddObject(platform3,1076,893);
        Platform4 platform4 = new Platform4();
        AddObject(platform4,1987,845);
        Platform5 platform5 = new Platform5();
        addObject(platform5,2904,654);
        Platform6 platform6 = new Platform6();
        addObject(platform6,3520,997);
        Platform7 platform7 = new Platform7();
        addObject(platform7,4098,237);
    }
}
;