
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class ClickToPlay extends Mover {
public void act(){
   if(Greenfoot.mouseClicked(this)) {
       Greenfoot.setWorld(new MyWorld());
    }
}
    
}
