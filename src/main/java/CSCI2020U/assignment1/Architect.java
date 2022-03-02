package CSCI2020U.assignment1;

import java.awt.*;

// the Architect class represents the director; it is used to make Bedroom objects
public class Architect {
    public static void main(String[] args) {
        Bedroom room = new Bedroom(new Dimension(300, 400), 100, 4, Color.magenta, 3, 1, true, true);

        System.out.println(room);
    }
}
