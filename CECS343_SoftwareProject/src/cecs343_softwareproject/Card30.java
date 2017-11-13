package cecs343_softwareproject;

public class Card30 extends Card {

    public Card30() {
        this.name = "Elective Class";
        this.reward = "1 Learning Chip and 1 Game Card";
        this.location.add("Library");
        this.prereq = "2 Learning";
        this.fail = "Lose 2 Quality Points";
    }

    public boolean play(Player p) {
        return true;

    }
}
