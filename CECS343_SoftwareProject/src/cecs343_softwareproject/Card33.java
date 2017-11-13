package cecs343_softwareproject;

public class Card33 extends Card {

    public Card33() {
        this.name = "CHEM 111";
        this.reward = "5 Quality Points";
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
        this.prereq = "6 Craft";
        this.fail = "Go to Student Parking";
    }

    public boolean play(Player p) {
        return true;

    }
}
