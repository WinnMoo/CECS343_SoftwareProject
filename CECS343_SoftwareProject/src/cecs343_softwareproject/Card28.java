package cecs343_softwareproject;

public class Card28 extends Card {

    public Card28() {
        this.name = "Press the Right Floor";
        this.reward = "2 Craft Chips";
        this.location.add("Elevators");
        this.prereq = "4 Learning";
        this.fail = "Lose 2 Quality Points";
        this.fileName = ("Card28.png");
    }

    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("Elevators")) {
            if (p.getLearning() >= 4) {
                p.incCraft();
                p.incCraft();

                return true;
            }
            fail(p);
            return false;
        }

        return false;
    }

    private void fail(Player p) {
        p.setQP(-2);
    }
}
