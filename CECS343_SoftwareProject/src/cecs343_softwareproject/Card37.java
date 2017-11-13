package cecs343_softwareproject;

public class Card37 extends Card {

    public Card37() {
        this.name = "Enjoying Nature";
        this.reward = "1 Craft Chip and Teleport to Lactation Lounge";
        this.location.add("Japanese Garden");
        this.location.add("Student Parking");
        this.location.add("Forbidden Parking");
        this.location.add("Rec Center");
        this.location.add("George Allen Field");
        this.location.add("West Walkway");
        this.location.add("East Walkway");
        this.location.add("Bratwurst Hall");
        this.location.add("LA 5");
        this.location.add("Library");
        this.location.add("Walter Pyramid");
    }

    public boolean play(Player p) {
        return true;

    }
}
