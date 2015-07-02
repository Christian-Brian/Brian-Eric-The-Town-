/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.control;

import citbyui.cit260.thetown.control.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eric and Brian
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcVolumeOfCave method, of class WorldsControl.
     */
    @Test
    public void testCalcVolumeOfCave() {
        System.out.println("calcVolumeOfCave");
        // test case 1
        System.out.println("\tTest case #1");
        double topRadius = 25.0;
        double midRadius = 30.0;
        double height = 100.0;
        MapControl instance = new MapControl();
        double expResult = 253945.41;
        double result;
        try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        
        // test case 2
        System.out.println("\tTest case #2");
        topRadius = 25.0;
        midRadius = 30.0;
        height = 0.0;
        try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            fail("Missing Exception test 2");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        
       // test case 3
        System.out.println("\tTest case #3");
        topRadius = 25.0;
        midRadius = 30.0;
        height = 151.0;
        try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            fail("Missing Exception test 3");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        // test case 4
        System.out.println("\tTest case #4");
        topRadius = 0.0;
        midRadius = 30.0;
        height = 100.0;
         try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            fail("Missing Exception test 4");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        // test case 5
        System.out.println("\tTest case #5");
        topRadius = 51.0;
        midRadius = 30.0;
        height = 100.0;
         try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            fail("Missing Exception test 5");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        // test case 6
        System.out.println("\tTest case #6");
        topRadius = 45.0;
        midRadius = 30.0;
        height = 100.0;
         try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            fail("Missing Exception test 6");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        // test case 7
        System.out.println("\tTest case #7");
        topRadius = 25.0;
        midRadius = 9.0;
        height = 100.0;
         try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            fail("Missing Exception test 7");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        // test case 8
        System.out.println("\tTest case #8");
        topRadius = 25.0;
        midRadius = 46.0;
        height = 100.0;
         try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            fail("Missing Exception test 8");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        // test case 9
        System.out.println("\tTest case #9");
        topRadius = 25.0;
        midRadius = 30.0;
        height = 10.0;
        expResult = 25394.54;
        try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        // test case 10
        System.out.println("\tTest case #10");
        topRadius = 25.0;
        midRadius = 30.0;
        height = 150.0;
        expResult = 380918.11;
       try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        
        // test case 11
        System.out.println("\tTest case #11");
        topRadius = 1.0;
        midRadius = 30.0;
        height = 100.0;
        expResult = 188600.28;
       try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        // test case 12
        System.out.println("\tTest case #12");
        topRadius = 25.0;
        midRadius = 45.0;
        height = 100.0;
        expResult = 489564.86;
        try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        // test case 13
        System.out.println("\tTest case #13");
        topRadius = 5.0;
        midRadius = 10.0;
        height = 10.0;
        expResult = 2356.19;
        try {
            result = instance.calcVolumeOfCave(topRadius, midRadius, height);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        
    }

    /**
     * Test of calcCaseCubeofABox method, of class WorldsControl.
     */
    // Brian Christian
    @Test
    public void testCalcCaseCubeofABox() {
        System.out.println("calcCaseCubeofABox");
        // test 1
        System.out.println("\tTest case #1");
        double height = 50.0;
        double width = 50.0;
        double length = 50.0;
        MapControl instance = new MapControl();
        double expResult = 72.34;
        double result; 
        try {
            result = instance.calcCaseCubeofABox(height, width, length);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
       
        // test 2
        System.out.println("\tTest case #2");
        height = 0.0;
        width = 50.0;
        length = 50.0;
         try {
            result = instance.calcCaseCubeofABox(height, width, length);
            fail("Missing Exception test 2");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
         
        // test 3
        System.out.println("\tTest case #3");
        height = 101.0;
        width = 50.0;
        length = 50.0;
         try {
            result = instance.calcCaseCubeofABox(height, width, length);
            fail("Missing Exception test 3");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        // test 4
        System.out.println("\tTest case #4");
        height = 50.0;
        width = 0.0;
        length = 50.0;
          try {
            result = instance.calcCaseCubeofABox(height, width, length);
            fail("Missing Exception test 4");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        // test 5
        System.out.println("\tTest case #5");
        height = 50.0;
        width = 101.0;
        length = 50.0;
         try {
            result = instance.calcCaseCubeofABox(height, width, length);
            fail("Missing Exception test 5");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        // test 6
        System.out.println("\tTest case #6");
        height = 50.0;
        width = 50.0;
        length = 0.0;
          try {
            result = instance.calcCaseCubeofABox(height, width, length);
            fail("Missing Exception test 6");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        // test 7
        System.out.println("\tTest case #7");
        height = 50.0;
        width = 50.0;
        length = 101.0;
          try {
            result = instance.calcCaseCubeofABox(height, width, length);
            fail("Missing Exception test 7");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
          
        // test 8
        System.out.println("\tTest case #8");
        height = 10.0;
        width = 50.0;
        length = 50.0;
        expResult = 14.46;
        try {
            result = instance.calcCaseCubeofABox(height, width, length);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        // test 9
        System.out.println("\tTest case #9");
        height = 100.0;
        width = 50.0;
        length = 50.0;
        expResult = 144.68;
        try {
            result = instance.calcCaseCubeofABox(height, width, length);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        // test 10
        System.out.println("\tTest case #10");
        height = 50.0;
        width = 100.0;
        length = 50.0;
        expResult = 144.68;
        try {
            result = instance.calcCaseCubeofABox(height, width, length);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        // test 11
        System.out.println("\tTest case #11");
        height = 50.0;
        width = 10.0;
        length = 50.0;
        expResult = 14.46;
        try {
            result = instance.calcCaseCubeofABox(height, width, length);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        // test 12
        System.out.println("\tTest case #12");
        height = 50.0;
        width = 50.0;
        length = 100.0;
        expResult = 144.68;
        try {
            result = instance.calcCaseCubeofABox(height, width, length);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        // test 13
        System.out.println("\tTest case #13");
        height = 50.0;
        width = 50.0;
        length = 10.0;
        expResult = 14.46;
        try {
            result = instance.calcCaseCubeofABox(height, width, length);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
       
    }

    /**
     * Test of calcWaterTank method, of class WorldsControl.
     */
    @Test
    public void testCalcWaterTank() {
        System.out.println("calcWaterTank");
        //test 1
        System.out.println("\t test #1");
        double areaOfBase = 100.0;
        double fillRate = 10.0;
        MapControl instance = new MapControl();
        double expResult = 10.0;
        double result; 
        try {
            result = instance.calcWaterTank(areaOfBase, fillRate);
            assertEquals(expResult, result, 0.01);
        } catch (MapControlException ex) {
            fail("Unexpected Exception" + ex.getMessage());
        }
        
        System.out.println("\t test #2");
        areaOfBase = 1101.0;
        fillRate = 1.0;
        try {
            result = instance.calcWaterTank(areaOfBase, fillRate);
            fail("Missing Exception test 2");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        System.out.println("\t test #3");
        areaOfBase = 1100.0;
        fillRate = 3.0;
        try {
            result = instance.calcWaterTank(areaOfBase, fillRate);
            fail("Missing Exception test 3");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
        
        System.out.println("\t test #4");
        areaOfBase = 1100.0;
        fillRate = 0.0;
        try {
            result = instance.calcWaterTank(areaOfBase, fillRate);
            fail("Missing Exception test 4");
        } catch (MapControlException ex) {
            assertTrue(true); 
        }
    }
    
}
