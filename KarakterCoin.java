import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KarakterCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KarakterCoin extends Mover
{
    
    public String type;
    
    public KarakterCoin(String image, String kleur) {
        setImage(image);
        type = kleur;
    }
    
    public void act(){
        applyVelocity();
    }
      
}
