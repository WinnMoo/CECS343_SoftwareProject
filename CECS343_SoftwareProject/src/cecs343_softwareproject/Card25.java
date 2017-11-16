package cecs343_softwareproject;

import java.util.Random;

public class Card25 extends Card {
    public Random rand;
    public Card25() {
        this.name = "Loud Buzzing";
        this.reward = "1 Chip of Your Choice";
        this.location.add("Eat Club");
        this.prereq = "3 Craft";
        this.fail = "Lose 2 Quality Points";
        this.fileName = ("Card25.png");
        setImage("Card25.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Eat Club")) {
            if (p.getCraft() >= 3) {
                if(p.name.equals("John")){
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
        p.setQP(-2);
    }
}
