package cecs343_softwareproject;

public class Card17 extends Card {

    public Card17() {
        this.name = "Learning Netbeans";
        this.reward = "5 Quality Points";
        this.location.add("Lactation Lounge");
        this.prereq = "3 Learning";
        this.fail = "Lose 3 Quality Points";
    }

    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("Lactation Lounge")) {
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
        p.setQP(-3);
    }
}
