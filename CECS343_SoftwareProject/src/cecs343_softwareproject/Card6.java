package cecs343_softwareproject;

public class Card6 extends Card {

    public Card6() {
        this.name = "Exercising Mind and Body";
        this.reward = "1 Integrity Chip";
        this.location.add("Rec Center");

    }

    public boolean play(Player p) {
        return true;

    }
}
