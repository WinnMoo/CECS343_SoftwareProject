package cecs343_softwareproject;

public class Card29 extends Card {

    public Card29() {
        this.name = "Soccer Goalie";
        this.reward = "5 Quality Points and 1 Game Card";
        this.location.add("George Allen Field");
        this.prereq = "3 Learning and 3 Craft";
        this.fail = "Go to Student Parking";
        this.fileName = ("Card29.png");
    }

    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("George Allen Field")) {
            if (p.getLearning() >= 3 && p.getCraft() >= 3) {
                p.setQP(5);
                p.dealACard(appModel.deck.dealCard());

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
