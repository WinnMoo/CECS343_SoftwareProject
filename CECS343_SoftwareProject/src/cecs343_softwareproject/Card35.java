package cecs343_softwareproject;

public class Card35 extends Card {

    public Card35() {
        this.name = "Learning Linux";
        this.reward = "3 Quality Points and a Chip of Your Choice";
        this.location.add("Computer Lab");
        this.prereq = "2 Craft and 3 Integrity";
        this.fail = "Lose 1 Quality Point";
        this.fileName = ("Card35.png");
        setImage("Card35.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Computer Lab")) {
            p.setQP(3);
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
            System.out.println("===========================");
            return true;
        } else {
            fail(p);
            System.out.println("Player has failed to play " + name);
            System.out.println("===========================");
            return false;
        }

    }

    private void fail(Player p) {
        p.setQP(-1);
    }
}
