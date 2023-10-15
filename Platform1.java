import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platform1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform1 extends Ground
{
    public Platform1()
    {
        GreenfootImage Image = new GreenfootImage("images/Tiles/platform6.png");
        Image.scale(224, 16);
        
        setImage(Image);
    }
}
