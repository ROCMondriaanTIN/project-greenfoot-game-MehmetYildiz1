
import greenfoot.*;



/**

 *

 * @author R. Springer

 */

public class Hero extends Mover {



    private final double gravity;

    private final double acc;

    private final double drag;
    
    private GreenfootImage image1 = new GreenfootImage("p1_walk01.png");





    public Hero() {

        super();

        gravity = 9.8;

        acc = 0.6;

        drag = 0.8;

        setImage("p1.png");

    }



    @Override

    public void act() {

        handleInput();

        

        velocityX *= drag;

        velocityY += acc;

        if (velocityY > gravity) {

            velocityY = gravity;

        }

        applyVelocity();



        for (Actor enemy : getIntersectingObjects(Enemy.class)) {

            if (enemy != null) {

                getWorld().removeObject(this);

                return;

            }

        }
        for (Actor coin : getIntersectingObjects(P2_coin.class)) {

            if (coin != null) {

                getWorld().removeObject(coin);

                return;

            }

        }
        

    }

    

    public void handleInput() {

        if (Greenfoot.isKeyDown("w")&& velocityY == 0) {

            velocityY = -13;
            setImage("p1_jump.png");

        }

        if (Greenfoot.isKeyDown("s")) {

            velocityY = 5;
            setImage("p1_duck.png");

        }     

        if (Greenfoot.isKeyDown("a")) {

            velocityX = -4;

        } else if (Greenfoot.isKeyDown("d")) {

            velocityX = 4;

        }
        
     }
       
        
          public int getWidth() {

        return getImage().getWidth();

    }



    public int getHeight() {

        return getImage().getHeight();

    }
    public void touching() {
        if(isTouching(P2_coin.class)) {
        
            removeTouching(P2_coin.class);
        }
    }
}
 

    

  
