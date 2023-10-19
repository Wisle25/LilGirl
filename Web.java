public class Web extends Environment
{
    // ===== Lifecycle ========== //

    public void act()
    {
        SlowFalling();
    }

    // ===== Mechanics ========== //

    private void SlowFalling()
    {
        Player MPlayer = (Player)getOneIntersectingObject(Player.class);

        if (MPlayer != null)
            MPlayer.SetState(EntityState.CRAWLING);
    }
}