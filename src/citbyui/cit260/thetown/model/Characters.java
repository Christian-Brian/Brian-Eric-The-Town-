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
public enum Characters implements Serializable {

    //enim attributes

    Mark("Will input something later"),
    Adam("Will input something later"),
    John("Will input something later"),
    Wayne("Will input something later"),
    Rachael("Will input something later"),
    Selina("Will input something later"),
    Abraham("Will input something later"),
    Alfred("Will input something later"),
    Gordon("Will input something later");

    //enim attributes
//    private String name;
    private final String description;

    Characters(String description) {
        this.description = description;
    }

//    @Override
//    public String toString() {
//        return "Characters{" + "name=" + name + ", description=" + description + '}';
//    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 53 * hash + Objects.hashCode(this.name);
//        hash = 53 * hash + Objects.hashCode(this.description);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Characters other = (Characters) obj;
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//        return true;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    public String getDescription() {
        return description;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }
}
