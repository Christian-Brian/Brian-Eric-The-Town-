/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

import citbyui.cit260.thetown.control.ProgramControl;
import citbyui.cit260.thetown.model.Player;
import java.util.Scanner;

public class StartProgramView {
    
    public StartProgramView() {
        
    }
    
    public void startProgram() {
        // Display the banner screen
        this.displayBanner();
        
        //prompt the player to enter their name
        String playersName = this.getPlayersName();
        
        //create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        //display a personalized welcome message
        this.displayWelcomeMessage(player);
      
}

    private void displayBanner() {
        
        System.out.println("\n\n***************************************");
        
        System.out.println("*                                          *"
                        + "\n*           Welcome to The Town.           "
                        + "\n*       A text based adventure game.       ");
        
        System.out.println("*                                         *"
                        + "\n* Temporarily marooned in a strange town, *"
                        + "\n* you must explore the surrounding areas  *"
                        + "\n* North, South, East, and West of town    *"
                        + "\n* searching for resources and information *"
                        + "\n* to help you leave town unharmed.        *"
                        + "\n* Each time you play you have 1 hour      *"
                        + "\n* to complete the game.                   *");
        
        System.out.println("*                                          *"
                        + "\n*          Have fun adventuring!          *"
                        + "\n*                                         *");
        
        System.out.println("\n\n****************************************");
    }

    private String getPlayersName() {
        boolean valid = false; //indicates if the name has been retrived
                String playersName = null;
                Scanner keyboard = new Scanner(System.in); //keyboard input stream
                
                while(!valid) { //while a valid name has not been retrived
                    
                        //prompt for the players name
                        System.out.println("Enter the characters name below:");
                        
                        //get the name from the keyboard and trim off the blanks
                        playersName = keyboard.nextLine();
                        playersName = playersName.trim();
                        
                        //if the name is invalid
                        if (playersName.length() < 2) {
                            System.out.println("Invalid name - the name must not be blank");
                            continue; //and repeat again
                        }
                        break; //out of the repitition (exit)
                    }
                
                    return playersName; //return the name
                }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n====================================");
        System.out.println("\tWelcome to the game. " + player.getName());
        System.out.println("\tEnjoy yourself.");
        System.out.println("========================================");
    }
    
}
