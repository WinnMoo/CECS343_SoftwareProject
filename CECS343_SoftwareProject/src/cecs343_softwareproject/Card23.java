package cecs343_softwareproject;

public class Card23 extends Card {

    public Card23() {
        this.name = "A New Laptop";
        this.reward = "3 Quality Points and a Chip of Your Choice";
        this.location.add("Computer Lab");
        this.prereq = "4 Integrity";
        this.fail = "Discard 1 Game Card";
        this.fileName = ("Card23.png");
        setImage("Card23.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Computer Lab")) {
            if (p.getIntegrity() >= 4) {
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
        if (p.getName().equals("John")) {
            CardDialog c = new CardDialog(p.hand.get(0), p.hand.get(1), p.hand.get(2), p.hand.get(3), p.hand.get(4));
            c.setVisible(true);
            String cardToDiscard = c.getDiscardedCard();
            for (int i = 1; i < 6; i++) {
                if (p.hand.get(i).name.equals(cardToDiscard)) {
                    p.hand.remove(i);
                }
            }
        }
    }
}
