package cecs343_softwareproject;

public class Card24 extends Card {

    public Card24() {
        this.name = "Meet the Dean";
        this.reward = "5 Quality Points and 1 Game Card";
        this.location.add("North Hall");
        this.location.add("South Hall");
        this.prereq = "3 Learning, 3 Craft, 3 Integrity";
        this.fail = "Discard 1 Game Card";
    }

    public boolean play(Player p) {
           if (p.room.getNameRoom().equals("Computer Lab")) {
            if (p.getIntegrity() >= 3 && p.getCraft() >= 3 && p.getIntegrity() >= 3) {
                p.setQP(5);
                p.dealACard(appModel.deck.dealCard());
                return true;
            }
            fail(p);
            return false;
        }

        return false;
    }

    private void fail(Player p) {
        p.discardCard();
        CardDialog c = new CardDialog();
        c.setVisible(true);
    }
}
