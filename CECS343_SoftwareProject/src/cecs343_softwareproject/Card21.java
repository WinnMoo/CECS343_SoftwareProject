package cecs343_softwareproject;

public class Card21 extends Card {

    public Card21() {
        this.name = "Fall in the Pond";
        this.reward = "1 Integrity Chip and 1 Craft Chip";
        this.location.add("Japanese Garden");
        this.prereq = "3 Learning";
        this.fail = "Go to Lactation Lounge";
    }

    public boolean play(Player p) {
         if (p.room.getNameRoom().equals("Japanese Garden")) {
            if (p.getLearning() >= 3) {
                p.incCraft();
                p.incIntegrity();

                return true;
            }
            fail(p);
            return false;
        }

        return false;
    }

    private void fail(Player p) {
        p.setRoomName("Lactation Lounge");
    }
}
