/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

import citbyui.cit260.thetown.control.GameControl;
import citbyui.cit260.thetown.control.GameControl.Item;
import citbyui.cit260.thetown.control.ResourcesControl;
import citbyui.cit260.thetown.model.Resources;
import java.util.Scanner;
import the.town.TheTown;

/**
 *
 * @author Brian
 */
public class InventoryMenuView extends View {

    public InventoryMenuView() {
        super("");
        String prompt = "\n"
                + "\n=================================="
                + "\n          Inventory Menu          "
                + "\n==================================";

        Resources[] inventory = GameControl.getSortedInventoryList();

        for (Resources item : inventory) {
            prompt += "\n" + item.getType();
        }
        prompt += "\nCount"
                + "\nQuit"
                + "\n==================================";
        setPromptMessage(prompt);

    }

//    public void displayMenu() {
//        
//        String selection = " ";
//        do {
//            
//            System.out.println(MENU); //display the main menu
//            
//            String input = this.getInput(); //get the user selection
//            input = input.trim();
//            int position = input.indexOf(' ', 0); 
//                if (position > 1){
//                    input = input.substring(0, position-1);
//                }
//            selection = input.toLowerCase();
//            this.doAction(selection); //do action based on  selection
//            
//        } while (!selection.equals("quit")); //a selection is not an "Exit"
//        
//    }
//
//    private String getInput() {
//        boolean valid = false; //indicates if the name has been retrived
//                String inventorySelection = null;
//                Scanner keyboard = new Scanner(System.in); //keyboard input stream
//                
//                while(!valid) { //while a valid name has not been retrived
//                    
//                        //prompt for the players name
//                        System.out.println("View Inventory");
//                        
//                        //get the name from the keyboard and trim off the blanks
//                        inventorySelection = keyboard.nextLine();
//                        inventorySelection = inventorySelection.trim();
//                        
//                        //if the name is invalid
//                        if (inventorySelection.length() < 2) {
//                            System.out.println("Invalid selection");
//                            continue; //and repeat again
//                        }
//                        break; //out of the repitition (exit)
//                    }
//                
//                    return inventorySelection; //return the name
    @Override
    public boolean doAction(Object obj) {
        String selection = (String) obj;

        switch (selection) {
            case "gold": //create and start a new game
                this.displayGold();
                break;
            case "cloak": //continue existing game
                this.displayCloak();
                break;
            case "shovel": // display help menu
                this.displayShovel();
                break;
            case "snorkel": // display help menu
                this.displaySnorkel();
                break;
            case "badge": // display help menu
                this.displayBadge();
                break;
            case "count": // display help menu
                this.displayCount();
                break;    
            case "quit": //exit program
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid Selection. Try Again");
                break;
        }
        return false;
    }

    private void displayGold() {
        Resources[] inventory = TheTown.getCurrentGame().getInventory();
        this.console.println("You have " + inventory[Item.gold.ordinal()].getAmount() + " amount of Gold.");
    }

    private void displayCloak() {
        Resources[] inventory = TheTown.getCurrentGame().getInventory();
        if (inventory[Item.cloak.ordinal()].getAmount() > 0) {
            this.console.println("You have the cloak.");
        } else {
            this.console.println("You don't have the cloak.");
        }
    }

    private void displayShovel() {
        Resources[] inventory = TheTown.getCurrentGame().getInventory();
       if (inventory[Item.shovel.ordinal()].getAmount() > 0) {
            this.console.println("You have the shovel.");
        } else {
            this.console.println("You don't have the shovel.");
        }
    }

    private void displaySnorkel() {
        Resources[] inventory = TheTown.getCurrentGame().getInventory();
        if (inventory[Item.snorkel.ordinal()].getAmount() > 0) {
            this.console.println("You have the snorkel.");
        } else {
            this.console.println("You don't have the snorkel.");
        }
    }

    private void displayBadge() {
        Resources[] inventory = TheTown.getCurrentGame().getInventory();
        if (inventory[Item.badge.ordinal()].getAmount() > 0) {
            this.console.println("You have the badge.");
        } else {
            this.console.println("You don't have the badge.");
        }
    }

    private void displayCount() {
        Resources[] inventory = TheTown.getCurrentGame().getInventory();
        int result = ResourcesControl.countInventoryItems(inventory);
        this.console.println("You have " + result + " out of " + inventory.length + " items.");
    }

}
