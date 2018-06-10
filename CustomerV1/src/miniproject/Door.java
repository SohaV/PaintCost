/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.util.Scanner;

/**
 * This class is related to Doors
 *
 * @author ADITI RAO
 */
public class Door {

    Scanner in = new Scanner(System.in);

    /**
     * Sets the value to the called variable
     *
     * @return nextDouble
     */
    public double setValue() {

        return in.nextDouble();
    }

    /**
     * Called number of windows in the room
     *
     * @return noOfWindows
     */
    public double getNoOfDoors() {

        double n;

        System.out.println("Enter the number of doors");
        n = setValue();
        
        return n;
    }

    /**
     * Calculates the length of the window
     *
     * @return windowLength
     */
    public double getDoorlength() {

        double n;

        System.out.println("Enter the Length of door");
        n = setValue();
        
        return n;
    }

    /**
     * Calculate the breadth of windows
     *
     * @return windowsBreadth
     */
    public double getDoorBreadth() {

        double n;

        System.out.println("Enter the Breadth of the door");
        n = setValue();
        
        return n;

    }

    /**
     * This function gets all the values required for area calculation It also
     * calls the getDoorArea() function
     */
    public double getDoorValues() {
        
        double noOfDoors = getNoOfDoors();
        double doorLength = getDoorlength();
        double doorBreadth = getDoorBreadth();

        return getDoorArea(noOfDoors, doorLength, doorBreadth);
    }

    /**
     * Calculates the door area
     *
     * @param noOfDoors
     * @param doorLength
     * @param doorBreadth
     * @return totalArea
     */
    public double getDoorArea(double noOfDoors, double doorLength, double doorBreadth) {

        double totalArea = (noOfDoors * doorLength * doorBreadth);

        return totalArea;
    }

} //end of Door class

