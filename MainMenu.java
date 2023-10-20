import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Map;
import java.util.HashMap;

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
        String Path = "images/Buttons/";

        /* Play Button */
        Buttons.put("PlayBtn", new Button(Path + "PlayBtn.png", Path + "HvrPlayBtn.png"));
        Buttons.get("PlayBtn").OnPressed(this::PlayBtnPressed);
        addObject(Buttons.get("PlayBtn"), 400, 250);

        /* How to play Button */
        Buttons.put("HTPlayBtn", new Button(Path + "HowToPlayBtn.png", Path + "HvrHowToPlayBtn.png"));
        Buttons.get("HTPlayBtn").SetScale(.6, .6);
        Buttons.get("HTPlayBtn").OnPressed(this::HTPlayBtnPressed);
        addObject(Buttons.get("HTPlayBtn"), 400, 350);

        /* Credit Button */
        Buttons.put("CreditBtn", new Button(Path + "CreditBtn.png", Path + "HvrCreditBtn.png"));
        Buttons.get("CreditBtn").SetScale(0.5, 0.5);
        Buttons.get("CreditBtn").OnPressed(this::CreditBtnPressed);
        addObject(Buttons.get("CreditBtn"), 400, 450);

        Greenfoot.start();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("backspace") && bDisplaying)
        {
            bDisplaying = false;
            setBackground(MainBg);

            Buttons.forEach((Key, Value) -> {
                Value.Hide(false);
            });
        }
    }

    // ===== Properties ========== //

    String MainBg = "images/Bg/menufinal.png";
    String HTPlay = "images/Contents/Howtoplay.png";
    String Credit = "images/Contents/Credit.png";

    boolean bDisplaying = false;

    Map<String, Button> Buttons = new HashMap<>();

    // ===== Button Handler ========== //

    private void PlayBtnPressed()
    {
        if (!Check()) return;

        Greenfoot.setWorld(new Level1());
    }

    private void HTPlayBtnPressed()
    {
        if (!Check()) return;

        setBackground(HTPlay);
    }

    private void CreditBtnPressed()
    {
        if (!Check()) return;

        setBackground(Credit);
    }

    private boolean Check()
    {
        if (bDisplaying) return false;

        bDisplaying = true;
        Buttons.forEach((Key, Value) -> {
            Value.Hide(true);
        });

        return true;
    }
}
