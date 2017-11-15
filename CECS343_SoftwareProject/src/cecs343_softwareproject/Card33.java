package cecs343_softwareproject;

public class Card33 extends Card {

    public Card33() {
        this.name = "CHEM 111";
        this.reward = "5 Quality Points";
        this.location.add("Japanese Garden");
        this.location.add("Student Parking");
        this.location.add("Forbidden Parking");
        this.location.add("Rec Center");
        this.location.add("George Allen Field");
        this.location.add("West Walkway");
        this.location.add("East Walkway");
        this.location.add("Bratwurst Hall");
        this.location.add("LA 5");
        this.location.add("Library");
        this.location.add("Walter Pyramid");
        this.prereq = "6 Craft";
        this.fail = "Go to Student Parking";
        this.fileName = ("Card33.png");
        setImage("Card33.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if ((p.room.getNameRoom().equals("Japanese Garden"))
                || (p.room.getNameRoom().equals("Student Parking"))
                || (p.room.getNameRoom().equals("Forbidden Parking"))
                || (p.room.getNameRoom().equals("Rec Center"))
                || (p.room.getNameRoom().equals("George Allen Field"))
                || (p.room.getNameRoom().equals("West Walkway"))
                || (p.room.getNameRoom().equals("East Walkway"))
                || (p.room.getNameRoom().equals("Bratwurst Hall"))
                || (p.room.getNameRoom().equals("LA 5"))
                || (p.room.getNameRoom().equals("Library"))
                || (p.room.getNameRoom().equals("Walter Pyramid"))) {
            if (p.craft == 6) {
                p.setQP(5);
                System.out.println("Incrementing quality points by 5");
                System.out.println("===========================");
                return true;
            } else {
                fail(p);
                System.out.println("User has failed to play " + name);
                System.out.println("===========================");
                return false;
            }

        } else {
            fail(p);
            System.out.println("User has failed to play " + name);
            System.out.println("===========================");
            return false;
        }

    }

    private void fail(Player p) {
        p.setRoomName("Student Parking");
    }
}
