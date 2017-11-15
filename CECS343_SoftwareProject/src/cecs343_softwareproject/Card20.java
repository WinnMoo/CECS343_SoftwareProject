package cecs343_softwareproject;

public class Card20 extends Card {

    public Card20() {
        this.name = "Score a Goal!";
        this.reward = "5 Quality Points and 1 Integrity Chip";
        this.location.add("George Allen Field");
        this.prereq = "3 Craft";
        this.fail = "Go to Student Parking";
        this.fileName = ("Card20.png");
        setImage("Card20.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("George Allen Field")) {
            if (p.getCraft() >= 3) {
                p.incIntegrity();
                System.out.println("Incrementing integrity");
                p.setQP(5);
                System.out.println("Incrementing quality points by 5");
                System.out.println("===========================");
                return true;
            }
            fail(p);
        System.out.println("User has failed to play " + name);
        System.out.println("===========================");
            return false;
        }
        fail(p);
        System.out.println("User has failed to play " + name);
        System.out.println("===========================");
        return false;
    }

    private void fail(Player p) {
        p.setRoomName("Student Parking");
    }
}
