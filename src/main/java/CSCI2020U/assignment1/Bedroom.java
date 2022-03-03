package CSCI2020U.assignment1;

import java.awt.Dimension;
import java.awt.Color;

// the Bedroom class is one of the complex products
public class Bedroom {
    // Bedroom attributes
    private Dimension dimensions; // Dimension object contains width and height
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    // original lengthy constructor
    public Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hasEnsuite) {
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
