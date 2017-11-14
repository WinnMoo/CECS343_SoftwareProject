package cecs343_softwareproject;

public class Card36 extends Card {

    public Card36() {
        this.name = "Make a Friend";
        this.reward = "3 Quality Points and a Chip of Your Choice";
        this.location.add("North Hall");
        this.location.add("South Hall");
        this.prereq = "2 Integrity";
        this.fail = "Discard 1 Game Card";
    }

    public boolean play(Player p) {
         if (p.room.getNameRoom().equals("North Hall") || p.room.getNameRoom().equals("South Hall")) {
            if (p.getIntegrity() >= 2) {
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
        p.discardCard();
    }
}
