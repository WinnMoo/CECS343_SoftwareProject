package cecs343_softwareproject;

public class Card32 extends Card {

    public Card32() {
        this.name = "Professor Hoffman";
        this.reward = "5 Quality Points and 2 Game Cards";

        this.location.add("Computer Lab");
        this.location.add("ECS308");
        this.location.add("ECS302");
        this.location.add("Eat Club");
        this.location.add("CECS Conference Room");
        this.location.add("North Hall");
        this.location.add("South Hall");
        this.location.add("Room of Retirement");
        this.location.add("Elevators");
        

        this.prereq = "3 Learning";
        this.fail = "Lose 5 Quality Points and Go to Lactation Lounge";
        this.fileName = ("Card32.png");
    }

    public boolean play(Player p) {
      if (!p.room.getNameRoom().equals("Lactation Lounge")) {
            if (p.getLearning() >= 3) {
                p.setQP(5);
               
                return true;
            }
            fail(p);
            return false;
        }

        return false;
    }

    private void fail(Player p) {
        p.discardCard();
    }
}
