import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

import greenfoot.GreenfootImage;
import greenfoot.Actor;

/**
 * Implementing animation in greenfoot
 * 
 * @author Handi, Theo, Lutfi 
 * @version 1.0
 */
public class AnimationComponent  
{
    // ----- GameFramework ----- //

    private Actor ActorOwner;

    // ----- Lifecycle ---------- //

    public AnimationComponent(Actor Owner, String FolderPath, int AnimSpeed)
    {
        // Init Defaults
        this.AnimSpeed    = AnimSpeed;
        this.Delay        = AnimSpeed;
        this.CurrentFrame = 0;
        this.ActorOwner  = Owner;

        SetAnimFrames(FolderPath);
    }

    public void TickComponent()
    {
        if (CurrentPause && IsFinished()) return;

        if (Delay-- <= 0)
        {
            CurrentFrame = (CurrentFrame + 1) % FrameCount;
            Delay        = AnimSpeed;
            ActorOwner.setImage(Frames[CurrentFrame]);
        }
    }

    // ----- Transformation ---------- //

    public void Flip()
    {
        for (GreenfootImage Frame : Frames)
            Frame.mirrorHorizontally();
    }

    public void Reset()
    {
        CurrentFrame = 0;
        Delay        = 0;
        CurrentPause = false;
        ActorOwner.setImage(Frames[0]);
    }

    public void Setup()
    {
        CurrentPause = PauseAtEnd;
    }

    public void SetScale(double NewScale)
    {
        for (GreenfootImage Frame : Frames)
            Frame.scale((int)(Frame.getWidth() / NewScale), (int)(Frame.getHeight() / NewScale));
    }

    // ----- Properties ----- //

    private GreenfootImage[] Frames;
    private int FrameCount;
    private int CurrentFrame;
    private int AnimSpeed;
    private int Delay;

    private boolean PauseAtEnd   = false;
    private boolean CurrentPause = PauseAtEnd;

    /*
     * Getting animations frames from folder
     * 
     * @param FolderPath
     */
    private void SetAnimFrames(String FolderPath)
    {
        File Folder = new File(FolderPath);

        if (Folder.exists() && Folder.isDirectory())
        {
            // Get the frames from folder
            File[] FileFrames = Folder.listFiles();

            if (FileFrames == null) return;

            Arrays.sort(FileFrames, 0, FrameCount, Comparator.comparing(File::getName));

            // Updating animation properties
            FrameCount = FileFrames.length;
            Frames     = new GreenfootImage[FrameCount];

            for (int I = 0; I < FrameCount; ++I)
                Frames[I] = new GreenfootImage(FolderPath + "/" + FileFrames[I].getName());
        }
    }

    public boolean IsFinished()
    {
        return CurrentFrame == FrameCount - 1;
    }

    // ----- Modifiers ---------- //

    public void SetPauseAtEnd(boolean Value) { PauseAtEnd = Value; CurrentPause = Value; }
}
