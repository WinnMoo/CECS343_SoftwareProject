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
        if (p.room.getNameRoom().equals("Forbidden Parking")) {
            p.incLearning();

            int re = JOptionPane.showConfirmDialog(null, "Would you like to trade 1 Game Card for another learning chip? ", "Choose one", 0);
            CardDialog c = new CardDialog();
            c.setVisible(true);
            p.incLearning();
            return true;
        }
        return false;

    }
}
