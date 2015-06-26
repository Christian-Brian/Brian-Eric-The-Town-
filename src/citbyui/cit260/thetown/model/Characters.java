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

    Mark("(north, but in town)(marks message:I heard you were looking to find "
            + "treasure in these mountains. I've searched for years and haven't"
            + " got any richer. Take my shovel with you if you're gonna go look."
            + " Adam the goldsmith walks out there every day. Hind him if you need help"),
    Adam("(North, but in world) scene:You look out and see a wide range of sagebrush"
            + "in the forground against tall mointains. All the coulds seem to swirl around"
            + "the tallest peak. There's animals in the distance. you've never seen before."
            + " It's gonna be a long walk to those mountains. I wonder where that goldsmith is."
            + "(adams message:I found treasure. Finally! Help me open it and you can have half."),
    John("(East, but in town) (Scene: Dust roads lead every which way. Small towns every"
            + " few miles. Just cacti and broken handkarts inbetween. who would choose"
            + "to live here? I wonder where all these bandits are... (Message: If you think you're tough, try your hand east of town."
            + "It's a good way to make money if you're good. Talk to Wayne about competing out there"),
    Wayne("Out east is the most fierce rock, paper, scissors style fighting in the world."
            + "Take this badge. You'll need it to fight. Look around for a bandit and get "
            + "ready to get beat."),
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
