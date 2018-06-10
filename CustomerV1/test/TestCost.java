/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cost.Cost;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class TestCost {

    Cost c;

    public TestCost() {

    }

    @Before
    public void setUp() {
        c = new Cost();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testColourCost() {

        assertEquals(17100, c.getIndiviCost("500", 1900), 0.1);
    }

    @Test
    public void testTotalCost() {
        double totalCost[] = new double[2];
        totalCost[0] = 17100;
        totalCost[1] = 17100;

        double roomAreas[] = new double[2];
        roomAreas[0] = 1900;
        roomAreas[1] = 1900;

        c.getTotalCost(totalCost, roomAreas);
        assertEquals(34200, c.getTotalCost(totalCost, roomAreas), 0.1);
    }

}
