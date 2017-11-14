package cecs343_softwareproject;

public class Card4 extends Card {

    public Card4() {
        this.name = "Lunch at Bratwurst Hall";
        this.reward = "1 Craft Chip";
        this.location.add("Bratwurst Hall");
        this.fileName = ("Card4.png");
    }

    @Override
    public boolean play(Player p) {
        if(p.room.getNameRoom().equals("Bratwurst Hall"))
        {
            p.incCraft();
            return true;
        }
        return false;

    }
}
