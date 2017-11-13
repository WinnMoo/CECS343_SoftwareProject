package cecs343_softwareproject;

public class Card27 extends Card {

    public Card27() {
        this.name = "Professor Englert";
        this.reward = "Chip of Your Choice";
        this.location.add("CECS Conference Room");
        this.prereq = "3 Integrity";
        this.fail = "Discard 1 Game Card";
    }

    public boolean play(Player p) {
        return true;

    }
}
