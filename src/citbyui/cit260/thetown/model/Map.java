/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.thetown.model;

import java.io.Serializable;

/**
 *
 * @author Eric
 */
public class Map implements Serializable{
    private double numberOfColumns;
    private double numberOfRows;

    public Map() {
    }
    public Map(int x, int y){
        
    }

    @Override
    public String toString() {
        return "Map{" + "numberOfColumns=" + numberOfColumns + ", numberOfRows=" + numberOfRows + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.numberOfColumns) ^ (Double.doubleToLongBits(this.numberOfColumns) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.numberOfRows) ^ (Double.doubleToLongBits(this.numberOfRows) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.numberOfColumns) != Double.doubleToLongBits(other.numberOfColumns)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfRows) != Double.doubleToLongBits(other.numberOfRows)) {
            return false;
        }
        return true;
    }
    
    

    public double getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(double numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public double getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(double numberOfRows) {
        this.numberOfRows = numberOfRows;
    }
}
