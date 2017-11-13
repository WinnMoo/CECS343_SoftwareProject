package cecs343_softwareproject;

public class Card9 extends Card {

    public Card9() {
        this.name = "Goodbye, Professor";
        this.reward = "10 Quality Points";
        this.location.add("Room Of Retirement");
        this.prereq = "6 Learning, 6 Craft, 6 Integrity";
        this.fail = "Lose 1 Game Card and Leave this card in ROR";
    }

    public boolean play(Player p) {
        return true;

    }
}
