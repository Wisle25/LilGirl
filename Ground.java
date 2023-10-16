public class Ground extends Environment
{
    private String TilesName;
    private int ScaleX;
    private int ScaleY;

    // ----- Lifecycle ---------- //

    public Ground()
    {
        // Default construction
    }

    public Ground(String TilesName, int Rotation, int ScaleX, int ScaleY)
    {
        String Path   = "/images/Tiles/";
        this.TilesName = TilesName;
        this.ScaleX = ScaleX;
        this.ScaleY = ScaleY; 

        setImage(Path + TilesName);
        getImage().scale(ScaleX, ScaleY);
        
        setRotation(Rotation);
    }

    public Ground(String TilesName, int ScaleX, int ScaleY)
    {
        String Path   = "/images/Tiles/";
        this.TilesName = TilesName;
        this.ScaleX = ScaleX;
        this.ScaleY = ScaleY; 

        setImage(Path + TilesName);
        getImage().scale(ScaleX, ScaleY);        
    }
}
