/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

/**
 *
 * @author Eric
 */
public class ErrorView {
    
    private static final PRintWriter errorFile = TheTown.getOutFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "-----------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n---------------------------------------");
    }
    
}
