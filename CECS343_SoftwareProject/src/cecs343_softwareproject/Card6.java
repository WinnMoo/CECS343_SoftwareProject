package cecs343_softwareproject;

public class Card6 extends Card {

    public Card6() {
        this.name = "Exercising Mind and Body";
        this.reward = "1 Integrity Chip";
        this.location.add("Rec Center");
        this.fileName = ("Card6.png");
        setImage("Card6.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Rec Center")) {
            p.incIntegrity();
            System.out.println("Incrementing Integrity");
            System.out.println("===========================");
            return true;
        }
        System.out.println("User has failed to play " + name);
        System.out.println("===========================");
        return false;

    }
}
