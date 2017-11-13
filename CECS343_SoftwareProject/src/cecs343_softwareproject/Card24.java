package cecs343_softwareproject;

public class Card24 extends Card {

    public Card24() {
        this.name = "Meet the Dean";
        this.reward = "5 Quality Points and 1 Game Card";
        this.location.add("North Hall");
        this.location.add("South Hall");
        this.prereq = "3 Learning, 3 Craft, 3 Integrity";
        this.fail = "Discard 1 Game Card";
    }

    public boolean play(Player p) {
        return true;

    }
}
