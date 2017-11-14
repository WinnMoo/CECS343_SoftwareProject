package cecs343_softwareproject;

public class Card10 extends Card {

    public Card10() {
        this.name = "Enjoying the Peace";
        this.reward = "1 Learning Chip or 1 Integrity Chip";
        this.location.add("Japanese Garden");
    }

    public boolean play(Player p) {
        return true;

    }
}
