package cecs343_softwareproject;

import java.util.Random;

public class Card11 extends Card {
    public Random rand;
    public Card11() {
        this.name = "Buddy Up";
        this.reward = "1 Learning Chip or 1 Craft Chip";
        this.location.add("Eat Club");
        this.location.add("George Allen Field");
        this.fileName = ("Card11.png");
        setImage("Card11.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Eat Club") || p.room.getNameRoom().equals("George Allen Field")) {
            if (p.name.equals("John")) {
                optionPicker a = new optionPicker(p, true, false, true);

            } else{
                int n = rand.nextInt(2);
                if(n == 1){
                    p.incLearning();
                }else{
                    p.incCraft();
                }
            }

            System.out.println("===========================");
            return true;
        }

        System.out.println(
                "User has failed to play " + name);
        System.out.println(
                "===========================");

        return false;
    }
}
