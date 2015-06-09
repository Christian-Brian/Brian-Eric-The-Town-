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
public class CalcWaterTankView {
    
    private final String MENU = "\n"
            + "\n=================================="
            + "\n   Calculate Water Tank Problem   "
            + "\n=================================="
            + "\nA water tank, having the shape of a rectangular prism of base 100"
            + "\nsquare centimeters is being filled at the rate of 1 liter per minute."
            + "\nFind the rate at which the height of the water in the water tank "
            + "\nincreases. Express your answer in centimeters per minute."
            + "\nQuit - go back"
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
                        System.out.println("What is the answer?");
                        
                        //get the name from the keyboard and trim off the blanks
                        menuSelection = keyboard.nextLine();
                        menuSelection = menuSelection.trim();
                        
                        //if the name is invalid
                        if (menuSelection.length() < 2) {
                            System.out.println("wrong.");
                            continue; //and repeat again
                        }
                        break; //out of the repitition (exit)
                    }
                
                    return menuSelection; //return the name
    }

    private void doAction(String selection) {
        
        switch (selection) {
            case "start": //create and start a new game
                this.startNewGame();
                break;
            case "continue": //continue existing game
                this.startExistingGame();
                break;
            case "help": // display help menu
                this.displayHelpMenu();
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
        System.out.println("*** startExistingGame function called ***");    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
}

    void displayProblem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    
