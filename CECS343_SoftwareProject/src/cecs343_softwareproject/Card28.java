package cecs343_softwareproject;

public class Card28 extends Card {

    public Card28() {
        this.name = "Press the Right Floor";
        this.reward = "2 Craft Chips";
        this.location.add("Elevators");
        this.prereq = "4 Learning";
        this.fail = "Lose 2 Quality Points";
    }

    public boolean play(Player p) {
        return true;

    }
}
