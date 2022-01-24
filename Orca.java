import java.awt.*;

public class Orca extends Critter {

    public Action getMove(CritterInfo info) {
        return Action.INFECT;
    }

    public Color getColor() {
        return Color.BLACK;
    }

    public String toString() {
        return "☠";
    }
    
}
