package cecs343_softwareproject;

public class Card10 extends Card {

    public Card10() {
        this.name = "Enjoying the Peace";
        this.reward = "1 Learning Chip or 1 Integrity Chip";
        this.location.add("Japanese Garden");
        this.fileName = ("Card10.png");
        setImage("Card10.png");
    }

    @Override
    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("Japanese Garden")) {
            optionPicker a = new optionPicker(true, false, true);
            if (a.selectedAbility == AbilityType.LEARNING) {
                p.incLearning();
            } else {
                p.incIntegrity();
            }
            return true;
        }
        return false;

    }
}
