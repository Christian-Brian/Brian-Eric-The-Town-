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
            + "\nNorth - North"
            + "\nSouth - South"
            + "\nWest - West"
            + "\nEast - East"
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
            case "west": // display help menu
                this.goWest();
                break;
            case "east": // display help menu
                this.goEast();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void goSouth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void goWest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void goEast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    
