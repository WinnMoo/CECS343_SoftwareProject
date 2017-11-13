package cecs343_softwareproject;

public class Card22 extends Card {

    public Card22() {
        this.name = "Make the Dean's List";
        this.reward = "5 Quality Points";
        this.location.add("North Hall");
        this.location.add("South Hall");
        this.prereq = "6 Learning";
        this.fail = "Go to Student Parking";
    }

    public boolean play(Player p) {
        return true;

    }
}
