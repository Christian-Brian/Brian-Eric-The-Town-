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
public class Scene implements Serializable{
    private String description;
    private String resourceType;
    private String mapSymbol;

    public Scene() {
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", resourceType=" + resourceType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.resourceType);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        return true;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * @return the mapSymbol
     */
    public String getMapSymbol() {
        return mapSymbol;
    }

    /**
     * @param mapSymbol the mapSymbol to set
     */
    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }
    
}
