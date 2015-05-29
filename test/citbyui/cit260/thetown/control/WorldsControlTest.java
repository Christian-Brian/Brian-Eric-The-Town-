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
 * @author Eric
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
        double topRadius = 25.0;
        double midRadius = 30.0;
        double height = 10.0;
        WorldsControl instance = new WorldsControl();
        double expResult = 84648.46;
        double result = instance.calcVolumeOfCave(topRadius, midRadius, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
