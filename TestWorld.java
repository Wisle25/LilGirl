/**
 * Write a description of class LevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestWorld extends UWorld
{

    /**
     * Constructor for objects of class LevelOne.
     * 
     */
    public TestWorld()
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

        Gear gear = new Gear();
        AddObject(gear,368,695);

        Platform1 platform1 = new Platform1();
        AddObject(platform1,132,851);

        Platform1 platform2 = new Platform1();
        AddObject(platform2,264,851);

        AddObject(new STrow(0, 10), 264, 820);
    }
}
