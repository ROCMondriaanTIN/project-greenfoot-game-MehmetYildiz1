
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class VictoryScreen extends Mover {
public void act(){
   if(Greenfoot.mouseClicked(this)) {
       Greenfoot.setWorld(new StartWorld());
       Hero.key = 0;
       Hero.hasKeyBlue = false;
    }
}
    
}
