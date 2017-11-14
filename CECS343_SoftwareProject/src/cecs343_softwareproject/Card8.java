package cecs343_softwareproject;

public class Card8 extends Card {

    public Card8() {
        this.name = "Finding the Lab";
        this.reward = "1 Integrity Chip";
        this.location.add("Elevators");
        this.fileName = ("Card8.png");
    }

    @Override
    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("Elevators")) {
            p.incIntegrity();
            return true;
        }
        return false;

    }
}
