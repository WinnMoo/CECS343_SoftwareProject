package cecs343_softwareproject;

public class Card27 extends Card {

    public Card27() {
        this.name = "Professor Englert";
        this.reward = "Chip of Your Choice";
        this.location.add("CECS Conference Room");
        this.prereq = "3 Integrity";
        this.fail = "Discard 1 Game Card";
        this.fileName = ("Card27.png");
        setImage("Card27.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("CECS Conference Room")) {
            if (p.getIntegrity() >= 3) {
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
