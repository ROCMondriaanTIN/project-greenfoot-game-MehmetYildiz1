import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Tile
{
    Hero h;
    public Coin(String image, int width, int heigth)
    {
        super(image,width,heigth);
    }    
    public void act(){
       setImage("coinGold.png");
       if(isTouching(Hero.class)){
           getWorld().removeObject(this);
           h.money += 5;
       }
    }
}
