/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

import citbyui.cit260.thetown.control.ProgramControl;
import citbyui.cit260.thetown.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import the.town.TheTown;

public class StartProgramView {
    protected final BufferedReader keyboard = TheTown.getInFile();
    protected final PrintWriter console = TheTown.getOutFile();
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
        
        //display the main menu
        MainMenuView mainMenu = new MainMenuView();

        
        mainMenu.display();
      
       
}

    private void displayBanner() {
        
        this.console.println("\n\n***************************************");
        
        this.console.println("*                                          *"
                        + "\n*           Welcome to The Town.           "
                        + "\n*       A text based adventure game.       ");
        
        this.console.println("*                                         *"
                        + "\n* Temporarily marooned in a strange town, *"
                        + "\n* you must explore the surrounding areas  *"
                        + "\n* North, South, East, and West of town    *"
                        + "\n* searching for resources and information *"
                        + "\n* to help you leave town unharmed.        *"
                        + "\n* Each time you play you have 1 hour      *"
                        + "\n* to complete the game.                   *");
        
        this.console.println("*                                          *"
                        + "\n*          Have fun adventuring!          *"
                        + "\n*                                         *");
        
        this.console.println("\n\n****************************************");
    }

    private String getPlayersName() {
        boolean valid = false; //indicates if the name has been retrived
                String playersName = null;
//                Scanner keyboard = new Scanner(System.in); //keyboard input stream
                try {
                while(!valid) { //while a valid name has not been retrived
                    
                        //prompt for the players name
                        this.console.println("Enter the characters name below:");
                        
                        //get the name from the keyboard and trim off the blanks
                        playersName = this.keyboard.readLine();
                        playersName = playersName.trim();
                        
                        //if the name is invalid
                        if (playersName.length() < 2) {
                            ErrorView.display(this.getClass().getName(),"Invalid name - the name must not be blank");
                            continue; //and repeat again
                        }
                        break; //out of the repitition (exit)
                    }
                } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
                    return playersName; //return the name
                }

    private void displayWelcomeMessage(Player player) {
        this.console.println("\n\n====================================");
        this.console.println("\tWelcome to the game, " + player.getName() + ("."));
        this.console.println("\tEnjoy yourself.");
        this.console.println("========================================");
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
