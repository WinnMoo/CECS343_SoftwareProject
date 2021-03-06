package cecs343_softwareproject;

import java.util.Random;
public class Card10 extends Card {
    public Random rand;
    public Card10() {
        this.name = "Enjoying the Peace";
        this.reward = "1 Learning Chip or 1 Integrity Chip";
        this.location.add("Japanese Garden");
        this.fileName = ("Card10.png");
        setImage("Card10.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Japanese Garden")) {
            if(p.name.equals("John")){
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
        System.out.println("User has failed to play " + name);
        System.out.println("===========================");
        return false;
    }
}
