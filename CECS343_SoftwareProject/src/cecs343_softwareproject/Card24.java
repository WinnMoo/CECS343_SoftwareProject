package cecs343_softwareproject;

public class Card24 extends Card {

    public Card24() {
        this.name = "Meet the Dean";
        this.reward = "5 Quality Points and 1 Game Card";
        this.location.add("North Hall");
        this.location.add("South Hall");
        this.prereq = "3 Learning, 3 Craft, 3 Integrity";
        this.fail = "Discard 1 Game Card";
        this.fileName = ("Card24.png");
        setImage("Card24.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("North Hall") || p.room.getNameRoom().equals("South Hall")) {
            if (p.getIntegrity() >= 3 && p.getCraft() >= 3 && p.getIntegrity() >= 3) {
                p.setQP(5);
                System.out.println("Incrementing quality points by 5");
                p.dealACard(appModel.deck.dealCard());
                System.out.println("Dealing a card to player");
                System.out.println("===========================");
                return true;
            }
            fail(p);
            System.out.println("User has failed to play " + name);
            System.out.println("===========================");
            return false;
        }
        fail(p);
        System.out.println("User has failed to play " + name);
        System.out.println("===========================");
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
