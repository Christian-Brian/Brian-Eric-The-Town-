/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.thetown.model;

import java.io.PrintWriter;
import java.io.Serializable;
import the.town.TheTown;

/**
 *
 * @author Eric
 */
public class Map implements Serializable {
    private int numberOfColumns;
    private int numberOfRows;
    private Locations[][] locations;
        

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns <1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.numberOfRows = noOfRows;
        this.numberOfColumns = noOfColumns;
        
        this.locations = new Locations[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++) {
                Locations location = new Locations();
                location.setColumn(column);
                location.setRow(row);
                
                locations[row][column] = location;
            }
        }
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

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }
    
    public Locations[][] getLocations(){
        return locations;
    }
    
    public void setLocations(Locations[][] locations){
        this.locations = locations;
    }
}
