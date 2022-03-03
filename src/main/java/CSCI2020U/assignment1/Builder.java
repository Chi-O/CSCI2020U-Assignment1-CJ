package CSCI2020U.assignment1;

import java.awt.*;

// abstract Builder interface for constructing complex room products
public interface Builder {
    // setter methods that all rooms have in common
    Builder setDimensions(Dimension dimensions);

    Builder setCeilingHeight(int ceilingHeight);

    Builder setFloorNumber(int floorNumber);

    Builder setNumberOfDoors(int numberOfDoors);

    Builder setNumberOfWindows(int numberOfWindows);

    Builder setWallColor(Color wallColor);
}
