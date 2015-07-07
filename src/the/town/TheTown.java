/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package the.town;

import citbyui.cit260.thetown.model.Scene;
import citbyui.cit260.thetown.model.Characters;
import citbyui.cit260.thetown.model.Player;
import citbyui.cit260.thetown.model.Worlds;
import citbyui.cit260.thetown.model.Messages;
import citbyui.cit260.thetown.model.Resources;
import citbyui.cit260.thetown.model.Game;
import citbyui.cit260.thetown.model.Locations;
import citbyui.cit260.thetown.model.Map;
import citbyui.cit260.thetown.view.StartProgramView;

/**
 *
 * @author Eric
 */
public class TheTown {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TheTown.outFile = outFile;
    }

    public static BufferReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferReader inFile) {
        TheTown.inFile = inFile;
    }
    

    
    public static void main(String[] args) {
        
        //open character stream files for end user input and output
        TheTown.inFile =
                new BufferedReader(new InputStreamReader(System.in));
        
        TheTown.outFile = new PrintWriter(System.out, true);  
        
        StartProgramView startProgramView = new StartProgramView();
        try {
            
          startProgramView.startProgram(); 
          
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        
        finally {
            try {
                if (TheTown.inFile != null)
                    TheTown.inFile.close();
                
                if (TheTown.outFile != null)
                    TheTown.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
       
        
//        Player playerOne = new Player();
//        
//        playerOne.setName("Jordan Taylor");
//        
//        String playerInfo = playerOne.toString();
//        System.out.println(playerInfo);
//        
//        Characters characterOne = new Characters();
//        Characters description = new Characters();
//        
//        characterOne.setName("Mary");
//        description.setDescription("someone with info in town");
//        
//        String characterInfo = characterOne.toString();
//        String descriptionInfo = description.toString();
//        System.out.println(characterOne);
//        System.out.println(description);
//        
//        Game gameStartTime = new Game();
//        
//        gameStartTime.setStartTime(1200);
//        
//        String startTimeInfo = gameStartTime.toString();
//        System.out.println(startTimeInfo);
//        
//        Locations ammount = new Locations();
//        Locations restrictedAccess = new Locations();
//        Locations coordinants = new Locations();
//        
//        ammount.setAmount(0/1);
//        restrictedAccess.setRestrictedAccess("Your Path Is Blocked.");
//        coordinants.setCoordinants("A-6");
//                
//        String amountInfo = ammount.toString();
//        String restrictedAccessInfo = restrictedAccess.toString();
//        String coordinantsInfo = coordinants.toString();
//        System.out.println(amountInfo);
//        System.out.println(restrictedAccessInfo);
//        System.out.println(coordinantsInfo);
//        
//        Map numberOfColumns = new Map();
//        Map numberOfRows = new Map();
//        
//        numberOfColumns.setNumberOfColumns(25);
//        numberOfRows.setNumberOfRows(25);
//        
//        String numberOfColumnsInfo = numberOfColumns.toString();
//        String numberOfRowsInfo = numberOfRows.toString();
//        System.out.println(numberOfColumnsInfo);
//        System.out.println(numberOfRowsInfo);
//        
//        // brian
//        Scene mountain = new Scene();
//        mountain.setDescription("mountains far away");
//        mountain.setResourceType("resources to look for");
//     
//        String mountainInfo = mountain.toString();
//        System.out.println(mountainInfo);
//        
//        Worlds nameOne = new Worlds();
//        nameOne.setName("the name");
//        nameOne.setDescription("the description for worlds");
//        
//        String nameOneInfo = nameOne.toString();
//        System.out.println(nameOneInfo);
//        
//        Messages hint = new Messages();
//        hint.setHint("your hint");
//        
//        String hintInfo = hint.toString();
//        System.out.println(hintInfo);
//        
//        Resources res = new Resources();
//        res.setName("the name");
//        res.setType("the type");
//        res.setAmountOfGold(50.254);
//        
//        String resInfo = res.toString();
//        System.out.println(resInfo);
     
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TheTown.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TheTown.player = player;
    }
    
    
    
     
}
