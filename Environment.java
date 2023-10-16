import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Environment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Environment extends Actor
{
    /**
     * Act - do whatever the Environment wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }


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
