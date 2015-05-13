/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package the.town;

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
        
    }
    
}
