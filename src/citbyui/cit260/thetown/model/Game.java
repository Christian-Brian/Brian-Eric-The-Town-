/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.thetown.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Eric
 */
public class Game implements Serializable{
    
    //class instance variables
    private double startTime;
    private String attribute;
    private Player player;
    private Worlds[] worlds;
    private Resources[] inventory;
    
    public Game() {
    }

    @Override
    public String toString() {
        return "Game{" + "startTime=" + startTime + ", attribute=" + attribute + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.startTime) ^ (Double.doubleToLongBits(this.startTime) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.attribute);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.startTime) != Double.doubleToLongBits(other.startTime)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }
    
    

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    
    
    public Player getPlayer() {
        return player;
    }
    
    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Worlds[] getWorlds() {
        return worlds;
    }
    
    public void setWorlds(Worlds[] worlds) {
        this.worlds = worlds;
    }
    
    public Resources[] getInventory() {
        return inventory;
    }
    
    public void setInventory(Resources[] inventory) {
        this.inventory = inventory;
    }
}
