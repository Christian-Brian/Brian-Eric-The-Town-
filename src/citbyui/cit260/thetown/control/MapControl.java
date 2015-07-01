/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.control;

import citbyui.cit260.thetown.control.exceptions.MapControlException;
import citbyui.cit260.thetown.model.Game;
import citbyui.cit260.thetown.model.Locations;
import citbyui.cit260.thetown.model.Map;
import citbyui.cit260.thetown.model.Scene;
import the.town.TheTown;

/**
 *
 * @author Eric
 */
public class MapControl {

    public static double calcVolumeOfCave(double topRadius, double midRadius, double height) throws MapControlException {

        if (height < 1 || height > 150) {
            throw new MapControlException("Incorrect height, " 
                    + height +" it must be between 1 and 150.");
        }

        if (topRadius < 1 || topRadius > 50) {
            throw new MapControlException("Incorrect top radius, " 
                    + topRadius +" it must be between 1 and 50.");
        }

        if (midRadius < topRadius) {
            throw new MapControlException("Incorrect mid radius to top radius");
        }

        if (midRadius < 10 || midRadius > 45) {
            throw new MapControlException("Incorrect mid radius, " 
                    + midRadius +" it must be between 10 and 45.");
        }

        double volume = height * Math.PI * ((2 * Math.pow(midRadius, 2) + Math.pow(topRadius, 2)) / 3);
        return volume;
    }

// Eric
    public static double calcWaterTank(double areaOfBase, double fillRate) throws MapControlException {

        if (areaOfBase > 101 || areaOfBase < 99) {
            throw new MapControlException("Incorrect area of base, " 
                    + areaOfBase + " it must be between 99 and 101.");
        }

        if (fillRate > 10 || fillRate < 9) {
            throw new MapControlException("Incorrect fill rate, " 
                    + fillRate + " it must be between 9 and 10.");
        }
        double volume = fillRate;
        double area = areaOfBase;
        double height = area / volume;
        return height;

    }
// Brian

    public static double calcCaseCubeofABox(double height, double width, double length) throws MapControlException {

        if (height < 1 || height > 100) {
            throw new MapControlException("Incorrect height, " 
                    + height + " it must be between 1 and 100.");
        }

        if (width < 1 || width > 100) {
            throw new MapControlException("Incorrect width, " 
                    + width + " it must be between 1 and 100.");
        }

        if (length < 1 || length > 100) {
            throw new MapControlException("Incorrect length, " 
                    + length + " it must be between 1 and 100.");
        }

        double cubeFt = length * width * height / 1728;
        int decimal = (int) ((cubeFt + .005) * 100);
        double result = (double) decimal / 100;
        return result;
    }

    public static Map createMap() {
        Map map = new Map(15, 15);

        Scene[] scenes = createScenes();

        assignScenesToLocations(map, scenes);

        return map;
    }

    
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Locations[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[0][10].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[0][11].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[0][12].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[0][13].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[0][14].setScene(scenes[SceneType.Blocked.ordinal()]);
        
        locations[1][0].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[1][10].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[1][11].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[1][12].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[1][13].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[1][14].setScene(scenes[SceneType.Blocked.ordinal()]);
        
        locations[2][0].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[2][10].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[2][11].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[2][12].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[2][13].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[2][14].setScene(scenes[SceneType.Blocked.ordinal()]);
        
        locations[3][0].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[3][10].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[3][11].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[3][12].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[3][13].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[3][14].setScene(scenes[SceneType.Blocked.ordinal()]);
        
        locations[4][0].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[4][9].setScene(scenes[SceneType.Mountain.ordinal()]);
        locations[4][10].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[4][11].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[4][12].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[4][13].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[4][14].setScene(scenes[SceneType.Blocked.ordinal()]);
        
        locations[5][0].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.Town.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.Town.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.Town.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.Town.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.Town.ordinal()]);
        locations[5][10].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[5][11].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[5][12].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[5][13].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[5][14].setScene(scenes[SceneType.Desert.ordinal()]);
        
        locations[6][0].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.Town.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.Town.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.Town.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.Town.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.Town.ordinal()]);
        locations[6][10].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[6][11].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[6][12].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[6][13].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[6][14].setScene(scenes[SceneType.Desert.ordinal()]);
        
        locations[7][0].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.Town.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.Town.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.Town.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.Town.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.Town.ordinal()]);
        locations[7][10].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[7][11].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[7][12].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[7][13].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[7][14].setScene(scenes[SceneType.Desert.ordinal()]);
        
        locations[8][0].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.Town.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.Town.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.Town.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.Town.ordinal()]);
        locations[8][9].setScene(scenes[SceneType.Town.ordinal()]);
        locations[8][10].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[8][11].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[8][12].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[8][13].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[8][14].setScene(scenes[SceneType.Desert.ordinal()]);
        
        locations[9][0].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[9][1].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[9][2].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[9][3].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.Mist.ordinal()]);
        locations[9][5].setScene(scenes[SceneType.Town.ordinal()]);
        locations[9][6].setScene(scenes[SceneType.Town.ordinal()]);
        locations[9][7].setScene(scenes[SceneType.Town.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.Town.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.Town.ordinal()]);
        locations[9][10].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[9][11].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[9][12].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[9][13].setScene(scenes[SceneType.Desert.ordinal()]);
        locations[9][14].setScene(scenes[SceneType.Desert.ordinal()]);
        
        locations[10][0].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[10][1].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[10][2].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[10][3].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[10][4].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[10][5].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[10][6].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[10][7].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[10][8].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[10][9].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[10][10].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[10][11].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[10][12].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[10][13].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[10][14].setScene(scenes[SceneType.Blocked.ordinal()]);
        
        locations[11][0].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[11][1].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[11][2].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[11][3].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[11][4].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[11][5].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[11][6].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[11][7].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[11][8].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[11][9].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[11][10].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[11][11].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[11][12].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[11][13].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[11][14].setScene(scenes[SceneType.Blocked.ordinal()]);
        
        locations[12][0].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[12][1].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[12][2].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[12][3].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[12][4].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[12][5].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[12][6].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[12][7].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[12][8].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[12][9].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[12][10].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[12][11].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[12][12].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[12][13].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[12][14].setScene(scenes[SceneType.Blocked.ordinal()]);
        
        locations[13][0].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[13][1].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[13][2].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[13][3].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[13][4].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[13][5].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[13][6].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[13][7].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[13][8].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[13][9].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[13][10].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[13][11].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[13][12].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[13][13].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[13][14].setScene(scenes[SceneType.Blocked.ordinal()]);
        
        locations[14][0].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[14][1].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[14][2].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[14][3].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[14][4].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[14][5].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[14][6].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[14][7].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[14][8].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[14][9].setScene(scenes[SceneType.Beach.ordinal()]);
        locations[14][10].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[14][11].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[14][12].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[14][13].setScene(scenes[SceneType.Blocked.ordinal()]);
        locations[14][14].setScene(scenes[SceneType.Blocked.ordinal()]);
        
        
        return;
    }

   private static Scene[] createScenes() {
        
        Game game = TheTown.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene townScene = new Scene();
        townScene.setDescription("Welcome to the Town");
        townScene.setMapSymbol(" $ ");
        townScene.setResourceType("");
        scenes[SceneType.Town.ordinal()] = townScene;
        
        Scene mountainScene = new Scene();
        mountainScene.setDescription("Welcome to the Mountain");
        mountainScene.setMapSymbol(" ^ ");
        mountainScene.setResourceType("Shovel");
        scenes[SceneType.Mountain.ordinal()] = mountainScene;
        
        Scene beachScene = new Scene();
        beachScene.setDescription("Welcome to the Beach");
        beachScene.setMapSymbol(" ~ ");
        beachScene.setResourceType("Snorkel");
        scenes[SceneType.Beach.ordinal()] = beachScene;
        
        Scene desertScene = new Scene();
        desertScene.setDescription("Welcome to the Desert");
        desertScene.setMapSymbol(" # ");
        desertScene.setResourceType("Badge");
        scenes[SceneType.Desert.ordinal()] = desertScene;
        
        Scene mistScene = new Scene();
        mistScene.setDescription("Welcome to the Mist");
        mistScene.setMapSymbol(" % ");
        mistScene.setResourceType("Cloak");
        scenes[SceneType.Mist.ordinal()] = mistScene;
        
        Scene blockedScene = new Scene();
        blockedScene.setDescription("Blocked");
        blockedScene.setMapSymbol(" * ");
        blockedScene.setResourceType("");
        scenes[SceneType.Blocked.ordinal()] = blockedScene;
    
        return scenes;
   }
   
    
    // MapControl.moveCharactersToStartingLocation(map);
    public static void moveCharactersToStartingLocation(Map map) {
        System.out.println("*** called moveCharactersToStartingLocation ***");
        return ;
    }
    
    public enum SceneType {
        Mountain,
        Beach,
        Desert,
        Mist,
        Town,
        Blocked;
    }
    
}
