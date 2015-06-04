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
 * @author Eric & Brian
 */
public class HelpMenuView {
    

    private final String MENU = "\n"
            + "\n=================================="
            + "\n            Help Menu             "
            + "\n=================================="
            + "\nControls - Controls"
            + "\nMap - Map"
            + "\nTown - Town"
            + "\nInventory - Inventory"
            + "\nGame - Game Menu"
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
                String menuSelection = null;
                Scanner keyboard = new Scanner(System.in); //keyboard input stream
                
                while(!valid) { //while a valid name has not been retrived
                    
                        //prompt for the players name
                        System.out.println("Select a  help menu option");
                        
                        //get the name from the keyboard and trim off the blanks
                        menuSelection = keyboard.nextLine();
                        menuSelection = menuSelection.trim();
                        
                        //if the name is invalid
                        if (menuSelection.length() < 2) {
                            System.out.println("Invalid selection");
                            continue; //and repeat again
                        }
                        break; //out of the repitition (exit)
                    }
                
                    return menuSelection; //return the name
    }

    private void doAction(String selection) {
        
        switch (selection) {
            case "controls": //create and start a new game
                this.displayConrolsMenu();
                break;
            case "map": //continue existing game
                this.displayMap();
                break;
            case "town": // display help menu
                this.displayTown();
                break;
            case "inventory": // display help menu
                this.displayInventoryMenu();
                break;
            case "game": // display help menu
                this.displayGameMenu();
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


    private void displayConrolsMenu() {
        System.out.println("*** displayControlsMenu function called ***");
    }

    private void displayMap() {
        System.out.println("*** displayMap function called ***");
    }

    private void displayTown() {
        System.out.println("*** displayTown function called ***");
    }

    private void displayInventoryMenu() {
        System.out.println("*** displayInventoryMenu function called ***");
    }

    private void displayGameMenu() {
        System.out.println("*** displayGameMenu function called ***");
    }
    
}

