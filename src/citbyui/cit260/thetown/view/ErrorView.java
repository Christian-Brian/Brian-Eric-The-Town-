/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.view;

import java.io.PrintWriter;
import the.town.TheTown;

/**
 *
 * @author Eric
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = TheTown.getOutFile();
    private static final PrintWriter logFile = TheTown.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "-----------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n---------------------------------------");
    
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
