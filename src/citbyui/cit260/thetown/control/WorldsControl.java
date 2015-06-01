/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.control;

/**
 *
 * @author Eric and Brian
 */
public class WorldsControl {
    
    public double calcVolumeOfCave(double topRadius, double midRadius, double height) {
        
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
    private double calcWaterTank(double areaOfBase, double fillRate) {

        if (areaOfBase > 1100 || areaOfBase <1000) {
            return -1;
        }

        if (fillRate > 1 || fillRate < 1) {
            return -1;
        }
        
        double height = 10;
            return height;

    }
// Brian
    public double calcCaseCubeofABox (double height, double width , double length){
    
        if (height < 1 || height > 100)
            return -1;
                    
        if (width < 1 || width > 100)
            return -1;
        
        if (length < 1 || length > 100)
            return -1;
                    
        double cubeFt=length*width*height/1728;
        return cubeFt;
    }
    
    
}
