import greenfoot.Actor;

/**
 * This class is as same as Environment but it wont block Entity's movement
 * 
 * @author Handi Dwi Cahyo, Farelly Theo A., Hajid Lutfi H. 
 * @version (a version number or a date)
 */
public class Decoration extends Actor
{
    // ----- Lifecycle ---------- //

    public Decoration()
    {
        // Default construction
    }

    public Decoration(String TilesName, int Rotation, int Scale)
    {
        String Path   = "Tiles/";

        setImage(Path + TilesName + ".png");
        getImage().scale(getImage().getWidth() / Scale, getImage().getHeight() / Scale);
        
        setRotation(Rotation);
    }

    public Decoration(String TilesName, double Scale)
    {
        String Path   = "Tiles/";

        setImage(Path + TilesName + ".png");
        // getImage().scale(getImage().getWidth() / Scale, getImage().getHeight() / Scale);
        
        int newWidth = (int) (getImage().getWidth() / Scale);
        int newHeight = (int) (getImage().getHeight() / Scale);

        // Scale the image to the new size
        getImage().scale(newWidth, newHeight);  
    }

    public Decoration(String TilesName, float ScaleX, float ScaleY)
    {
        String Path   = "Tiles/";

        setImage(Path + TilesName + ".png");
        getImage().scale((int)ScaleX, (int)ScaleY);            
    }
}
