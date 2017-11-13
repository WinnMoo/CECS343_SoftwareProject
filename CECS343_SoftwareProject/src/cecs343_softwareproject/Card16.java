package cecs343_softwareproject;

public class Card16 extends Card {

    public Card16() {
        this.name = "Math 123";
        this.reward = "5 Quality Points";
        this.location.add("Rec Center");
        this.prereq = "5 Learning";
        this.fail = "Lose 3 Quality Points and Lose 1 Game Card";
    }

    public boolean play(Player p) {
        return true;

    }
}
