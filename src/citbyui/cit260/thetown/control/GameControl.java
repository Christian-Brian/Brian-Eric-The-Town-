/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.control;

import citbyui.cit260.thetown.model.Game;
import citbyui.cit260.thetown.model.Player;
import citbyui.cit260.thetown.model.Resources;
import citbyui.cit260.thetown.model.Worlds;
import the.town.TheTown;

/**
 *
 * @author Eric
 */
public class GameControl {

    public static void createNewGame(Player player) {
       Game game = new Game();
       TheTown.setCurrentGame(game);
       
       game.setPlayer(player);
       
       Resources[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
       
       Worlds[] worldsList = WorldsControl.createWorldsList();
       game.setWorlds(worldsList);
       
       WorldsControl.moveCharactersToStartingLocation(worldsList);
    }

    public static Resources[] createInventoryList() {
        System.out.println("*** called createInventoryLIst() in GameControl ***");
        return null;
    }
}
