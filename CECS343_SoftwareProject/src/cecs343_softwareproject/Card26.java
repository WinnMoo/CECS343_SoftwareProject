package cecs343_softwareproject;

import java.util.Random;

public class Card26 extends Card {

    public Random rand;

    public Card26() {
        this.name = "Program Crashes";
        this.reward = "5 Quality Points and Chip of Your Choice";
        this.location.add("Lactation Lounge");
        this.prereq = "2 Learning";
        this.fail = "Discard 1 Game Card";
        this.fileName = ("Card26.png");
        setImage("Card26.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Lactation Lounge")) {
            System.out.println("Player successfully played card");
            if (p.getLearning() >= 6) {
                p.setQP(5);
                if (p.name.equals("John")) {
                    optionPicker a = new optionPicker(p, true, true, true);
                } else {
                    int n = rand.nextInt(3);
                    if (n == 1) {
                        p.incLearning();
                    } else if (n == 2) {
                        p.incIntegrity();
                    } else {
                        p.incCraft();
                    }
                }
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
        if (p.getName().equals("John")) {
            System.out.println("Failed to play " + name);
            if (p.name.equals("John")) {
                CardDialog c = new CardDialog(p);
                c.setVisible(true);
            }
        }
    }
}
