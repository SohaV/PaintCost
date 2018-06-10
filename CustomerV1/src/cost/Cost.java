package cost;

import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * This class is used to calculate cost for painting
 *
 * @author Lakshmi
 */
public class Cost {

    Scanner s = new Scanner(System.in);
    String[] paintType = new String[5];
    double totalCost[] = new double[100];
    double projCost = 0;
    Properties prop = new Properties();
    
    

    /**
     * This function is used to open a file to read and access type of paint
     * @throws Exception
     */
    public void setUp() throws Exception {

        FileInputStream ip = new FileInputStream(".\\type.txt");
        
        if (ip != null) {
            
            prop.load(ip);
            
        } else {
            
            throw new FileNotFoundException(" File not found in the classpath");
        }
    }

    /**
     * This function asks the user to chose type of paint for different rooms
     *
     * @param roomAreas double
     */
    public void selectType(double roomAreas[]) {
        
        System.out.println("Whether you want plain or textured paint ?");
        
        for (int i = 0; i < roomAreas.length; i++) {
            
            System.out.println("Enter your choice for room number " + (i + 1));
            paintType[i] = s.nextLine();

        }
    }

    /**
     * This function prints the cost of painting each room and also total cost
     * to paint the entire house
     *
     * @param roomAreas double
     */
    public void getCost(double roomAreas[]) {

        try {

            setUp();

        } catch (Exception e) {

            System.out.println("File not found Exception");
        }

        selectType(roomAreas);

        colourCost(roomAreas);
        
        projCost = getTotalCost(totalCost, roomAreas);

        for (int i = 0; i < roomAreas.length; i++) {

            System.out.println("The cost to print room number " + (i + 1) + "is Rs" + totalCost[i]);
        }
        System.out.println("The total project cost is Rs " + projCost);

    }

    /**
     * This function calculates the total cost of painting each room. Depending
     * upon the type of paint, the respective price is read from the file
     *
     * @param roomAreas double
     */
    public void colourCost(double roomAreas[]) {

        String price;

        for (int i = 0; i < roomAreas.length; i++) {
            
            price = prop.getProperty(paintType[i]);
            totalCost[i] = getIndiviCost(price, roomAreas[i]);

        }

    }

    /**
     * This function calculates cost to paint for a room
     *
     * @param price String
     * @param roomArea double
     * @return (paintCost + labourCost)
     */
    public double getIndiviCost(String price, double roomArea) {

        double paintCost;
        double labourCost;
        
        paintCost = ((roomArea / 100.0) * Double.parseDouble(price));//paintCost is calculated as roomArea*cost of paint per sq.ft
        labourCost = (roomArea / 100.0) * ((Double.parseDouble(price)) - 100);//labourCost is calculated as roomArea*(cost of paint-100) per sq.ft)
        
        return (paintCost + labourCost);

    }

    /**
     * This function returns total cost to paint the building
     *
     * @param totalCost double
     * @param roomAreas double
     * @return cost
     */
    public double getTotalCost(double totalCost[], double roomAreas[]) {
        
        double cost = 0;
        
        for (int i = 0; i < roomAreas.length; i++) {
            cost += totalCost[i];
        }
        
        return cost;

    }

}//end of class Cost
