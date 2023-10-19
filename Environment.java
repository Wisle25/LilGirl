import greenfoot.*;

public class Environment extends Actor
{
    public Environment()
    {

    }
    
    public Environment(String ImgName, double Scale)
    {
        String path = "Tiles/";

        setImage(path + ImgName + ".png");
        double ImgSizeX =  (double)getImage().getWidth() - (double)getImage().getWidth() / Scale;
        double ImgSizeY = (double)getImage().getWidth() - (double)getImage().getWidth() / Scale;
        getImage().scale(getImage().getWidth() - (int)ImgSizeX, getImage().getHeight() - (int)ImgSizeY);       
    }
    
}
