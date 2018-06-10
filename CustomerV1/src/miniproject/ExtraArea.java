/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

/**
 * This class gets the non paintable space of the room to subtract from the
 * total area
 *
 * @author ADITI RAO
 */
public class ExtraArea {

    public double getExtraAreaValue() {

        Window w = new Window();
        Door d = new Door();

        double windowArea = w.getWindowValues();
        double doorArea = d.getDoorValues();
        
        return getExtraArea(windowArea, doorArea);

    }

    /**
     * Calculates the extra area of windows and doors
     *
     * @param windowArea
     * @param doorArea
     * @return windowArea + doorArea
     */
    public double getExtraArea(double windowArea, double doorArea) {

        return (windowArea + doorArea);

    }

} //end of class ExtraArea
