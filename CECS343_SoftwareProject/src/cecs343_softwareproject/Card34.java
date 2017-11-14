package cecs343_softwareproject;

public class Card34 extends Card {

    public Card34() {
        this.name = "The Outpost";
        this.reward = "1 Chip of Your Choice";
        this.location.add("Japanese Garden");
        this.location.add("Student Parking");
        this.location.add("Rec Center");
        this.location.add("George Allen Field");
        this.location.add("West Walkway");
        this.location.add("East Walkway");
        this.location.add("Bratwurst Hall");
        this.location.add("LA 5");
        this.location.add("Library");
        this.location.add("Walter Pyramid");
        this.fileName = ("Card34.png");
    }

    public boolean play(Player p) {
        return true;

    }
}
