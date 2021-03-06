package cecs343_softwareproject;

public class Card8 extends Card {

    public Card8() {
        this.name = "Finding the Lab";
        this.reward = "1 Integrity Chip";
        this.location.add("Elevators");
        this.fileName = ("Card8.png");
        setImage("Card8.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Elevators")) {
            p.incIntegrity();
            System.out.println("Incrementing integrity");
            System.out.println("===========================");
            return true;
        }
        System.out.println("Failed to play" + name);
        System.out.println("===========================");
        return false;

    }
}
