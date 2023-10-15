import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends UWorld
{

    /**
     * Constructor for objects of class LevelOne.
     * 
     */
    public LevelOne()
    {
        super(1080, 1080, 1, 5000, 1000);

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        SetPlayer(player, 500, 500);
        player.setLocation(40, 800);

        Spike spike = new Spike(true);
        AddObject(spike, 732, 836);
        spike.SetDefaultLocation(732, 836);

        Ground ground = new Ground();
        AddObject(ground,275,610);
        Ground ground2 = new Ground();
        AddObject(ground2,381,610);
        Ground ground3 = new Ground();
        AddObject(ground3,487,610);
        Ground ground4 = new Ground();
        AddObject(ground4,593,611);
        Ground ground5 = new Ground();
        AddObject(ground5,700,612);
        Ground ground6 = new Ground();
        AddObject(ground6,807,613);
        Ground ground7 = new Ground();
        AddObject(ground7,913,613);
        Ground ground8 = new Ground();
        AddObject(ground8,1020,613);
        Ground ground9 = new Ground();
        AddObject(ground9,1127,613);
        Ground ground10 = new Ground();
        AddObject(ground10,1234,613);
        Ground ground11 = new Ground();
        AddObject(ground11,1709,909);
        Ground ground12 = new Ground();
        AddObject(ground12,1833,909);
        ground3.setLocation(272,899);
        ground4.setLocation(378,899);
        ground5.setLocation(471,899);
        ground.setLocation(73,908);
        ground2.setLocation(147,908);
        ground12.setLocation(1814,912);
        ground6.setLocation(719,902);
        ground7.setLocation(957,902);
        ground8.setLocation(1212,897);
        ground9.setLocation(1404,897);
        ground10.setLocation(1537,902);
        ground8.setLocation(1180,882);
        Ground ground13 = new Ground();
        AddObject(ground13,1249,891);
        ground8.setLocation(1143,893);
        ground13.setLocation(1249,891);
        
        Gear gear = new Gear();
        AddObject(gear,368,695);
    }
}
