package cecs343_softwareproject;

public class Card15 extends Card {

    public Card15() {
        this.name = "KIN 253 Learning the Rules of Soccer";
        this.reward = "2 Craft Chips";
        this.location.add("George Allen Field");
        this.prereq = "4 Integrity";
        this.fail = "Go to Room of Retirement";

    }

    public boolean play(Player p) {
        return true;

    }
}
