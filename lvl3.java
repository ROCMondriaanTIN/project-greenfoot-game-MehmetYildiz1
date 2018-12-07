
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class lvl3 extends Mover {
public void act(){
   if(Greenfoot.mouseClicked(this)) {
       Greenfoot.setWorld(new ThirdWorld());
       Hero.key = 0;
       Hero.hasKeyBlue = false;
    }
}
    
}
