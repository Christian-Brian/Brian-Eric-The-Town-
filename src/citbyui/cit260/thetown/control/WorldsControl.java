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
    
    public static double calcVolumeOfCave(double topRadius, double midRadius, double height) {
        
        if (height < 1 || height > 150) {
            return -1;
        }
        
        if (topRadius < 1 || topRadius > 50) {
            return -1;
        }
        
        if (midRadius < topRadius) {
            return -1;
        }
        
        if (midRadius < 10 || midRadius > 45) {
            return -1;
        }
        
        double volume = height * Math.PI * ((2 * Math.pow(midRadius, 2) + Math.pow(topRadius, 2)) / 3);
            return volume;
    }
    
// Eric
    public static double calcWaterTank(double areaOfBase, double fillRate) {

        if (areaOfBase > 101 || areaOfBase < 99) {
            return -1;
        }

        if (fillRate > 10 || fillRate < 9) {
            return -1;
        }
        double volume = fillRate;
        double area = areaOfBase;
        double height = area / volume;
            return height;

    }
// Brian
    public static double calcCaseCubeofABox (double height, double width , double length){
    
        if (height < 1 || height > 100)
            return -1;
                    
        if (width < 1 || width > 100)
            return -1;
        
        if (length < 1 || length > 100)
            return -1;
          
        double cubeFt=length*width*height/1728;
        int decimal = (int)((cubeFt+.005)*100);
        double result = (double) decimal/100;
        return result;
    }

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
        
        Scene[] scenes = createScenes();
        
        assignScenesToLocations(worlds, scenes);
        
        return worlds;
    }
   
    
}
