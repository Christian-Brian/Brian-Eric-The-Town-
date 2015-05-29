/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.control;

/**
 *
 * @author Eric
 */
public class WorldsControl {
    
    private double calcVolumeOfCave(double topRadius, double midRadius, double height) {
        
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
        
        double radius = diameter / 2;
        double volume = height * Math.PI * ((2 * Math.pow(radius, 2)) + Math.pow(radius, 2) / 3);
            return volume;
    }
    
}

    private double calcWaterTank(double areaOfBase, double height) {

        if (base)
        



}
