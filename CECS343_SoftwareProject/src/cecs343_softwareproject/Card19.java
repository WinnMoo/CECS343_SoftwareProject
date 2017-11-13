package cecs343_softwareproject;

public class Card19 extends Card {

    public Card19() {
        this.name = "Pass Soccer Class";
        this.reward = "5 Quality Points";
        this.location.add("George Allen Field");
        this.prereq = "5 Craft";
        this.fail = "Lose 3 Quality Points";
    }

    public boolean play(Player p) {
        return true;

    }
}
