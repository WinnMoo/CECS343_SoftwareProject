package cecs343_softwareproject;

public class Card0 extends Card {

    public Card0() {
        this.name = "CECS105";
        this.reward = "1 Learning Chip";
        this.location.add("ECS302");
        this.location.add("ECS308");
    }
    

    public boolean play(Player p) {
        return true;

    }
}
