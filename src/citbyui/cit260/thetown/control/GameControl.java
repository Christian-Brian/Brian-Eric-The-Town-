/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.control;

import citbyui.cit260.thetown.model.Game;
import citbyui.cit260.thetown.model.Player;
import citbyui.cit260.thetown.model.Resources;
import citbyui.cit260.thetown.model.Map;
import the.town.TheTown;

/**
 *
 * @author Eric
 */
public class GameControl {
    
    public enum Item{
        gold,
        shovel,
        cloak,
        snorkel,
        badge;
    }

    public static void createNewGame(Player player) {
       Game game = new Game();
       TheTown.setCurrentGame(game);
       
       game.setPlayer(player);
       
       Resources[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
       
       Map map = MapControl.createMap();
       game.setMap(map);
       
       MapControl.moveCharactersToStartingLocation(map);
    }

    public static Resources[] createInventoryList() {
        Resources[] inventory = new Resources[5];
        
        Resources gold = new Resources();
        gold.setAmount(0);
        gold.setType("Gold");
        inventory[Item.gold.ordinal()] = gold;
        
        Resources cloak = new Resources();
        cloak.setAmount(0);
        cloak.setType("Cloak");
        inventory[Item.cloak.ordinal()] = cloak;
        
        Resources badge = new Resources();
        badge.setAmount(0);
        badge.setType("Badge");
        inventory[Item.badge.ordinal()] = badge;
        
        Resources snorkel = new Resources();
        snorkel.setAmount(0);
        snorkel.setType("Snorkel");
        inventory[Item.snorkel.ordinal()] = snorkel;
        
        Resources shovel = new Resources();
        shovel.setAmount(0);
        shovel.setType("Shovel");
        inventory[Item.shovel.ordinal()] = shovel;
        
        return inventory;
    }
    
    
}
