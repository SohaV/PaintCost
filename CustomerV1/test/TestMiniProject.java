/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import miniproject.Door;
import miniproject.ExtraArea;
import miniproject.Window;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADITI RAO
 */
public class TestMiniProject {
    
    Door d;
    Window w;
    ExtraArea e;
    
    public TestMiniProject() {
    }
    
    @Before
    public void setUp() {
        
        d=new Door();
        w=new Window();
        e= new ExtraArea();
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
     @Test
     public void testGetDoorArea() {
         double area = d.getDoorArea(1.0,10.0,5.0);
         assertEquals(50, area, 0.1);
             
     }
     
     @Test
     public void testGetWindowArea() {
         
         double area = w.getWindowArea(2.0,10.0,5.0);
         assertEquals(100, area, 0.1);
             
     }
     
     @Test
     public void testGetExtraArea() {
         
         double area = e.getExtraArea(100.0,50.0);
         assertEquals(150, area, 0.1);
             
     }
}
