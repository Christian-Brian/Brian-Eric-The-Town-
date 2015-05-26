/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package the.town;

import citbyui.cit260.thetown.model.Characters;
import citbyui.cit260.thetown.model.Player;

/**
 *
 * @author Eric
 */
public class TheTown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Jordan Taylor");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Characters characterOne = new Characters();
        Characters description = new Characters();
        
        characterOne.setName("Mary");
        description.setDescription("someone with info in town");
        
        String characterInfo = characterOne.toString();
        String descriptionInfo = description.toString();
        System.out.println(characterOne);
        System.out.println(description);
        
        Game gameOne = new Game();
        
        gameOne.setStartTime("12:00");
        
        Double startTimeInfo = gameOne.Double();
        System.out.println(gameOne);
        
        Locations locationsOne = new Locations();
        
        locationsOne.setAmount("0/1");
    }
    
    
}
