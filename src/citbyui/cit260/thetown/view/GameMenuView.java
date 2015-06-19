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
 * @author Eric
 */
public class GameMenuView extends View {

    public GameMenuView(){
        super("\n"
            + "\n=================================="
            + "\n            Game Menu             "
            + "\n=================================="
            + "\nMap - Map"
            + "\nTown - Town"
            + "\nInventory - Inventory"
            + "\nSave - Save game"
            + "\nRestart - Restart game"
            + "\nWater Tank - display word problem"
            + "\nCase - Case"
            + "\nQuit - Quit game"
            + "\n==================================");
    
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
//                String menuSelection = null;
//                Scanner keyboard = new Scanner(System.in); //keyboard input stream
//                
//                while(!valid) { //while a valid name has not been retrived
//                    
//                        //prompt for the players name
//                        System.out.println("Select a menu option");
//                        
//                        //get the name from the keyboard and trim off the blanks
//                        menuSelection = keyboard.nextLine();
//                        menuSelection = menuSelection.trim();
//                        
//                        //if the name is invalid
//                        if (menuSelection.length() < 2) {
//                            System.out.println("Invalid selection");
//                            continue; //and repeat again
//                        }
//                        break; //out of the repitition (exit)
//                    }
//                
//                    return menuSelection; //return the name
    }
    
    @Override
    public boolean doAction(Object obj) {
        String selection = (String) obj; 
        
        switch (selection) {
            case "map": //display map
                this.displayMap();
                break;
            case "town": //display town
                this.displayTown();
                break;
            case "inventory": // display inventory
                this.displayInventory();
                break;
            case "save": // save game
                this.saveCurrentGame();
                break;
            case "restart": // restart game
                this.restartGame();
                break;
            case "water": // restart game
                this.waterTank();
                break;
            case "case": // restart game
                this.caseCubeofABox();
                break;
            case "quit": //exit program
                return true;
            default:
                System.out.println("\n*** Invalid Selection. Try Again");
                break;
        }
        return false;
    }

    private void startNewGame() {
            //create a new game
        GameControl.createNewGame(TheTown.getPlayer());
        
            //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayMap() {
        System.out.println("*** displayMap stub function called ***");
    }

    private void displayTown() {
        System.out.println("*** displayTown stub function called ***");
    }

    private void displayInventory() {
        //display the inventory
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }

    private void saveCurrentGame() {
        System.out.println("*** saveCurrentGame stub function called ***");
    }

    private void restartGame() {
        System.out.println("*** restartGame stub function called ***");
    }

    private void waterTank() {
        //display the inventory
        CalcWaterTankView calcWaterTank = new CalcWaterTankView("");
        calcWaterTank.display();
    }

    private void caseCubeofABox() {
         //display the inventory
        CalcCaseCubeofABox calcCaseCube = new CalcCaseCubeofABox("");
        calcCaseCube.display();
    }
    

}
