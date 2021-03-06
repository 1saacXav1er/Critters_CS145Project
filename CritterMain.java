//Isaac Cartagena
// CSE 142 Homework 9 (Critters)
//
// CritterMain provides the main method for a simple simulation program.  Alter
// the number of each critter added to the simulation if you want to experiment
// with different scenarios.  You can also alter the width and height passed to
// the CritterFrame constructor.

public class CritterMain {
    public static void main(String[] args) {
        CritterFrame frame = new CritterFrame(60, 40);

        // creates critters on the battlefield
        frame.add(30, Orca.class);
        frame.add(30, Bear.class);
        frame.add(30, Lion.class);
        frame.add(30, Giant.class);
        //frame.add(30, FlyTrap.class);
        frame.add(30, Food.class);

        frame.start();
    }
}
