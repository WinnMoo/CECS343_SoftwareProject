package cecs343_softwareproject;

import javax.swing.JOptionPane;

public class Card7 extends Card {

    public Card7() {
        this.name = "Parking Violation";
        this.reward = "1 Learning Chip. Option to discard 1 game card for another learning chip";
        this.location.add("Forbidden Parking");
        this.fileName = ("Card7.png");
        setImage("Card7.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Forbidden Parking")) {
            p.incLearning();

            if (p.getName().equals("John")) {
                int re = JOptionPane.showConfirmDialog(null, "Would you like to trade 1 Game Card for another learning chip? ", "Choose one", 0);

                CardDialog c = new CardDialog(p.hand.get(0), p.hand.get(1), p.hand.get(2), p.hand.get(3), p.hand.get(4));
                c.setVisible(true);
                String cardToDiscard = c.getDiscardedCard();
                for (int i = 1; i < 6; i++) {
                    if (p.hand.get(i).name.equals(cardToDiscard)) {
                        p.hand.remove(i);
                    }
                }
                p.incLearning();
            }
            return true;
        }
        return false;

    }
}
