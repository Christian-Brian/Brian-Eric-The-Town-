/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.control;

import citbyui.cit260.thetown.model.Resources;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bchrist
 */
public class ResourcesControlTest {
    
    public ResourcesControlTest() {
    }

    /**
     * Test of countInventoryItems method, of class ResourcesControl.
     */
    @Test
    public void testCountInventoryItems() {
        System.out.println("countInventoryItems");
        // test case 1
        System.out.println("\tTest case #1");
        Resources[] inventory = GameControl.createInventoryList();
        int expResult = 0;
        int result = ResourcesControl.countInventoryItems(inventory);
        assertEquals(expResult, result);
    
        // test case 2
        System.out.println("\tTest case #2");
        inventory[GameControl.Item.gold.ordinal()].setAmount(1);
        expResult = 1;
        result = ResourcesControl.countInventoryItems(inventory);
        assertEquals(expResult, result);
        
        // test case 3
        System.out.println("\tTest case #3");
        inventory[GameControl.Item.gold.ordinal()].setAmount(1);
        inventory[GameControl.Item.snorkel.ordinal()].setAmount(1);
        expResult = 2;
        result = ResourcesControl.countInventoryItems(inventory);
        assertEquals(expResult, result);
        
        // test case 4
        System.out.println("\tTest case #4");
        inventory[GameControl.Item.gold.ordinal()].setAmount(1);
        inventory[GameControl.Item.badge.ordinal()].setAmount(1);
        inventory[GameControl.Item.snorkel.ordinal()].setAmount(1);
        inventory[GameControl.Item.cloak.ordinal()].setAmount(1);
        inventory[GameControl.Item.shovel.ordinal()].setAmount(1);        
        expResult = 5;
        result = ResourcesControl.countInventoryItems(inventory);
        assertEquals(expResult, result);
        
        
    }
    
}
