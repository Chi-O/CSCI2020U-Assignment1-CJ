package CSCI2020U.assignment1;

import java.awt.*;

public class BedroomBuilder {

    // Bedroom attributes
    private Dimension dimensions; // Dimension object contains width and height
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public BedroomBuilder(){

    }

    // Bedroom setter methods
    public void setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
    }

    public void setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setWallColor(Color wallColor) {
        this.wallColor = wallColor;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setDouble(boolean isDouble) {
        this.isDouble = isDouble;
    }

    public void setHasEnsuite(boolean hasEnsuite) {
        this.hasEnsuite = hasEnsuite;
    }
}
