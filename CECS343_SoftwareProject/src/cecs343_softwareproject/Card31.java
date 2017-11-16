package cecs343_softwareproject;

import java.util.Random;

public class Card31 extends Card {
    public Random rand;
    public Card31() {
        this.name = "Oral Communication";
        this.reward = "4 Quality Points and 1 Chip of Your Choice";
        this.location.add("Japanese Garden");
        this.location.add("Student Parking");
        this.location.add("Forbidden Parking");
        this.location.add("Rec Center");
        this.location.add("George Allen Field");
        this.location.add("West Walkway");
        this.location.add("East Walkway");
        this.location.add("Bratwurst Hall");
        this.location.add("LA 5");
        this.location.add("Library");
        this.location.add("Walter Pyramid");
        this.prereq = "4 Integrity";
        this.fail = "Discard 1 Game Card";
        this.fileName = ("Card31.png");
        setImage("Card31.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if ((p.room.getNameRoom().equals("Japanese Garden"))
                || (p.room.getNameRoom().equals("Student Parking"))
                || (p.room.getNameRoom().equals("Forbidden Parking"))
                || (p.room.getNameRoom().equals("Rec Center"))
                || (p.room.getNameRoom().equals("George Allen Field"))
                || (p.room.getNameRoom().equals("West Walkway"))
                || (p.room.getNameRoom().equals("East Walkway"))
                || (p.room.getNameRoom().equals("Bratwurst Hall"))
                || (p.room.getNameRoom().equals("LA 5"))
                || (p.room.getNameRoom().equals("Library"))
                || (p.room.getNameRoom().equals("Walter Pyramid"))) {
            if (p.getIntegrity() >= 4) {
                p.setQP(4);
                if(p.name.equals("John")){
                optionPicker a = new optionPicker(p, true, true, true);
                }else {
                int n = rand.nextInt(3);
                if (n == 1) {
                    p.incLearning();
                } else if (n == 2) {
                    p.incIntegrity();
                } else {
                    p.incCraft();
                }
            }
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
        if (p.getName().equals("John")) {
            System.out.println("Failed to play " + name);
            if (p.name.equals("John")) {
                CardDialog c = new CardDialog(p);
                c.setVisible(true);
            }
        }
    }
}
