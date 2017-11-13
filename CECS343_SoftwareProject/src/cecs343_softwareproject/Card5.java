package cecs343_softwareproject;

public class Card5 extends Card {

    public Card5() {
        this.name = "CECS 100";
        this.reward = "1 Learning Chip";
        this.location.add("ECS308");

    }

    public boolean play(Player p) {
        return true;

    }
}
