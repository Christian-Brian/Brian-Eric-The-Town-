/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

import citbyui.cit260.thetown.control.GameControl;
import citbyui.cit260.thetown.control.ResourcesControl;
import citbyui.cit260.thetown.control.WorldsControl;
import java.util.Scanner;
import the.town.TheTown;

/**
 *
 * @author Eric
 */
public class CalcCaseCubeofABox {
    
    private final String MENU = "\n"
            + "\n=================================="
            + "\n   Calculate Case Cube Of A Box  "
            + "\n=================================="
            + "\nYou enter a cave."
            + "\n==================================";
    
    public void displayMenu() {
        
        int result = -1;
        
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
            result = this.doAction(selection); //do action based on  selection
            
        } while (result < 0); //a selection is not an "Exit"
        
    }

    private String getInput() {
        boolean valid = false; //indicates if the name has been retrived
                String menuSelection = null;
                Scanner keyboard = new Scanner(System.in); //keyboard input stream
                
                while(!valid) { //while a valid name has not been retrived
                    
                        //prompt for the players name
                        System.out.println("What is the case cube of a box?");
                        
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

    private int doAction(String answer) {
        
        double guess = Double.parseDouble(answer);
        
        double caseCube = WorldsControl.calcCaseCubeofABox(50.0, 50.0, 50.0);
        if (guess == caseCube) {
            ResourcesControl.addToInventory(50, "gold");
            System.out.println("+50 gold to inventory.");
            return 1;
        }
        else{
            System.out.println("Your answer is incorrect. Try again.");
            return -1;
        }
        
        //if correct
        // let them into the barrel
        
        
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

    private void cmPerMin() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
    
}
    