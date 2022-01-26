import java.awt.*;

public class Orca extends Critter {
    private int counter = 0;
    private boolean color, shape;

    public Action getMove(CritterInfo info) {
        if (counter <= 25) {
            counter++;
            return killerWhale(info);
        } else if (counter == 26){
            return Action.HOP;
        } else {
            counter = 0;
            return killeDWhale(info);
        }
        
    }

    public Color getColor() {
        color = !color;

        if (color == true) {
            return Color.BLACK;
        } else {
            return Color.CYAN;
        }
    }

    public String toString() {
        shape = !shape;

        if (shape == true) {
            return "0";
        } else {
            return "1";
        }
    }

    public Action killeDWhale(CritterInfo info) {
        if (info.getFront() == Neighbor.EMPTY &&
            info.getBack() == Neighbor.EMPTY &&
            info.getLeft() == Neighbor.EMPTY &&
            info.getRight() == Neighbor.EMPTY) {
                return Action.HOP;
        } else if (info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.OTHER &&
            info.getRight() == Neighbor.EMPTY &&
            info.getLeft() == Neighbor.EMPTY) {
            return Action.INFECT;
        } else if (info.getDirection() == Direction.NORTH && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.OTHER &&
            info.getRight() == Neighbor.EMPTY &&
            info.getLeft() == Neighbor.EMPTY) {
            return Action.INFECT;
        } else if (info.getDirection() == Direction.EAST && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.OTHER &&
            info.getRight() == Neighbor.EMPTY &&
            info.getLeft() == Neighbor.EMPTY) {
            return Action.INFECT;
        } else if (info.getDirection() == Direction.WEST && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.OTHER &&
            info.getRight() == Neighbor.EMPTY &&
            info.getLeft() == Neighbor.EMPTY) {
            return Action.INFECT;
        } else if (info.getDirection() == Direction.SOUTH && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.EMPTY &&
            info.getRight() == Neighbor.SAME &&
            info.getLeft() == Neighbor.EMPTY) {
            return Action.LEFT;
        } else if (info.getDirection() == Direction.SOUTH && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.EMPTY &&
            info.getRight() == Neighbor.EMPTY &&
            info.getLeft() == Neighbor.SAME) {
            return Action.RIGHT;
        } else if (info.getDirection() == Direction.NORTH && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.EMPTY &&
            info.getRight() == Neighbor.EMPTY &&
            info.getLeft() == Neighbor.SAME) {
            return Action.RIGHT;
        } else if (info.getDirection() == Direction.NORTH && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.EMPTY &&
            info.getRight() == Neighbor.SAME &&
            info.getLeft() == Neighbor.EMPTY) {
            return Action.LEFT;
        } else if (info.getDirection() == Direction.EAST && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.EMPTY &&
            info.getRight() == Neighbor.SAME &&
            info.getLeft() == Neighbor.EMPTY) {
            return Action.LEFT;
        } else if (info.getDirection() == Direction.EAST && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.EMPTY &&
            info.getRight() == Neighbor.EMPTY &&
            info.getLeft() == Neighbor.SAME) {
            return Action.RIGHT;
        } else if (info.getDirection() == Direction.EAST && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.SAME &&
            info.getRight() == Neighbor.SAME &&
            info.getLeft() == Neighbor.EMPTY) {
            return Action.LEFT;
        } else if (info.getDirection() == Direction.EAST && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.SAME &&
            info.getRight() == Neighbor.EMPTY &&
            info.getLeft() == Neighbor.SAME) {
            return Action.RIGHT;
        } else if (info.getDirection() == Direction.WEST && 
            info.getBack() == Neighbor.WALL && 
            info.getFront() == Neighbor.EMPTY &&
            info.getRight() == Neighbor.EMPTY &&
            info.getLeft() == Neighbor.EMPTY) {
            return Action.INFECT;
        } else if (info.getDirection() == Direction.NORTH && 
            info.getRight() == Neighbor.SAME && 
            info.getLeft() == Neighbor.WALL) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL) {
            return Action.RIGHT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.LEFT;
        } else {
            return Action.INFECT;
        }
    }

    public Action killerWhale(CritterInfo info) {
        if (info.getFront() == Neighbor.EMPTY &&
            info.getBack() == Neighbor.EMPTY &&
            info.getLeft() == Neighbor.EMPTY &&
            info.getRight() == Neighbor.EMPTY) {
                return Action.HOP;
        } else if (info.getFront() == Neighbor.WALL) {
            return Action.RIGHT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else {
            return Action.RIGHT;
        }
    }
}
