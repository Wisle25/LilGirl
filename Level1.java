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
    }
}
;