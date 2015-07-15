/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

import citbyui.cit260.thetown.control.MapControl;
import citbyui.cit260.thetown.model.Locations;
import citbyui.cit260.thetown.model.Player;
import the.town.TheTown;

/**
 *
 * @author bchrist
 */
public class ControlsView extends View {

    public ControlsView() {
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
            case "north": //go north
                this.goNorth();
                break;
            case "south": //go south
                this.goSouth();
                break;
            case "east": // go east
                this.goEast();
                break;
            case "west": // go west
                this.goWest();
                break;
            case "quit": //exit program
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection. Try Again");
                break;
        }
        return false;
    }

    private void goNorth() {
        //row -1, col
        Player player = TheTown.getPlayer();
        Locations location = player.getLocation();
        int row = location.getRow();
        int column = location.getColumn();
        MapControl.movePlayerToLocation(player, row - 1, column);
        int newRow = player.getLocation().getRow();
        if (row == newRow) {
            this.console.println("You can't go North.");
        }
        this.console.println("Location: [" + newRow + "][" + column + "]");
    }

    private void goSouth() {
        this.console.println("goSouth function called");
    }

    private void goWest() {
        this.console.println("goWest function called");
    }

    private void goEast() {
        this.console.println("goEast function called");
    }

}
