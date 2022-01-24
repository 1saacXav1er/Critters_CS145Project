import java.awt.*;

public class Bear extends Critter {

    private boolean polar;
    private boolean slash;

    public Bear (boolean polar) {
        this.polar = polar;
    }
    
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getFront() == Neighbor.SAME) {
            return Action.LEFT;
        } else {
            return Action.HOP;
        }
    }

    public Color getColor() {
        if (polar) {
            return Color.WHITE;
        } else {
            return Color.BLACK; 
        }
    }

    public String toString() {
        slash = !slash;

        if (slash == true) {
            return "/";
        } else {
            return "\\";
        }
    }

}
