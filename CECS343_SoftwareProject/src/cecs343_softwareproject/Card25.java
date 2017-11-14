package cecs343_softwareproject;

public class Card25 extends Card {

    public Card25() {
        this.name = "Loud Buzzing";
        this.reward = "1 Chip of Your Choice";
        this.location.add("Eat Club");
        this.prereq = "3 Craft";
        this.fail = "Lose 2 Quality Points";
        this.fileName = ("Card25.png");
        setImage("Card25.png");
    }

    @Override
    public boolean play(Player p) {
    if (p.room.getNameRoom().equals("Eat Club")) {
            if (p.getCraft() >= 3) {
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
        p.setQP(-2);
        CardDialog c = new CardDialog();
        c.setVisible(true);
    }
}
