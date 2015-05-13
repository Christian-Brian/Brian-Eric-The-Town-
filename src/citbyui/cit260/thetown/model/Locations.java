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
public class Locations implements Serializable{
    private double amount;
    private String restrictedAccess;
    private String cordinants;

    public Locations() {
    }

    @Override
    public String toString() {
        return "Locations{" + "amount=" + amount + ", restrictedAccess=" + restrictedAccess + ", cordinants=" + cordinants + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.restrictedAccess);
        hash = 37 * hash + Objects.hashCode(this.cordinants);
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
        if (!Objects.equals(this.cordinants, other.cordinants)) {
            return false;
        }
        return true;
    }
    
    

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRestrictedAccess() {
        return restrictedAccess;
    }

    public void setRestrictedAccess(String restrictedAccess) {
        this.restrictedAccess = restrictedAccess;
    }

    public String getCordinants() {
        return cordinants;
    }

    public void setCordinants(String cordinants) {
        this.cordinants = cordinants;
    }
    
}
