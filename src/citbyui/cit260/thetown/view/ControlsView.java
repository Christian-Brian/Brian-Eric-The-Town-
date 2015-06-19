/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

/**
 *
 * @author bchrist
 */
public class ControlsView extends View {
    
    

    public ControlsView(){     
        super("\n"
            + "\n=================================="
            + "\n|           Controls              "
            + "\n=================================="
            + "\nNorth - Moves a space north"
            + "\nSouth - Moves a space south"
            + "\nEast - Moves a space east"
            + "\nWest - Moves a space west"
            + "\nQuit - Quit"
            + "\n==================================");
    
    }
    
    
    @Override
    public boolean doAction(Object obj) {
        String selection = (String) obj; 
        
        switch (selection) {
            case "north": //create and start a new game
                this.goNorth();
                break;
            case "south": //continue existing game
                this.goSouth();
                break;
            case "east": // display help menu
                this.goEast();
                break;
            case "west": // display help menu
                this.goWest();
                break;
            case "quit": //exit program
                return true;
            default:
                System.out.println("\n*** Invalid Selection. Try Again");
                break;
        }
        return false;
    }

    private void goNorth() {
        System.out.println("goNorth function called");
    }

    private void goSouth() {
        System.out.println("goSouth function called");
    }

    private void goWest() {
        System.out.println("goWest function called");
    }

    private void goEast() {
        System.out.println("goEast function called");
    }
}    
