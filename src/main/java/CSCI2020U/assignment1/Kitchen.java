package CSCI2020U.assignment1;

import java.awt.*;

// represents another complex room object: a kitchen
public class Kitchen {
    // attributes of a kitchen
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasDishwasher;
    private boolean hasMicrowave;

    // original lengthy constructor
    public Kitchen(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean hasDishwasher, boolean hasMicrowave){
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.hasDishwasher = hasDishwasher;
        this.hasMicrowave = hasMicrowave;
    }

    public String getDishWasher() {
        if (this.hasDishwasher) {
            return "has a dish washer";
        }

        return "does not have a dishwasher";
    }
}
