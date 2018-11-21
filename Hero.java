
import greenfoot.*;







/**



 *



 * @author R. Springer



 */



      public class Hero extends Mover {
     
        private final double gravity;
        private final double acc;
        private final double drag;
        
        private double jumpHeight;
        private double right;
        private double playerTreeAcc = 2;
        private double playerOneAcc = 4;
        private double left;
        private double playerOneDrag = -4;
        private double playerTreeDrag = -2;
        private double playerOneJumpHeight = -13;
        private double playerTwoJumpHeight = -19;
        private double playerTreeJumpHeight = -10;
        private GreenfootImage player1 = new GreenfootImage("p1.png");
        private GreenfootImage player2 = new GreenfootImage("p2_walk11.png");
        private GreenfootImage player3 = new GreenfootImage("p3_walk11.png");
        private GreenfootImage walk1 = new GreenfootImage("p1_walk01.png");
        private GreenfootImage walk2 = new GreenfootImage("p1_walk02.png");
        private GreenfootImage walk3 = new GreenfootImage("p1_walk03.png");
        private GreenfootImage walk4 = new GreenfootImage("p1_walk04.png");
        private GreenfootImage walk5 = new GreenfootImage("p1_walk05.png");
        private GreenfootImage walk6 = new GreenfootImage("p1_walk06.png");
        private GreenfootImage walk7 = new GreenfootImage("p1_walk07.png");
        private GreenfootImage walk8 = new GreenfootImage("p1_walk08.png");
        private GreenfootImage walk9 = new GreenfootImage("p1_walk09.png");
        private GreenfootImage walk10 = new GreenfootImage("p1_walk10.png");
        private GreenfootImage walk11 = new GreenfootImage("p1_walk11.png");
        private boolean rechts;
        private boolean mirror;

        public Hero() {

        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        jumpHeight = playerOneJumpHeight;
        right = playerOneAcc;
        left = playerOneDrag;
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



                setLocation(150,478);
                setImage(player1);
                jumpHeight = playerOneJumpHeight;
                right = playerOneAcc;
                left = playerOneDrag;

                return;



            }
        }

        for (Actor enemy : getIntersectingObjects(LavaTile.class)) {
            if (enemy != null) {

                setLocation(150,478);
                setImage(player1);
                jumpHeight = playerOneJumpHeight;
                right = playerOneAcc;
                left = playerOneDrag;
                kill();
                return;

            }
        }
        
        for (KarakterCoin coin : getIntersectingObjects(KarakterCoin.class)) {
            if (coin != null) {
                if(coin.type.equals("groen")) {
                    
                }
                else if(coin.type.equals("blauw")) {
                    setImage(player2);
                    jumpHeight = playerTwoJumpHeight;
                    getWorld().removeObject(coin);
                }
                else if(coin.type.equals("roze")) {
                    setImage(player3);
                    right = playerTreeAcc;
                    left = playerTreeDrag;
                    jumpHeight = playerTreeJumpHeight;
                    getWorld().removeObject(coin);
                }
                
                break;

            }
        }
      }

        public boolean onGround() {
          Actor under = getOneObjectAtOffset (0, getHeight ()/2, Tile.class);
          Tile tile = (Tile) under;
          return tile != null && tile.isSolid == true;
        }

        public void handleInput() {

        if (Greenfoot.isKeyDown("w")&& velocityY == 0 || isTouching(Rope.class)) {
            velocityY = jumpHeight;
            
        }
        if (Greenfoot.isKeyDown("s")) {
            velocityY = 5;
            setImage("p1_duck.png");

        }    
        if (Greenfoot.isKeyDown("a")) {
            velocityX = left;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = right;
        }
      }
     // public void touching() {
    //    if (hero.class =
     // }
      
          
        

      public void kill(){
          Greenfoot.setWorld(new MyWorld());
        }
      
        public int getWidth() {
        
        return getImage().getWidth();
    
    }

    public int getHeight() {
        
        return getImage().getHeight();

    }
  }



    

  
