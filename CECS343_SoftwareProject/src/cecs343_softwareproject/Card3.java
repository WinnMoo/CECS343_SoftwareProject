package cecs343_softwareproject;

public class Card3 extends Card {

    public Card3() {
        this.name = "Professor Murgolo's CECS 174 Class";
        this.reward = "1 Learning Chip";
        this.location.add("ECS302");
        this.fileName = ("Card3.png");

    }

    public boolean play(Player p) {
        if(p.room.getNameRoom().equals("ECS302"))
        {
            p.incLearning();
            return true;
        }
        return false;

    }
}
