/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerv1;

import cost.Cost;
import miniproject.Building;

/**
 *This class CustomerV1 Welcomes the customer and takes him through the selection process 
 * @author Binary Witches
 */
public class CustomerV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double roomAreas[] = new double[100];
        Building b = new Building();
        System.out.println("Welcome to Potter's Paints");
        roomAreas = b.menu();
        Cost c = new Cost();
        c.getCost(roomAreas);

    }

}//end of class CustomerV1
