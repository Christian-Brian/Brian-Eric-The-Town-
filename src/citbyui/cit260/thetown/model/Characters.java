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

    Mark("(north, but in town)(marks message:I heard you were looking to find "
            + "treasure in these mountains. I've searched for years and haven't"
            + "got any richer. Take my shovel with you if you're gonna go look."
            + "Adam the goldsmith walks out there every day. Hind him if you need help"),
    Adam("(North, but in world) (World description:You look out and see a wide range of sagebrush"
            + "in the forground against tall mointains. All the clouds seem to swirl around"
            + "the tallest peak. There's animals in the distance. you've never seen before."
            + "It's gonna be a long walk to those mountains. I wonder where that goldsmith is."
            + "(adams message:I found treasure. Finally! Help me open it and you can have half."),
    John("(East, but in town) (World description: Dust roads lead every which way. Small towns every"
            + "few miles. Just cacti and broken handkarts inbetween. who would choose"
            + "to live here? I wonder where all these bandits are... (Message: If you think you're"
            + "tough, try your hand east of town.It's a good way to make money if you're good."
            + " Talk to Wayne about competing out there"),
    Wayne("(Waynes message: Out east is the most fierce rock, paper, scissors style fighting in the world."
            + "Take this badge. You'll need it to fight. Look around for a bandit and get "
            + "ready to get beat.)"),
    Rachael("(South, but in town) Rachaels message: Not to far south of here is a pretty"
            + "incredible beach. I go and collect shells and dive for pearls and make"
            + "jewelery with them. My friend Selina is out there right now. You"
            + "can have my old snorkel to go out there."),
    Selina("(South, but in world) (World description: Miles and miles of white sandy beach."
            + "Perfect waves crashing upon the shore line. Strange trees boarder the sand."
            + "The air is cooler over here. Why are people not here all the time?!"
            + "Selinas message: I've had some good luck today finding rare shells. "
            + "I keep all the oyster pearlsi find in this water tank i made. "
            + "If you answer this problem i'll share some with you."),
    Abraham("(Abrahams message:No one knows whats out there. Most people who "
            + "explore west don't come back. They say they found whats beyond "
            + "the mist. I've traveled west farther than you can travel in the"
            + "desert. I've been trying my whole life to clear the mist."
            + "Alfred and I are going to take another trip. Maybe for good.)"),
    Alfred("(Alfreds message: Once we step into the mist i have no plans of "
            + "comming back to this town. We'll either break the mist or die out"
            + "there. Take this extra cloak if you decide to adventure west.)"
            + "(World description: About a mile west of town you can see the wall"
            + "of mist. Birds only fly into it. Never out. 10 feet into the mist"
            + "you are completely lost. There is a low, melodious hum in the air."
            + "Whats out there? All you can do is keep moving forward.)"),
    Gordon("Gordons message: There's not enough women in this town. Thats why "
            + "Abe and Alfred are leaving. To find more women. Whatever. Evens"
            + "out the ratio here.");

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
