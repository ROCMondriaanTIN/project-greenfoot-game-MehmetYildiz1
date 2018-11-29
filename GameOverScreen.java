
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class GameOverScreen extends Mover {
public void act(){
   if(Greenfoot.mouseClicked(this)||Greenfoot.isKeyDown("space")) {
       Greenfoot.setWorld(new MyWorld());
    }
}
    
}
