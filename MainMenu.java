import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    // ===== Lifecycle ========== //

    public MainMenu()
    {    
        super(800, 600, 1);

        setBackground("images/Bg/menufinal.png");
    
        // Adding buttons
        /* Play Button */
        Button PlayBtn = new Button("images/Buttons/PlayBtn.png", "images/Buttons/HvrPlayBtn.png");
        PlayBtn.OnPressed(this::PlayBtnPressed);
        addObject(PlayBtn, 400, 250);

    }

    // ===== Button Handler ========== //

    private void PlayBtnPressed()
    {
        Greenfoot.setWorld(new Level1());
    }
}
