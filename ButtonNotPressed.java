
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonNotPressed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonNotPressed extends Mover
{
    public int imageNumber;
    
    
    public ButtonNotPressed(String image) {
        setImage(image);
    }
    
    public void act(){
        applyVelocity();
        if(isTouching(Hero.class)){
          setImage("buttonYellow_pressed.png");
          return;
        }
    }
     
}
