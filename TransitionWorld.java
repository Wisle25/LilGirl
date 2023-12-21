import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TransitionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransitionWorld extends UWorld
{
    private World NextWorld;
    private TimerHandle ChangeWorldTimerHandler = new TimerHandle();

    // ===== Lifecycle ========== //

    public TransitionWorld(World InNextWorld, String AnimPath, int Delay)
    {
        super(800, 600, 1, 1, 1);

        this.NextWorld = InNextWorld;
        this.Delay     = Delay;

        GetTimerManager().StartTimer(ChangeWorldTimerHandler, Delay);
        GetScenesFromPath("images/Scenes/" + AnimPath);
    }

    public void act()
    {
        super.act();

        ChangeWorld();
    }

    // ===== Scenes ========== //

    private Queue<GreenfootImage> Scenes;
    private int Delay;

    // ===== Changing World ========== //

    private boolean bChanged = false;

    private void GetScenesFromPath(String AnimPath)
    {
        File Folder = new File(AnimPath);

        if (Folder.exists() && Folder.isDirectory())
        {
            // Get the frames from folder
            File[] FileFrames = Folder.listFiles();

            if (FileFrames == null) return;

            // Updating animation properties
            Scenes     = new LinkedList<GreenfootImage>();
            
            Arrays.sort(FileFrames, 0, FileFrames.length, Comparator.comparing(File::getName));

            for (int I = 0; I < FileFrames.length; ++I)
                Scenes.add(new GreenfootImage(AnimPath + "/" + FileFrames[I].getName()));

            setBackground(Scenes.peek());
        }  
    }

    private void ChangeWorld()
    {
        if (bChanged) return;

        if (GetTimerManager().IsTimerFinished(ChangeWorldTimerHandler))
        {
            if (!Scenes.isEmpty())
            {
                Scenes.remove();
                setBackground(Scenes.peek());
    
                // Also recreate the time
                GetTimerManager().StartTimer(ChangeWorldTimerHandler, Delay);
            }
            else
            {
                bChanged = true;
                Greenfoot.setWorld(NextWorld);
            }
        }
    }
}
