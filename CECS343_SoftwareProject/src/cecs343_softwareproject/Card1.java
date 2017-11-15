package cecs343_softwareproject;

public class Card1 extends Card {

    public Card1() {
        this.name = "Research Compilers";
        this.reward = "1 Learning Chip";
        this.location.add("Library");
        this.fileName = ("card1.png");
        setImage("Card1.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Library")) {
            p.incLearning();
            return true;
        }
        return false;

    }
}
