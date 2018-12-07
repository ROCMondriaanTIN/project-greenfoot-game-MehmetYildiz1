import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1,false); 
        this.setBackground("bg.png");
        
        
        
        prepare();
    }
    private void prepare() {
        GameOverScreen gameOverScreen = new GameOverScreen();
        addObject(gameOverScreen,520, 351);
        PressSpace space = new PressSpace();
        addObject(space,300, 651);
        lvl2 lvl = new lvl2();
        addObject(lvl,430, 651);
        lvl3 lv = new lvl3();
        addObject(lv,560, 651);
    }
}
