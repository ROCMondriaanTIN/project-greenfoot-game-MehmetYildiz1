
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class KeyBlue extends Tile {

    public String keyBlue;

    /**
     * Contructor of the tile. Creates a tile based on image, width and height
     *
     * @param image Path to the image file
     * @param width Width of the tile
     * @param heigth Height of the tile
     */
    public KeyBlue(String image, int width, int heigth) {
        super(image,width,heigth);
    }
    public void act() {
        if (Hero.hasKeyBlue == true) {
           setImage ("bg.png");
        }
        if (Hero.hasKeyBlue == false) {
           setImage ("keyBlue.png");
        }
        remove();
    }
    public void remove() {
        if(isTouching(Hero.class) && Hero.hasKeyBlue == false) {
            getWorld().removeObject(this);
            Hero.hasKeyBlue = true;
            Hero.key++;
        }
    }
}
