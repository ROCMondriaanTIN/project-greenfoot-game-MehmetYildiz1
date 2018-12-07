
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Play extends Mover {
public void act(){
   if(Greenfoot.mouseClicked(this)) {
       Greenfoot.setWorld(new MyWorld());
    }
}
    
}
