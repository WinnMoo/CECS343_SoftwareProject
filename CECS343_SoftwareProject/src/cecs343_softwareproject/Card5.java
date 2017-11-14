package cecs343_softwareproject;

public class Card5 extends Card {

    public Card5() {
        this.name = "CECS 100";
        this.reward = "1 Learning Chip";
        this.location.add("ECS308");
        this.fileName = ("Card5.png");
    }

    public boolean play(Player p) {
        if(p.room.getNameRoom().equals("ECS308"))
        {
            p.incCraft();
            return true;
        }
        return false;

    }
}
