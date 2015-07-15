/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.control;

import citbyui.cit260.thetown.control.exceptions.GameControlException;
import citbyui.cit260.thetown.model.Characters;
import citbyui.cit260.thetown.model.Game;
import citbyui.cit260.thetown.model.Player;
import citbyui.cit260.thetown.model.Resources;
import citbyui.cit260.thetown.model.Map;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import the.town.TheTown;

/**
 *
 * @author Eric
 */
public class GameControl {

    public enum Item {

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
        
        MapControl.movePlayerToLocation(player, 7, 7);
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

    public static Resources[] getSortedInventoryList() {
        Resources[] originalInventoryList = TheTown.getCurrentGame().getInventory();

        Resources[] inventoryList = originalInventoryList.clone();

        for (int i = 0; i < inventoryList.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < inventoryList.length; j++) {
                if (inventoryList[j].getType().
                        compareToIgnoreCase(inventoryList[index].getType()) < 0) {
                    index = j;
                }
            }

            Resources smaller = inventoryList[index];
            inventoryList[index] = inventoryList[i];
            inventoryList[i] = smaller;

        }

        return inventoryList;
    }

    public static Characters[] sortCharacters(Characters[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                //get the name of the character in position j
                String firstName = arr[j].name();
                //get the name of the character in positin index in the array
                String secondName = arr[index].name();
                //compare to se if first name is less than second name
                if (firstName.compareTo(secondName) < 0) {
                    index = j;
                }
            }
            Characters smallerName = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerName;
        }
        return arr;
    }

    public static void saveGame(Game game, String filepath)
            throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game);
        } catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getExistingGame(String filepath)
            throws GameControlException {
        Game game = null;

        try (FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fips);

            game = (Game) output.readObject();
        } catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        TheTown.setCurrentGame(game);
    }
}

    //sort the array of charactes
//go through each character get the name, and print the name

