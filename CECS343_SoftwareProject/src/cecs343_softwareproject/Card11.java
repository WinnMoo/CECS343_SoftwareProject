package cecs343_softwareproject;

public class Card11 extends Card {

    public Card11() {
        this.name = "Buddy Up";
        this.reward = "1 Learning Chip or 1 Craft Chip";
        this.location.add("Eat Club");
        this.location.add("George Allen Field");
    }

    public boolean play(Player p) {
        return true;

    }
}
