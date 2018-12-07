
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class lvl2 extends Mover {
public void act(){
   if(Greenfoot.mouseClicked(this)) {
       Greenfoot.setWorld(new TestWorld());
       Hero.key = 0;
       Hero.hasKeyBlue = false;
    }
}
    
}
