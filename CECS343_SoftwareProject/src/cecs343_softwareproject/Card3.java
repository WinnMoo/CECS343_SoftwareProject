package cecs343_softwareproject;

public class Card3 extends Card {

    public Card3() {
        this.name = "Professor Murgolo's CECS 174 Class";
        this.reward = "1 Learning Chip";
        this.location.add("ECS302");

    }

    public boolean play(Player p) {
        return true;

    }
}
