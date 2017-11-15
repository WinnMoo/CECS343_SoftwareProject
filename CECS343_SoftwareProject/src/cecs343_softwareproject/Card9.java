package cecs343_softwareproject;

public class Card9 extends Card {

    Player p;

    public Card9() {
        this.name = "Goodbye, Professor";
        this.reward = "10 Quality Points";
        this.location.add("Room Of Retirement");
        this.prereq = "6 Learning, 6 Craft, 6 Integrity";
        this.fail = "Lose 1 Game Card and Leave this card in ROR";
        this.fileName = ("Card9.png");
        setImage("Card9.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if ((p.room.getNameRoom().equals("Room of Retirement"))) {
            if (p.learning <= 6 && p.craft <= 6 && p.integrityChip <= 6) {
                this.p.setQP(10);
                return true;
            }
            fail();
            return false;
        }
        return false;

    }

    private void fail() {
        System.out.println("Failed to play " + name);
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
