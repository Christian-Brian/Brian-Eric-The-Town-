/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eric and Brian
 */
public class WorldsControlTest {
    
    public WorldsControlTest() {
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
        WorldsControl instance = new WorldsControl();
        double expResult = 253945.41;
        double result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.01);
        
        // test case 2
        System.out.println("\tTest case #2");
        topRadius = 25.0;
        midRadius = 30.0;
        height = 0.0;
        expResult = -1;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.0);
        
       // test case 3
        System.out.println("\tTest case #3");
        topRadius = 25.0;
        midRadius = 30.0;
        height = 151.0;
        expResult = -1;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.0);
        
        // test case 4
        System.out.println("\tTest case #4");
        topRadius = 0.0;
        midRadius = 30.0;
        height = 100.0;
        expResult = -1;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.0);
        
        // test case 5
        System.out.println("\tTest case #5");
        topRadius = 51.0;
        midRadius = 30.0;
        height = 100.0;
        expResult = -1;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.0);
        
        // test case 6
        System.out.println("\tTest case #6");
        topRadius = 45.0;
        midRadius = 30.0;
        height = 100.0;
        expResult = -1;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.0);
        
        // test case 7
        System.out.println("\tTest case #7");
        topRadius = 25.0;
        midRadius = 9.0;
        height = 100.0;
        expResult = -1;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.0);
        
        // test case 8
        System.out.println("\tTest case #8");
        topRadius = 25.0;
        midRadius = 46.0;
        height = 100.0;
        expResult = -1;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.0);
        
        // test case 9
        System.out.println("\tTest case #9");
        topRadius = 25.0;
        midRadius = 30.0;
        height = 10.0;
        expResult = 25394.54;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.1);
        
        // test case 10
        System.out.println("\tTest case #10");
        topRadius = 25.0;
        midRadius = 30.0;
        height = 150.0;
        expResult = 380918.11;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.1);
        
        
        // test case 11
        System.out.println("\tTest case #11");
        topRadius = 1.0;
        midRadius = 30.0;
        height = 100.0;
        expResult = 188600.28;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.1);
        
        // test case 12
        System.out.println("\tTest case #12");
        topRadius = 25.0;
        midRadius = 45.0;
        height = 100.0;
        expResult = 489564.86;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.1);
        
        // test case 13
        System.out.println("\tTest case #13");
        topRadius = 5.0;
        midRadius = 10.0;
        height = 10.0;
        expResult = 2356.19;
        result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.1);
        
        
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
        WorldsControl instance = new WorldsControl();
        double expResult = 72.34;
        double result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.01);
       
        // test 2
        System.out.println("\tTest case #2");
        height = 0.0;
        width = 50.0;
        length = 50.0;
        expResult = -1;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.0);
        
        // test 3
        System.out.println("\tTest case #3");
        height = 101.0;
        width = 50.0;
        length = 50.0;
        expResult = -1;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.0);
        
        // test 4
        System.out.println("\tTest case #4");
        height = 50.0;
        width = 0.0;
        length = 50.0;
        expResult = -1;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.0);
        
        // test 5
        System.out.println("\tTest case #5");
        height = 50.0;
        width = 101.0;
        length = 50.0;
        expResult = -1;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.0);
        
        // test 6
        System.out.println("\tTest case #6");
        height = 50.0;
        width = 50.0;
        length = 0.0;
        expResult = -1;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.0);
        
        // test 7
        System.out.println("\tTest case #7");
        height = 50.0;
        width = 50.0;
        length = 101.0;
        expResult = -1;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.0);
        
        // test 8
        System.out.println("\tTest case #8");
        height = 10.0;
        width = 50.0;
        length = 50.0;
        expResult = 14.46;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.01);
        
        // test 9
        System.out.println("\tTest case #9");
        height = 100.0;
        width = 50.0;
        length = 50.0;
        expResult = 144.68;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.01);
        
        // test 10
        System.out.println("\tTest case #10");
        height = 50.0;
        width = 100.0;
        length = 50.0;
        expResult = 144.68;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.01);
        
        // test 11
        System.out.println("\tTest case #11");
        height = 50.0;
        width = 10.0;
        length = 50.0;
        expResult = 14.46;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.01);
        
        // test 12
        System.out.println("\tTest case #12");
        height = 50.0;
        width = 50.0;
        length = 100.0;
        expResult = 144.68;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.01);
        
        // test 13
        System.out.println("\tTest case #13");
        height = 50.0;
        width = 50.0;
        length = 10.0;
        expResult = 14.46;
        result = instance.calcCaseCubeofABox(height, width, length);
        assertEquals(expResult, result, 0.01);
       
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
        WorldsControl instance = new WorldsControl();
        double expResult = 10.0;
        double result = instance.calcWaterTank(areaOfBase, fillRate);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t test #2");
        areaOfBase = 1101.0;
        fillRate = 1.0;
        expResult = -1.0;
        result = instance.calcWaterTank(areaOfBase, fillRate);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t test #3");
        areaOfBase = 1100.0;
        fillRate = 3.0;
        expResult = -1.0;
        result = instance.calcWaterTank(areaOfBase, fillRate);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t test #4");
        areaOfBase = 1100.0;
        fillRate = 0.0;
        expResult = -1.0;
        result = instance.calcWaterTank(areaOfBase, fillRate);
        assertEquals(expResult, result, 0.0);
    }
    
}
