public class Ground extends Environment
{

    // ----- Lifecycle ---------- //

    public Ground()
    {
        // Default construction
    }

    public Ground(String TilesName, int Rotation, int Scale)
    {
        String Path   = "Tiles/";

        setImage(Path + TilesName + ".png");
        getImage().scale(getImage().getWidth() / Scale, getImage().getHeight() / Scale);
        
        setRotation(Rotation);
    }

    public Ground(String TilesName, int Scale)
    {
        String Path   = "Tiles/";

        setImage(Path + TilesName + ".png");
        getImage().scale(getImage().getWidth() / Scale, getImage().getHeight() / Scale);        
    }

    public Ground(String TilesName, float ScaleX, float ScaleY)
    {
        String Path   = "Tiles/";

        setImage(Path + TilesName + ".png");
        getImage().scale((int)ScaleX, (int)ScaleY);            
    }
}
