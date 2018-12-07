import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VictoryWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VictoryWorld extends World
{

    /**
     * Constructor for objects of class VictoryWorld.
     * 
     */
    public VictoryWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1,false); 
        this.setBackground("bg.png");
        
        
        
        prepare();
    }
    private void prepare() {
        VictoryScreen gameOverScreen = new VictoryScreen();
        addObject(gameOverScreen,500, 400);
        
    }
}
