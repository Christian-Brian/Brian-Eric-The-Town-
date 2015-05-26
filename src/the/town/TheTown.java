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
        
        Game gameStartTime = new Game();
        
        gameStartTime.setStartTime("1200");
        
        Double startTimeInfo = gameStartTime.toDouble();
        System.out.println(startTimeInfo);
        
        Locations locationOne = new Locations();
        Locations restrictedAccess = new Locations();
        Locations coordinants = new Locations();
        
        locationOne.setAmount("0/1");
        restrictedAccess.setrestrictedAccess("Your Path Is Blocked.");
        coordinants.setCoordinants("A-6");
                
        Double amountInfo = locationOne.Double();
        String restrictedAccessInfo = restrictedAccess.toString();
        String coordinantsInfo = coordinants.toString();
        System.out.println(amountInfo);
        System.out.println(restrictedAccessInfo);
        System.out.println(coordinantsInfo);
        
        Map numberOfColumns = new Map();
        Map numberOfRows = new Map();
        
        numberOfColumns.setNumberOfColumns("25");
        numberOfRows.setNumberOfRows("25");
        
        Double numberOfColumnsInfo = numberOfColumns.toDouble();
        Double numberOfRowsInfo = numberOfRows.toDouble();
        System.out.println(numberOfColumnsInfo);
        System.out.println(numberOfRowsInfo);
    }
    
    
}
