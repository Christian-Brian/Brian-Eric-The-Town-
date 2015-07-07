/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

import citbyui.cit260.thetown.control.GameControl;
import citbyui.cit260.thetown.control.ResourcesControl;
import citbyui.cit260.thetown.control.MapControl;
import citbyui.cit260.thetown.control.exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import the.town.TheTown;

/**
 *
 * @author Eric
 */
public class CalcVolumeOfCave extends View {

    public CalcVolumeOfCave(String promptMessage) {
        super("\n"
                + "\n=================================="
                + "\n   Calculate Volume of cave Problem   "
                + "\n=================================="
                + "\nA water tank, having the shape of a rectangular prism of base 100"
                + "\nsquare centimeters is being filled at the rate of 1 liter per minute."
                + "\nFind the rate at which the height of the water in the water tank "
                + "\nincreases. Express your answer as a whole number."
                + "\nQuit - go back"
                + "\n==================================");
    }

//    @Override
//    public void display() {
//        
//        int result = -1;
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
//            result = this.doAction(selection); //do action based on  selection
//            
//        } while (result < 0); //a selection is not an "Exit"
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
//                        System.out.println("What is the answer?");
//                        
//                        //get the name from the keyboard and trim off the blanks
//                        menuSelection = keyboard.nextLine();
//                        menuSelection = menuSelection.trim();
//                        
//                        //if the name is invalid
//                        if (menuSelection.length() < 2) {
//                            System.out.println("wrong.");
//                            continue; //and repeat again
//                        }
//                        break; //out of the repitition (exit)
//                    }
//                
//                    return menuSelection; //return the name
//    }
    @Override
    public boolean doAction(Object obj) {
        String answer = (String) obj;
        double guess;
        if (answer.compareToIgnoreCase("quit") == 0){
            return true;
        }
            
        
        try {
            guess = Double.parseDouble(answer);
        } catch (NumberFormatException nf) {
            System.out.println("\n You must enter a valid number."
                    + " Try again or enter quit.");
            return false;
        }

        try {
            double waterTank = MapControl.calcVolumeOfCave(25.0, 30.0, 100.0);

            if (guess == waterTank) {
                ResourcesControl.addToInventory(50, "gold");
                System.out.println("You found the treasure. +50 gold to inventory.");
                return true;
            } else {
                System.out.println("Your answer is incorrect. Try again.");
            }

        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
        return false;
    }
}
