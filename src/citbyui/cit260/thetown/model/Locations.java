/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.model;

import citbyui.cit260.thetown.control.GameControl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Eric
 */
public class Locations implements Serializable {

    private double amount;  //The amount is for gold
    private boolean restrictedAccess;
    private int row;
    private int column;
    private Scene scene;
    private ArrayList<Characters> characters;
    
    private GameControl.Item item = null;

    public Locations() {
        this.amount = 0.0;
        this.restrictedAccess = false;  
    }

    @Override
    public String toString() {
        return "Locations{" + "amount=" + amount + ", restrictedAccess=" + restrictedAccess + ", coordinants=(" + row + "," + column + ")" + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.restrictedAccess);
        hash = 37 * hash + Objects.hashCode(this.row);
        hash = 37 * hash + Objects.hashCode(this.column);
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
        final Locations other = (Locations) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if (!Objects.equals(this.restrictedAccess, other.restrictedAccess)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        return true;
    }

    public double getAmount() { // Sepecific to gold
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean getRestrictedAccess() {
        return restrictedAccess;
    }

    public void setRestrictedAccess(boolean restrictedAccess) {
        this.restrictedAccess = restrictedAccess;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Characters> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Characters> characters) {
        this.characters = characters;
    }
    
    public void addCharacter(Characters character) {
        if (this.characters == null) {
           this.characters = new ArrayList<>();
        }
        this.characters.add(character);
    }

    public Boolean hasItem() {
        if(item == null) {
            return false;
        }
            return true;
    }
    
    public GameControl.Item getItem() {
        return this.item;
    }
    
    public void moveItem(GameControl.Item item) {
        this.item = item;
    }
    
    public void removeAll() {
        this.item = null;
        this.amount = 0;
    }
}
