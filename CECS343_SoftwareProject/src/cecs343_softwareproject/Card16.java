package cecs343_softwareproject;

public class Card16 extends Card {

    public Card16() {
        this.name = "Math 123";
        this.reward = "5 Quality Points";
        this.location.add("ECS302");
        this.location.add("ECS308");
        this.prereq = "5 Learning";
        this.fail = "Lose 3 Quality Points and Lose 1 Game Card";
        this.fileName = ("Card16.png");
        setImage("Card16.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("ECS302") || p.room.getNameRoom().equals("ECS302")) {
            if (p.getLearning() >= 5) {
                p.setQP(5);
                System.out.println("Incrementing quality points by 5");
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
        p.setQP(-3);
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
