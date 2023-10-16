public class Ground extends Environment
{

    // ----- Lifecycle ---------- //

    public Ground()
    {
        // Default construction
    }

    public Ground(String TilesName, int Rotation, int ScaleX, int ScaleY)
    {
        String Path   = "Tiles/";

        setImage(Path + TilesName + ".png");
        getImage().scale(getImage().getWidth() / ScaleX, getImage().getHeight() / ScaleY);
        
        setRotation(Rotation);
    }

    public Ground(String TilesName, int ScaleX, int ScaleY)
    {
        String Path   = "Tiles/";

        setImage(Path + TilesName + ".png");
        getImage().scale(getImage().getWidth() / ScaleX, getImage().getHeight() / ScaleY);        
    }
}
