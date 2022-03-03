package CSCI2020U.assignment1;

import java.awt.*;

// the Architect class represents the director; it is used to make Bedroom objects
public class Architect {
    public static void main(String[] args) {
        // new construction using Bedroom Builder
        Bedroom room = new BedroomBuilder().setDimensions(new Dimension(300, 300)).setCeilingHeight(100).setFloorNumber(4).setWallColor(Color.magenta).setNumberOfWindows(3).setNumberOfDoors(1).setDouble(true).setHasEnsuite(true).createBedroom();

        // original lengthy construction
        // Bedroom room = new Bedroom(new Dimension(300, 400), 100, 4, Color.magenta, 3, 1, true, true);

        Kitchen kitchen = new KitchenBuilder().setDishWasher(true).createKitchen();

        System.out.println("This room is on floor number " + room.getFloorNumber() + ".");
        System.out.println("This kitchen " + kitchen.getDishWasher() + ".");
    }
}
