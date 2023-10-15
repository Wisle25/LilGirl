import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platform1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform2 extends Ground
{
    public Platform2()
    {
        GreenfootImage Image = new GreenfootImage("images/Tiles/platform2.png");
        Image.scale(64, 16);
        
        setImage(Image);
    }

    public Platform2(int Rotation) 
    {
        GreenfootImage Image = new GreenfootImage("images/Tiles/platform2.png");
        Image.scale(64, 16);
        
        setImage(Image);
        setRotation(Rotation);
    }
}
