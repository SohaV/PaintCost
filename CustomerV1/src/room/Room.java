/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package room;

import java.util.Scanner;
import miniproject.ExtraArea;

/**
 * This Room class takes dimensions of the room from the user and returns the
 * total paintable area of the room.
 *
 * @author Disha
 */
public class Room {

    double roomLength;
    double roomBreadth;
    double roomHeight;
    double paintableArea;
    double totalArea;
    double extraArea;

    Scanner s = new Scanner(System.in);
    ExtraArea e = new ExtraArea();

    /**
     * This setDimensions function sets the dimensions of a room.
     */
    public void setDimensions() {
        
        System.out.println("Enter the dimensions of the room: ");
        System.out.print("Length: ");
        roomLength = s.nextDouble();
        System.out.print("Breadth: ");
        roomBreadth = s.nextDouble();
        System.out.print("Height: ");
        roomHeight = s.nextDouble();
    }

    /**
     * This setTotalArea function calculates the total area of the room that can
     * be considered for painting i.e 4 walls and ceiling.
     *
     * @param roomLength
     * @param roomBreadth
     * @param roomHeight
     */
    public void setTotalArea(double roomLength, double roomBreadth, double roomHeight) {
        
        totalArea = (roomLength * roomBreadth) + (2 * ((roomHeight * roomBreadth) + (roomHeight * roomLength)));
    }

    /**
     * This getTotalArea function returns the Total area of a room.
     *
     * @return totalArea
     */
    public double getTotalArea() {
        
        return totalArea;
    }

    /**
     * This setExtraArea function calculates the non-paintable area for a room.
     */
    public void setExtraArea() {
        
        extraArea = e.getExtraAreaValue();
    }

    /**
     * This getExtraArea function returns the non-paintable area.
     *
     * @return extraArea
     */
    public double getExtraArea() {
        
        return extraArea;
    }

    /**
     * This setPaintableArea function calculates the total paintable area after
     * subtracting the extra area i.e the area that cannot be painted(e.g doors
     * and windows).
     *
     * @param totalArea double
     * @param extraArea
     *
     * @return (totalArea - extraArea)
     */
    public double setPaintableArea(double totalArea, double extraArea) {

        return (totalArea - extraArea);
    }

    /**
     * This getPaintableArea function returns the total area of a room that can
     * be painted.
     *
     * @return paintableArea
     */
    public double getPaintableArea() {
        
        setDimensions();
        setTotalArea(roomLength, roomBreadth, roomHeight);
        setExtraArea();
        paintableArea = setPaintableArea(totalArea, extraArea);
        
        return paintableArea;
    }

}//end of class Room
