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

        /* How to play Button */
        Button HTPlayBtn = new Button("images/Buttons/HowToPlayBtn.png", "images/Buttons/HvrHowToPlayBtn.png");
        HTPlayBtn.SetScale(2, 2);
        addObject(HTPlayBtn, 400, 350);
    }

    // ===== Button Handler ========== //

    private void PlayBtnPressed()
    {
        Greenfoot.setWorld(new Level1());
    }
}
