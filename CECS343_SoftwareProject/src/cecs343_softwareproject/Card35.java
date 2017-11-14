package cecs343_softwareproject;

public class Card35 extends Card {

    public Card35() {
        this.name = "Learning Linux";
        this.reward = "3 Quality Points and a Chip of Your Choice";
        this.location.add("Computer Lab");
        this.prereq = "2 Craft and 3 Integrity";
        this.fail = "Lose 1 Quality Point";
    }

    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("Computer Lab")) {
            if (p.getIntegrity() >= 3 && p.getCraft() >= 2) {
                p.setQP(3);
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
        p.setQP(-1);
    }
}
