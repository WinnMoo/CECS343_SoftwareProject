package cecs343_softwareproject;

public class Card38 extends Card {

    public Card38() {
        this.name = "Student Parking";
        this.reward = "1 Craft Chip and Teleport to Lactation Lounge";
        this.location.add("Student Parking");
    }

    public boolean play(Player p) {
        return true;

    }
}
