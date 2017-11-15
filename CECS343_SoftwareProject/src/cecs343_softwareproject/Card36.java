package cecs343_softwareproject;

public class Card36 extends Card {

    public Card36() {
        this.name = "Make a Friend";
        this.reward = "3 Quality Points and a Chip of Your Choice";
        this.location.add("North Hall");
        this.location.add("South Hall");
        this.prereq = "2 Integrity";
        this.fail = "Discard 1 Game Card";
        this.fileName = ("Card36.png");
        setImage("Card36.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("South Hall") || p.room.getNameRoom().equals("North Hall")) {
            if (p.integrityChip >= 2) {
                p.setQP(3);
                //chip dialog
                return true;
            } else {
                fail(p);
                return false;
            }
        } else {
            fail(p);
            return false;
        }

    }

    private void fail(Player p) {
        if (p.name.equals("John")) {
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
