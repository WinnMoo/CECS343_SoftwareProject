package cecs343_softwareproject;

public class Card20 extends Card {

    public Card20() {
        this.name = "Score a Goal!";
        this.reward = "5 Quality Points and 1 Integrity Chip";
        this.location.add("George Allen Field");
        this.prereq = "3 Craft";
        this.fail = "Go to Student Parking";
    }

    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("George Allen Field")) {
            if (p.getCraft() >= 3) {
                p.incIntegrity();
                p.setQP(5);

                return true;
            }
            fail(p);
            return false;
        }

        return false;
    }

    private void fail(Player p) {
        p.setRoomName("Student Parking");
    }
}
