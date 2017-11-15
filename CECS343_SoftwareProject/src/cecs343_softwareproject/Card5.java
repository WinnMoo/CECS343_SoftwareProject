package cecs343_softwareproject;

public class Card5 extends Card {

    public Card5() {
        this.name = "CECS 100";
        this.reward = "1 Learning Chip";
        this.location.add("ECS308");
        this.fileName = ("Card5.png");
        setImage("Card5.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("ECS308")) {
            p.incLearning();
            System.out.println("Incrementing learning");
            System.out.println("===========================");
            return true;
        }
        System.out.println("User has failed to play " + name);
        System.out.println("===========================");
        return false;

    }
}
