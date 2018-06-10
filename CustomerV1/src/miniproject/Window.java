/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.util.Scanner;

/**
 * This class is related to extra space of windows
 *
 * @author ADITI RAO
 */
public class Window {

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
    public double getNoOfWindows() {

        double n;

        System.out.println("Enter the number of windows");
        n = setValue();
        
        return n;
    }

    /**
     * Calculates the length of the window
     *
     * @return windowLength
     */
    public double getWindowlength() {

        double windowlength;

        System.out.println("Enter the Length of window");
        windowlength = setValue();
        
        return windowlength;
    }

    /**
     * Calculate the breadth of windows
     *
     * @return windowsBreadth
     */
    public double getWindowBreadth() {

        double windowBreadth;

        System.out.println("Enter the Breadth of the window");
        windowBreadth = setValue();
        
        return windowBreadth;

    }

    /**
     * This function gets all the values required for area calculation It also
     * calls the getWindowArea() function
     */
    public double getWindowValues() {
        
        double noOfWindows = getNoOfWindows();
        double windowLength = getWindowlength();
        double windowBreadth = getWindowBreadth();

        return getWindowArea(noOfWindows, windowLength, windowBreadth);
    }

    /**
     * Calculates the window area
     *
     * @param noOfWindows
     * @param windowLength
     * @param windowBreadth
     * @return totalArea
     */
    public double getWindowArea(double noOfWindows, double windowLength, double windowBreadth) {

        double totalArea = (noOfWindows * windowLength * windowBreadth);

        return totalArea;
    }

} //end of Window class

