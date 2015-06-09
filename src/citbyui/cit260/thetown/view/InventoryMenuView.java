/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

import citbyui.cit260.thetown.control.GameControl;
import java.util.Scanner;
import the.town.TheTown;

/**
 *
 * @author Brian
 */
public class InventoryMenuView {
    

    private final String MENU = "\n"
            + "\n=================================="
            + "\n|         Inventory Menu          "
            + "\n=================================="
            + "\nGold - 0/50"
            + "\nCloak - 0/1"
            + "\nSnorkel - 0/1"
            + "\nBadge - 0/1"
            + "\nShovel - 0/1"
            + "\nQuit - Quit"
            + "\n==================================";
    
    public void displayMenu() {
        
        String selection = " ";
        do {
            
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); //get the user selection
            input = input.trim();
            int position = input.indexOf(' ', 0); 
                if (position > 1){
                    input = input.substring(0, position-1);
                }
            selection = input.toLowerCase();
            this.doAction(selection); //do action based on  selection
            
        } while (!selection.equals("quit")); //a selection is not an "Exit"
        
    }

    private String getInput() {
        boolean valid = false; //indicates if the name has been retrived
                String inventorySelection = null;
                Scanner keyboard = new Scanner(System.in); //keyboard input stream
                
                while(!valid) { //while a valid name has not been retrived
                    
                        //prompt for the players name
                        System.out.println("View Inventory");
                        
                        //get the name from the keyboard and trim off the blanks
                        inventorySelection = keyboard.nextLine();
                        inventorySelection = inventorySelection.trim();
                        
                        //if the name is invalid
                        if (inventorySelection.length() < 2) {
                            System.out.println("Invalid selection");
                            continue; //and repeat again
                        }
                        break; //out of the repitition (exit)
                    }
                
                    return inventorySelection; //return the name
    }

    private void doAction(String selection) {
        
        switch (selection) {
            case "gold": //create and start a new game
                this.displayGold();
                break;
            case "cloak": //continue existing game
                this.displayCloak();
                break;
            case "shovel": // display help menu
                this.displayshovel();
                break;
            case "snorkel": // display help menu
                this.displaysnorkel();
                break;
            case "badge": // display help menu
                this.displaybadge();
                break;
            case "quit": //exit program
                return;
            default:
                System.out.println("\n*** Invalid Selection. Try Again");
                break;
        }
    }

    private void startNewGame() {
            //create a new game
        GameControl.createNewGame(TheTown.getPlayer());
        
            //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayGold() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayCloak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayshovel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displaysnorkel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displaybadge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
