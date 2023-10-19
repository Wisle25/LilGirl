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

    public Web(String TilesName)
    {
        String Path   = "Tiles/Level2/";

        setImage(Path + TilesName + ".png");
        
        int newWidth = (int) (getImage().getWidth() / 0.85);
        int newHeight = (int) (getImage().getHeight() / 0.85);

        // Scale the image to the new size
        getImage().scale(newWidth, newHeight);  
    }
}