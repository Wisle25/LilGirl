import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {   
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,255,93);
        Ground ground = new Ground();
        addObject(ground,259,303);
        Ground ground2 = new Ground();
        addObject(ground2,333,302);
        Ground ground3 = new Ground();
        addObject(ground3,331,302);
        Ground ground4 = new Ground();
        addObject(ground4,409,300);
        Ground ground5 = new Ground();
        addObject(ground5,485,301);
        Ground ground6 = new Ground();
        addObject(ground6,182,302);
        Ground ground7 = new Ground();
        addObject(ground7,105,300);
        Ground ground8 = new Ground();
        addObject(ground8,30,299);
        ground2.setLocation(386,219);
        ground3.setLocation(559,298);
        ground2.setLocation(329,303);
        ground2.setLocation(362,296);
        ground2.setLocation(309,297);
        Gear gear = new Gear();
        addObject(gear,379,82);
    }
}
