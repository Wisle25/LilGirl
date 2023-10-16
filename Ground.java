public class Ground extends Environment
{

    // ----- Lifecycle ---------- //

    public Ground()
    {
        // Default construction
    }

    public Ground(String TilesName, int Rotation, int ScaleX, int ScaleY)
    {
        String Path   = "/images/Tiles/";

        setImage(Path + TilesName);
        getImage().scale(ScaleX, ScaleY);
        
        setRotation(Rotation);
    }

    public Ground(String TilesName, int ScaleX, int ScaleY)
    {
        String Path   = "/images/Tiles/";

        setImage(Path + TilesName);
        getImage().scale(ScaleX, ScaleY);        
    }
}
