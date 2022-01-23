import java.awt.*;

public class Bear extends Critter {

    public Action getMove(CritterInfo info) {

        return Action.INFECT;

    }

    public Color getColor() {
        
        boolean polarBear;

        if (polarBear = true) {
            return Color.WHITE
        } else {
            return Color.BLACK; 
        }
    }

    public String toString() {


        //return "";
    }
    
}
