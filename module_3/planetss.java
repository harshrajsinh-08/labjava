package module_3;

import java.util.Scanner;

class Planet {
    private String name;
    private double distanceToSun;
    private double gravity;

    // Choice of unit: 1 for m, g; 2 for miles, pounds
    private int unitChoice;

    // Constructor to initialize the planet details
    public Planet(String name, double distanceToSun, double gravity, int unitChoice) {
        this.name = name;
        this.distanceToSun = distanceToSun;
        this.gravity = gravity;
        this.unitChoice = unitChoice;
    }

    // Method to display the details of the planet
    public void displayDetails() {
        System.out.println("Planet Name: " + name);
        System.out.println("Distance to Sun: " + getDistanceString() + " million km");
        System.out.println("Surface Gravity: " + getGravityString() + " g");
    }

    // Method to convert and display distance based on unit choice
    private String getDistanceString() {
        if (unitChoice == 1) {
            return distanceToSun + " million km";
        } else if (unitChoice == 2) {
            // Conversion from million km to million miles
            double distanceInMiles = distanceToSun * 0.621371;
            return distanceInMiles + " million miles";
        } else {
            return "Invalid unit choice";
        }
    }

    // Method to convert and display gravity based on unit choice
    private String getGravityString() {
        if (unitChoice == 1) {
            return gravity + " g";
        } else if (unitChoice == 2) {
            // Conversion from g to pounds
            double gravityInPounds = gravity * 0.00220462;
            return gravityInPounds + " pounds";
        } else {
            return "Invalid unit choice";
        }
    }
}

public class planetss {
    public static void main(String[] args) {
        // Test the data type with the given details
        Planet mercury = new Planet("Mercury", 68.899, 0.38, 1);
        Planet venus = new Planet("Venus", 108.92, 0.91, 1);
        Planet earth = new Planet("Earth", 151.47, 1, 1);

        // Display details of each planet
        System.out.println("Details of Mercury:");
        mercury.displayDetails();
        System.out.println();

        System.out.println("Details of Venus:");
        venus.displayDetails();
        System.out.println();

        System.out.println("Details of Earth:");
        earth.displayDetails();
    }
}
