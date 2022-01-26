import java.awt.*;

public class Giant extends Critter {

    private String giantWords[] = {"fee", "fie", "foe", "fum"};
    private int counter = 0;

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() != Neighbor.WALL) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {  
        if (counter == 33) {
            counter = 0;
        }

        if (counter <= 6) {
            counter++;
            return giantWords[0];
        } else if (counter >= 7 && counter <= 12) {
            counter++;
            return giantWords[1];
        } else if (counter >= 13 && counter <= 18) {
            counter++;
            return giantWords[2];
        } else {
            counter++;
            return giantWords[3];
        }
    } 
    
}
