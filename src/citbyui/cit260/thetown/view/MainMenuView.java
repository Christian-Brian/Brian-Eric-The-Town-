/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

/**
 *
 * @author Eric
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n=================================="
            + "\n|            Main Menu            "
            + "\n=================================="
            + "\nStart - Start game"
            + "\nContinue - Continue game"
            + "\nHelp - Get help"
            + "\nQuit - Quit game"
            + "\n==================================";
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); //get the user selection
            selection = input.charAt(0); //gets the first 
        }
        
    }
    
}
