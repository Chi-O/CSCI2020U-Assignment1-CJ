package CSCI2020U.assignment1;

import java.awt.*;

public class BedroomBuilder implements Builder{

    // Bedroom attributes
    private Dimension dimensions; // Dimension object contains width and height
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public BedroomBuilder() {
    }

    // implement and override setter methods from Builder interface
    @Override
    public BedroomBuilder setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    @Override
    public BedroomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    @Override
    public BedroomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public BedroomBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    @Override
    public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public BedroomBuilder setDouble(boolean isDouble) {
        this.isDouble = isDouble;
        return this;
    }

    public BedroomBuilder setHasEnsuite(boolean hasEnsuite) {
        this.hasEnsuite = hasEnsuite;
        return this;
    }

    public Bedroom createBedroom() {
        return new Bedroom(dimensions, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors, isDouble, hasEnsuite);
    }
}
