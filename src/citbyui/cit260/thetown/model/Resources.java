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
 * @author Brian
 */
public class Resources implements Serializable{
    private String name;
    private String type;
    private double amountOfGold;

    public Resources() {
    }

    @Override
    public String toString() {
        return "Resources{" + "name=" + name + ", type=" + type + ", amountOfGold=" + amountOfGold + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.type);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.amountOfGold) ^ (Double.doubleToLongBits(this.amountOfGold) >>> 32));
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
        final Resources other = (Resources) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountOfGold) != Double.doubleToLongBits(other.amountOfGold)) {
            return false;
        }
        return true;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmountOfGold() {
        return amountOfGold;
    }

    public void setAmountOfGold(double amountOfGold) {
        this.amountOfGold = amountOfGold;
    }
    
}
