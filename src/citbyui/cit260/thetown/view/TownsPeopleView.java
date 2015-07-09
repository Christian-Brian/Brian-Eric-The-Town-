/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package citbyui.cit260.thetown.view;


import citbyui.cit260.thetown.control.CharactersControl;

/**
 *
 * @author Eric
 */

public class TownsPeopleView extends View {
 
    public TownsPeopleView(){
        super("\n"
            + "\n=================================="
            + "\n             In Town              "
            + "\n=================================="
            + "\nYou look out and see a midevil looking town."
            + "\nThere are lots of people, shops, and houses."
            + "\nYou can see John, Abraham, and Rachael standing"
            + "\nin town square talking. Mark is off in the"
            + "\ndistance in his blacksmith shop. Wayne is alone,"
            + "\nfishing off the bridge. Alfred is swimming"
            + "\nwith a large group of people in the lake."
            + "\nGordon is tilling a garden."
            + "\nWho - Who can i talk to?"
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
//                String helpSelection = null;
//                Scanner keyboard = new Scanner(System.in); //keyboard input stream
//                
//                while(!valid) { //while a valid name has not been retrived
//                    
//                        //prompt for the players name
//                        System.out.println("Select a  help menu option");
//                        
//                        //get the name from the keyboard and trim off the blanks
//                        helpSelection = keyboard.nextLine();
//                        helpSelection = helpSelection.trim();
//                        
//                        //if the name is invalid
//                        if (helpSelection.length() < 2) {
//                            System.out.println("Invalid selection");
//                            continue; //and repeat again
//                        }
//                        break; //out of the repitition (exit)
//                    }
//                
//                    return helpSelection; //return the name
    }
    @Override
    public boolean doAction(Object obj) {
        String selection = (String) obj;
        
        switch (selection) {
            case "mary": //create and start a new game
                this.displayTownsPeople(selection);
                break;
            case "adam": //continue existing game
                this.displayTownsPeople(selection);
                break;
            case "john": // display help menu
                this.displayTownsPeople(selection);
                break;
            case "wayne": // display help menu
                this.displayTownsPeople(selection);
                break;
            case "rachael": // display help menu
                this.displayTownsPeople(selection);
                break;
            case "selina": // display help menu
                this.displayTownsPeople(selection);
                break;
            case "abraham": // display help menu
                this.displayTownsPeople(selection);
                break;
            case "alfred": // display help menu
                this.displayTownsPeople(selection);
                break;
            case "gordon": // display help menu
                this.displayTownsPeople(selection);
                break;
            case "who": // display help menu
                this.displayWho(selection);
                break;
            case "quit": //exit program
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection. Try Again");
                break;
        }
        return false;
    }


    private void displayTownsPeople(String selection) {
        Character character = CharactersControl.getCharacter(selection);
        this.console.println("display character paragraph");
        
    }

    private void displayWho(String selection) {
    //sort the array of charactes
    //go through each character get the name, and print the name
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


       
    


