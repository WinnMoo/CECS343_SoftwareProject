package cecs343_softwareproject;

public class Card11 extends Card {

    public Card11() {
        this.name = "Buddy Up";
        this.reward = "1 Learning Chip or 1 Craft Chip";
        this.location.add("Eat Club");
        this.location.add("George Allen Field");
        this.fileName = ("Card11.png");
        setImage("Card11.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Eat Club") || p.room.getNameRoom().equals("George Allen Field")) {
            optionPicker a = new optionPicker(true, false, true);
            if (a.selectedAbility == AbilityType.LEARNING) {
                p.incLearning();
            } else {
                p.incCraft();
            }
            return true;
        }
        return false;

    }
}
