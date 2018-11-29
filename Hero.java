
import greenfoot.*;







/**



 *



 * @author R. Springer



 */



      public class Hero extends Mover {
     
        private final double gravity;
        private boolean rechts;
        private final double acc;
        private final double drag;
        private int frame = 1;
        private double jumpHeight;
        private double right;
        private double playerTreeAcc = 4;
        private double playerOneAcc = 5;
        private double left;
        private double playerOneDrag = -5;
        private double playerTreeDrag = -4;
        private double playerOneJumpHeight = -16;
        private double playerTwoJumpHeight = -19;
        private double playerTreeJumpHeight = -14;
        private GreenfootImage player1 = new GreenfootImage("p1.png");
        private GreenfootImage player2 = new GreenfootImage("p2_walk11.png");
        private GreenfootImage player3 = new GreenfootImage("p3_walk11.png");
        public static int key = 0;
        private boolean mirror;
        
        public static boolean hasKeyBlue;
        //public static int lives = 1;

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
        getWorld().showText("Key = " + Integer.toString(key), 950, 50);
        getWorld().showText("x =" + Integer.toString(getX()), 950, 75);
        getWorld().showText("y =" + Integer.toString(getY()), 950, 100);
       //getWorld().showText("lives = " + Integer.toString(lives), 950, 75);
       

        if (velocityY > gravity) {



            velocityY = gravity;



        }

        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {



                Greenfoot.setWorld(new GameOver());
                setImage(player1);
                jumpHeight = playerOneJumpHeight;
                right = playerOneAcc;
                left = playerOneDrag;

                return;



            }
        }
        for (Actor weight : getIntersectingObjects(WeightFalling.class)) {
            if (weight != null) {



                Greenfoot.setWorld(new GameOver());
                setImage(player1);
                jumpHeight = playerOneJumpHeight;
                right = playerOneAcc;
                left = playerOneDrag;

                return;



            }
        }
        for (Actor enemy : getIntersectingObjects(LavaTile.class)) {
            if (enemy != null) {

                Greenfoot.setWorld(new GameOver());
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
     // public boolean isAtEdge() {
     //  boolean Edge = false;
     //  ifisTouching(Hero.class)){
     //      
     //   }
     //  return; 
     // }
     
   

        public boolean onGround() {
          Actor under = getOneObjectAtOffset (0, getHeight ()/2, Tile.class);
          Tile tile = (Tile) under;
          return tile != null && tile.isSolid == true;
        }
     
        public void handleInput() {

        if (Greenfoot.isKeyDown("w")&& velocityY == 0 || isTouching(Rope.class)) {
            velocityY = jumpHeight;
            setImage("p1_jump.png");
        }
        if (Greenfoot.isKeyDown("s")) {
            velocityY = 5;
            setImage("p1_duck.png");

        }    
        if (Greenfoot.isKeyDown("a")) {
            velocityX = left;
            animate();
            rechts = false;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = right;
            animate();
            rechts = true;
        }
     }
     
     public void animate() {
         
         switch(frame) {
         case 1:
         setImage("p1_walk01.png");
         break;
         case 2:
         setImage("p1_walk02.png");
         break;
         case 3:
         setImage("p1_walk03.png");
         break;
         case 4:
         setImage("p1_walk04.png");
         break;
         case 5:
         setImage("p1_walk05.png");
         break;
         case 6:
         setImage("p1_walk06.png");
         break;
         case 7:
         setImage("p1_walk07.png");
         break;
         case 8:
         setImage("p1_walk08.png");
         break;
         case 9:
         setImage("p1_walk09.png");
         break;
         case 10:
         setImage("p1_walk10.png");
         break;
         case 11:
         setImage("p1_walk11.png");
         
         frame = 0;
         break;
         }
        
         frame ++;
         mirrorImage();
     }
     public void mirrorImage() {
        if (mirror && rechts) {
            getImage().mirrorHorizontally();
        }
        else if (!mirror && !rechts) {
            getImage().mirrorHorizontally();
        }
     } 
        

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



    

  
