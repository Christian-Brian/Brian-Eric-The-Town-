/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import the.town.TheTown;

/**
 *
 * @author Eric and Brian
 */
public abstract class View implements ViewInterface {

    private String promptMessage;

    protected final BufferedReader keyboard = TheTown.getInFile();
    protected final PrintWriter console = TheTown.getOutFile();

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {

        String selection = " ";
        boolean doQuit;
        do {

            this.console.println(promptMessage); //display the main menu

            String input = this.getInput(); //get the user selection
            input = input.trim();
            int position = input.indexOf(' ', 0);
            if (position > 1) {
                input = input.substring(0, position - 1);
            }
            selection = input.toLowerCase();
            doQuit = this.doAction(selection); //do action based on  selection

//        } while (!selection.equals("quit")); //a selection is not an "Exit"
        } while (!doQuit); //a selection is not an "Exit"
    }

    @Override
    public String getInput() {

        boolean valid = false; //indicates if the name has been retrived
        String menuSelection = null;
//        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        try {

            while (!valid) { //while a valid name has not been retrived

                //prompt for the players name
                this.console.println("Enter a value below");

                //get the name from the keyboard and trim off the blanks
                menuSelection = this.keyboard.readLine();
                menuSelection = menuSelection.trim();

                //if the name is invalid
                if (menuSelection.length() < 2) {
                    ErrorView.display(this.getClass().getName(),"Input too short");
                    continue; //and repeat again
                }
                break; //out of the repitition (exit)
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        return menuSelection; //return the name
    }

}
