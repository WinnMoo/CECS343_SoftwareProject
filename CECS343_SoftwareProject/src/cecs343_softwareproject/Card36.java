package cecs343_softwareproject;

import java.util.ArrayList;

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
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("South Hall") || p.room.getNameRoom().equals("North Hall")) {
            if (p.integrityChip >= 2) {
                p.setQP(3);
                if(p.name.equals("John")){
                optionPicker a = new optionPicker(p, true, true, true);
                }
                System.out.println("===========================");
                return true;
            } else {
                fail(p);
                System.out.println("Player has failed to play" + name);
                System.out.println("===========================");
                return false;
            }
        } else {
            fail(p);
            System.out.println("Player has failed to play" + name);
            System.out.println("===========================");
            return false;
        }

    }

    private void fail(Player p) {
        if (p.name.equals("John")) {
            System.out.println("Failed to play " + name);
        if (p.name.equals("John")) {
            CardDialog c = new CardDialog(p);
            c.setVisible(true);
        }
        }
    }
}
