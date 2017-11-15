package cecs343_softwareproject;

public class Card3 extends Card {

    public Card3() {
        this.name = "Professor Murgolo's CECS 174 Class";
        this.reward = "1 Learning Chip";
        this.location.add("ECS302");
        this.fileName = ("Card3.png");
        setImage("Card3.png");

    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("ECS302")) {
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
