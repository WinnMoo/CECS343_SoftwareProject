package cecs343_softwareproject;

public class Card22 extends Card {

    public Card22() {
        this.name = "Make the Dean's List";
        this.reward = "5 Quality Points";
        this.location.add("North Hall");
        this.location.add("South Hall");
        this.prereq = "6 Learning";
        this.fail = "Go to Student Parking";
        this.fileName = ("Card22.png");
        setImage("Card22.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("North Hall")|| p.room.getNameRoom().equals("South Hall")) {
            if (p.getLearning() >= 6) {
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
