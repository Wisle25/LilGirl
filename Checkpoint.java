import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Checkpoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checkpoint extends Environment
{
    // ===== Lifecycle ========== //

    public void act()
    {
        
    }

    // ===== Logic ========== //

    private boolean PlayerHasArrived()
    {
        return getOneIntersectingObject(Player.class) != null;
    }
}
