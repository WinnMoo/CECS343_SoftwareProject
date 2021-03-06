package cecs343_softwareproject;

public class Card4 extends Card {

    public Card4() {
        this.name = "Lunch at Bratwurst Hall";
        this.reward = "1 Craft Chip";
        this.location.add("Bratwurst Hall");
        this.fileName = ("Card4.png");
        setImage("Card4.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Bratwurst Hall")) {
            p.incCraft();
            System.out.println("Incrementing Craft");
            System.out.println("===========================");
            return true;
        }
        System.out.println("User has failed to play" + name);
        System.out.println("===========================");
        return false;

    }
}
