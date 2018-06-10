/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import room.Room;

/**
 *This TestRoom class contains test cases for Room class.
 * @author Disha
 */
public class TestRoom {

    Room r;

    public TestRoom() {
    }

    @Before
    public void setUp() {
        r = new Room();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSetTotalArea() {
        r.setTotalArea(10, 20, 30);
        assertEquals(2000, r.getTotalArea(), 0.1);
    }

    @Test
    public void testSetPaintableArea() {

        assertEquals(1900, r.setPaintableArea(2000, 100), 0.1);
    }

}
