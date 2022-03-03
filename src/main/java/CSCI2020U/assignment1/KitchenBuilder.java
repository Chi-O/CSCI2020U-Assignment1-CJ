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
}
