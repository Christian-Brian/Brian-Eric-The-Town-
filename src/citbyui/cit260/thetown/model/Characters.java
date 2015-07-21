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

    //enum attributes

    Mark("Marks Message [9,6]: I heard you were looking to find treasure in these "
            + "\nmountains. I've searched for years and haven't got any richer."
            + "\nTake my shovel with you if you're gonna go look.Adam the "
            + "\ngoldsmith walks out there every day. Find him if you need help"),
    Adam("Adams Message [8,2]: I found treasure. Finally! Help me open it and you can have half."),
    John("Johns Message [6,7]: If you think you're tough, try your hand east of town."
            + "\nIt's a good way to make money if you're good. Talk to Wayne about"
            + "\ncompeting out there."),
    Wayne("Waynes Message [5,8]: Out east is the most fierce rock, paper, scissors style fighting in "
            + "\nthe world. Take this badge. You'll need it to fight. Look around"
            + "\nfor a bandit and get ready to get beat."),
    Rachael("Rachels Message[7,8]: Not to far south of here is a pretty incredible beach. I go and "
            + "\ncollect shells and dive for pearls and make jewelery with them."
            + "\nMy friend Selina is out there right now."),
    Selina("Selinas Mssage [6,12]: I've had some good luck today finding rare shells. I keep all the "
            + "\noyster pearls I find in this water tank I made. "
            + "\nIf you answer this problem i'll share some with you."),
    Abraham("Abrahams Message [6,6]: No one knows whats out there. Most people who explore west don't "
            + "\ncome back. They say they found whats beyond the mist. I've "
            + "\ntraveled west farther than you can travel in the desert. "
            + "\nI've been trying my whole life to clear the mist. Alfred and I "
            + "\nare going to take another trip. Maybe for good."),
    Alfred("Alfreds Message [9,9]: Once we step into the mist I have no plans of "
            + "\ncoming back to this town. We'll either break the mist or die out"
            + "\nthere. Take this extra cloak if you decide to adventure west.)"),
    Gordon("Gordons Message [8,5]: There's not enough women in this town. Thats why "
            + "\nAbe and Alfred are leaving. To find more women. Whatever. Evens "
            + "\nout the ratio here.");

    public static Character Character(String selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
