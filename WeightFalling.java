
import greenfoot.*;







/**



 *



 * @author R. Springer



 */



      public class WeightFalling extends Mover {

        public String type;
        public double gravity;
        public double acc;
        public double drag;
    
    public WeightFalling() {
        setImage("weight.png");
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
    }
    public void act() {

        velocityX *= drag;
        velocityY += acc;

        if (velocityY > gravity) {



            velocityY = gravity;



        }
        applyVelocity();
      
    } 
}
    
     