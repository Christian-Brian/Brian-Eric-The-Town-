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
 * @author Eric and Brian
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n=================================="
                + "\n            Main Menu             "
                + "\n=================================="
                + "\nStart - Start game"
                + "\nContinue - Continue game"
                + "\nHelp - Get help"
                + "\nSave - Save game"
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
            case "start": //create and start a new game
                this.startNewGame();
                break;
            case "continue": //continue existing game
                this.startExistingGame();
                break;
            case "help": // display help menu
                this.displayHelpMenu();
                break;
            case "save": // save game
                this.saveCurrentGame();
                break;
            case "quit": //exit program
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid Selection. Try Again");
                break;
        }
        return false;
    }

    private void startNewGame() {

        boolean startOver;
        do {
            //create a new game
            GameControl.createNewGame(TheTown.getPlayer());

            //display the game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
            startOver = gameMenu.getRestart();
        } while (startOver);
    }

    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for file where the game "
                + "is to be saved.");
        String filePath = this.getInput();

        try {
            GameControl.getExistingGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveCurrentGame() {
        this.console.println("\n\nEnter the file path for file where the game "
                + "is to be saved.");
        String filePath = this.getInput();

        try {
            GameControl.saveGame(TheTown.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenyView", ex.getMessage());
        }
    }
}
