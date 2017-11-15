package cecs343_softwareproject;

public class Card0 extends Card {

    public Card0() {
        this.name = "CECS105";
        this.reward = "1 Learning Chip";
        this.location.add("ECS302");
        this.location.add("ECS308");
        this.fileName = ("Card0.png");
        setImage("Card0.png");
    }
    
    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if ((p.room.getNameRoom().equals("ECS302")) || (p.room.getNameRoom().equals("ECS308"))) {
            p.incLearning();
            return true;
        }
        return false;

    }
}
