/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.control;

import citbyui.cit260.thetown.control.GameControl.Item;
import citbyui.cit260.thetown.model.Resources;
import the.town.TheTown;

/**
 *
 * @author Eric and Brian
 */
public class ResourcesControl {
    public static void addToInventory(double amount, Item type){
        Resources[] inventoryList = TheTown.getCurrentGame().getInventory();
        double currentAmount = inventoryList[type.ordinal()].getAmount();
        double total = currentAmount + amount;
        if (type == Item.gold && total > 100) total = 100;
        if (type != Item.gold && total > 1) total = 1;
        inventoryList[type.ordinal()].setAmount(total);
    
    }
    
//    public static int addToInventory(int amount, String type, String character){
//        System.out.println("addToInventory stub function called");
//        return 0;
//    }
    
//    public static double calcCaseCube(double d, double d0, double d1) {
//        System.out.println("addToInventory stub function called");
//        return 0;
//    }
    
    public static int countInventoryItems(Resources[] inventory) {
    int count = 0;
    for (Resources item: inventory) {
        if (item.getAmount() > 0)
            count++;
    }
    return count;
}
    
}
