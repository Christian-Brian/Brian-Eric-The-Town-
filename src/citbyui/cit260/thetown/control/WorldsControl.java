/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.control;

import citbyui.cit260.thetown.model.Map;
import citbyui.cit260.thetown.model.Scene;
import citbyui.cit260.thetown.model.Worlds;
import java.util.Scanner;

/**
 *
 * @author Eric and Brian
 */
 enum WorldCompass {
            north, south, east, west;
        }
public class WorldsControl {
    
   

    public static Worlds[] createWorldsList() {
        
        Worlds[] worlds = new Worlds[4];
       
        worlds[WorldCompass.north.ordinal()].setName("Mountains");
        worlds[WorldCompass.south.ordinal()].setName("Beach");
        worlds[WorldCompass.east.ordinal()].setName("Desert");
        worlds[WorldCompass.west.ordinal()].setName("Thick mist");
        
        worlds[WorldCompass.north.ordinal()].setDescription("Mountains");
        worlds[WorldCompass.south.ordinal()].setDescription("Beach");
        worlds[WorldCompass.east.ordinal()].setDescription("Desert");
        worlds[WorldCompass.west.ordinal()].setDescription("Thick mist");
        
//        Map map = MapControl.createNorthMap();
        worlds[WorldCompass.north.ordinal()].setMap(new Map(25, 25));
//        map = MapControl.createSouthMap();
        worlds[WorldCompass.south.ordinal()].setMap(new Map(25, 25));
//        map = MapControl.createEastMap();
        worlds[WorldCompass.east.ordinal()].setMap(new Map(25, 25));
//        map = MapControl.createWestMap();
        worlds[WorldCompass.west.ordinal()].setMap(new Map(25, 25));
        
//        Scene[] scenes = createScenes();
//        
//        assignScenesToLocations(worlds, scenes);
        
        return worlds;
    }
   
    
}
