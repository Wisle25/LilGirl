import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shuriken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shuriken extends Obstacle
{
    // ----- Lifecycle ---------- //

    public Shuriken(int Rotation)
    {
        Anim = new AnimationComponent(this, "images", 5);

        setRotation(Rotation);
    }

    public void act()
    {
        // Add your action code here.
    }

    // ----- Components ---------- //

}
