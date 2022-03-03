package CSCI2020U.assignment1;

import java.awt.*;

// creates a complex Kitchen object using the Builder interface
public class KitchenBuilder implements Builder{
    // same attributes as Kitchen object
    // attributes of a kitchen
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasDishwasher;
    private boolean hasMicrowave;

    public KitchenBuilder() {
    }

    // implement and override setter methods from Builder interface
    @Override
    public KitchenBuilder setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    @Override
    public KitchenBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    @Override
    public KitchenBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    @Override
    public KitchenBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    @Override
    public KitchenBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public KitchenBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    // implement Kitchen-specific methods
    public KitchenBuilder setDishWasher(boolean hasDishwasher) {
        this.hasDishwasher = hasDishwasher;
        return this;
    }

    public KitchenBuilder setMicrowave(boolean hasMicrowave) {
        this.hasMicrowave = hasMicrowave;
        return this;
    }

    public Kitchen createKitchen() {
        return new Kitchen(dimensions, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors, hasDishwasher, hasMicrowave);
    }
}
