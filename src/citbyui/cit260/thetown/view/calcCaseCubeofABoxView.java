/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

import java.util.Scanner;

/**
 *
 * @author bchrist
 */
public class calcCaseCubeofABoxView {
   
//   private void displayBanner() {
//        
//        System.out.println("\n\n***************************************"); 
//        
//        System.out.println("*                                         *"
//                        + "\n* Temporarily marooned in a strange town, *"
//                        + "\n* you must explore the surrounding areas  *"
//                        + "\n* North, South, East, and West of town    *"
//                        + "\n* searching for resources and information *"
//                        + "\n* to help you leave town unharmed.        *"
//                        + "\n* Each time you play you have 1 hour      *"
//                        + "\n* to complete the game.                   *");
//   }
    public void calcCaseCubeofABox() {
        
        double selection = 523.67;
        do {
            
//            System.out.println(MENU); //display the main menu
            
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
            case "": //create and start a new game
                this.displayGold();
                break;
            case "": //continue existing game
                this.displayCloak();
                break;
            case "quit": //exit program
                return;
            default:
                System.out.println("\n*** Invalid Selection. Try Again");
                break;
        }
    }
    
 }
}
    
}
