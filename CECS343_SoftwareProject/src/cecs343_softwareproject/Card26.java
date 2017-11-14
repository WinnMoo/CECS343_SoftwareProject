package cecs343_softwareproject;

public class Card26 extends Card {

    public Card26() {
        this.name = "Program Crashes";
        this.reward = "5 Quality Points and Chip of Your Choice";
        this.location.add("Lactation Lounge");
        this.prereq = "2 Learning";
        this.fail = "Discard 1 Game Card";
        this.fileName = ("Card26.png");
        setImage("Card26.png");
    }

    @Override
    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("Lactation Lounge")) {
            if (p.getLearning() >= 6) {
                p.setQP(5);
                optionPicker a = new optionPicker(true, true, true);
                if (a.selectedAbility == AbilityType.CRAFT) {
                    p.incCraft();
                } else if (a.selectedAbility == AbilityType.LEARNING) {
                    p.incLearning();
                } else {
                    p.incIntegrity();
                }
                return true;
            }
            fail(p);
            return false;
        }

        return false;
    }

    private void fail(Player p) {
        p.discardCard();
    }
}
