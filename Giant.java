import java.awt.*;

public class Giant extends Critter {

    private String giantWords[] = {"fee", "fie", "foe", "fum"};

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
        
        return giantWords[0];
    }
    
}
