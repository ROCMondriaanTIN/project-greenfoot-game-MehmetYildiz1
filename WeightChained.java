
import greenfoot.*;







/**



 *



 * @author R. Springer



 */



      public class WeightChained extends Mover {

        public String type;
        public double gravity;
        public double acc;
        public double drag;
    
    public WeightChained() {
        setImage("weight.png");
        
    }
    public void act() {
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                isTouching(ButtonNotPressed.class);
                //removeObjects(addObject(WeightFalling.class));


                

                return;



            }
        }
        applyVelocity();
    } 
}
    
     
