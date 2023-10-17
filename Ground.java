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

    public Ground(String TilesName, double Scale)
    {
        String Path   = "Tiles/";

        setImage(Path + TilesName + ".png");
        
        int newWidth = (int) (getImage().getWidth() / Scale);
        int newHeight = (int) (getImage().getHeight() / Scale);

        // Scale the image to the new size
        getImage().scale(newWidth, newHeight);  
    }

    public Ground(String TilesName, float ScaleX, float ScaleY)
    {
        String Path   = "Tiles/";

        setImage(Path + TilesName + ".png");
        getImage().scale((int)ScaleX, (int)ScaleY);            
    }
}
