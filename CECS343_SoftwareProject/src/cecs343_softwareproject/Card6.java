package cecs343_softwareproject;

public class Card6 extends Card {

    public Card6() {
        this.name = "Exercising Mind and Body";
        this.reward = "1 Integrity Chip";
        this.location.add("Rec Center");
        this.fileName = ("Card6.png");
    }

    public boolean play(Player p) {
        if(p.room.getNameRoom().equals("Rec Center"))
        {
            p.incIntegrity();
            return true;
        }
        return true;

    }
}
