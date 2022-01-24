import java.awt.*;
import java.util.*;

public class Lion extends Critter {

    private Color colorList[] = {Color.RED, Color.GREEN, Color.BLUE};
    private int colorListLength = (int)colorList.length;
    private Random rand = new Random();
    private int randomInt = rand.nextInt(colorListLength);
    private int lastRandom = randomInt;
    private int counter = 0;

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || 
            info.getRight() == Neighbor.WALL) {
                return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }

    public Color getColor() {
        if (counter >= 3) {
            randomInt = rand.nextInt(colorListLength);
            while (randomInt == lastRandom) {
                randomInt = rand.nextInt(colorListLength);
            }
            lastRandom = randomInt;
            counter = 0;
        } 
        
        if (counter < 3) {
            counter++;
        }
        
        return colorList[randomInt];
    }

    public String toString() {
        return "L";
    }
    
}
