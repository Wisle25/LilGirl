public class Level1 extends UWorld
{
    public Level1()
    {
        super(6000, 1000, 1, 100, 100);

        prepare();
    }
    
    private void prepare()
    {

        Player M_Player = new Player();
        SetPlayer(M_Player, 500, 500);
        M_Player.setLocation(120, 870);

        Platform1 platform1 = new Platform1();
        AddObject(platform1,230,920);
        Platform1 platform12 = new Platform1();
        AddObject(platform12,454,920);
        Platform2 platform13 = new Platform2(90);
        AddObject(platform13,558,880);
        Platform1 platform14 = new Platform1(); 
        AddObject(platform14,662,840);
        Spike spike = new Spike();
        addObject(spike,399,895);
        STrow sTrow = new STrow(0, 5);
        addObject(sTrow,642,784);
    }
}
;