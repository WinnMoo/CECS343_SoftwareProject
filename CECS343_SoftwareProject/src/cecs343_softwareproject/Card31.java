package cecs343_softwareproject;

public class Card31 extends Card {

    public Card31() {
        this.name = "Oral Communication";
        this.reward = "4 Quality Points and 1 Chip of Your Choice";
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
        this.prereq = "4 Integrity";
        this.fail = "Discard 1 Game Card";
    }

    public boolean play(Player p) {
        return true;

    }
}
