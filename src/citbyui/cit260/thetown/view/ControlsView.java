/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

import citbyui.cit260.thetown.control.GameControl;
import citbyui.cit260.thetown.control.GameControl.Item;
import citbyui.cit260.thetown.control.MapControl;
import citbyui.cit260.thetown.control.ResourcesControl;
import citbyui.cit260.thetown.model.Characters;
import citbyui.cit260.thetown.model.Locations;
import citbyui.cit260.thetown.model.Player;
import citbyui.cit260.thetown.model.Resources;
import java.util.ArrayList;
import the.town.TheTown;

/**
 *
 * @author bchrist
 */
public class ControlsView extends View {

    public ControlsView() {
        super("\n"
                + "\n=================================="
                + "\n            Controls              "
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
        displayInfo();
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
        //this.console.println("Location: [" + newRow + "][" + column + "]");
    }

    private void goSouth() {
        //row +1, col
        Player player = TheTown.getPlayer();
        Locations location = player.getLocation();
        int row = location.getRow();
        int column = location.getColumn();
        MapControl.movePlayerToLocation(player, row + 1, column);
        int newRow = player.getLocation().getRow();
        if (row == newRow) {
            this.console.println("You can't go South.");
        }
        //this.console.println("Location: [" + newRow + "][" + column + "]");
    }

    private void goWest() {
        //row, col -1
        Player player = TheTown.getPlayer();
        Locations location = player.getLocation();
        int row = location.getRow();
        int column = location.getColumn();
        MapControl.movePlayerToLocation(player, row, column - 1);
        int newColumn = player.getLocation().getColumn();
        if (column == newColumn) {
            this.console.println("You can't go South.");
        }
        //this.console.println("Location: [" + row + "][" + newColumn + "]");
    }

    private void goEast() {
        //row, col +1
        Player player = TheTown.getPlayer();
        Locations location = player.getLocation();
        int row = location.getRow();
        int column = location.getColumn();
        MapControl.movePlayerToLocation(player, row, column + 1);
        int newColumn = player.getLocation().getColumn();
        if (column == newColumn) {
            this.console.println("You can't go South.");
        }
        //this.console.println("Location: [" + row + "][" + newColumn + "]");
    }

    public void displayInfo() { //Main controller
        Player player = TheTown.getPlayer();
        Locations location = player.getLocation();
        this.console.println("Location: [" + location.getRow() + "]["
                + location.getColumn() + "]");
        this.console.println("Scene: " + location.getScene().getDescription());
        
         // Determines if location has gold, and if yes gets it for you
        if (location.getAmount() > 0) {
            double amount = location.getAmount();
            Resources[] inventory = TheTown.getCurrentGame().getInventory();
            switch (location.getScene().getResourceType()) {
                case "":
                    ResourcesControl.addToInventory(amount, GameControl.Item.gold);
                    location.removeAll();
                    this.console.println("You got " + amount + " gold.");
                    break;
                case "Cloak":
                    if (inventory[Item.cloak.ordinal()].getAmount() > 0) {
                        ResourcesControl.addToInventory(amount, GameControl.Item.gold);
                        location.removeAll();
                        this.console.println("You got " + amount + " gold.");
                    } else {
                        this.console.println("You need the cloak to get the gold.");
                    }
                    break;
                case "Shovel":
                    if (inventory[Item.shovel.ordinal()].getAmount() > 0) {
                        ResourcesControl.addToInventory(amount, GameControl.Item.gold);
                        location.removeAll();
                        this.console.println("You got " + amount + " gold.");
                    } else {
                        this.console.println("You need the shovel to get the gold.");
                    }
                    break;
                case "Snorkel":
                    if (inventory[Item.snorkel.ordinal()].getAmount() > 0) {
                        ResourcesControl.addToInventory(amount, GameControl.Item.gold);
                        location.removeAll();
                        this.console.println("You got " + amount + " gold.");
                    } else {
                        this.console.println("You need the snorkel to get the gold.");
                    }
                    break;
                case "Badge":
                    if (inventory[Item.badge.ordinal()].getAmount() > 0) {
                        ResourcesControl.addToInventory(amount, GameControl.Item.gold);
                        location.removeAll();
                        this.console.println("You got " + amount + " gold.");
                    } else {
                        this.console.println("You need the badge to get the gold.");
                    }
                    break;
            }
        }
        
        // If the location has an item get it!
        if(location.hasItem()) {
            ResourcesControl.addToInventory(1, location.getItem());
            this.console.println("You got a " + location.getItem());
            location.removeAll();//remove the ited and any gold after you visit it
        }
        displayNPCMessage(location);
    }

    private void displayNPCMessage(Locations location) {
        ArrayList<Characters> characters = location.getCharacters();
        if (characters != null) {
            for (Characters npc : characters) {
                this.console.println("Message: " + npc.getDescription());
            }
        }
    }
}
