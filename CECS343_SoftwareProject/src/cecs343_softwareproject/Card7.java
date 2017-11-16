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
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Forbidden Parking")) {
            p.incLearning();
            System.out.println("Incrementing learning");
            if (p.getName().equals("John")) {
                int re = JOptionPane.showConfirmDialog(null, "Would you like to trade 1 Game Card for another learning chip? ", "Choose one", 0);

                System.out.println("Failed to play " + name);
                if (p.name.equals("John")) {
                    CardDialog c = new CardDialog(p);
                    c.setVisible(true);
                }
                p.incLearning();
            }
            System.out.println("===========================");
            return true;
        }
        System.out.println("Failed to play " + name);
        System.out.println("===========================");
        return false;

    }
}
