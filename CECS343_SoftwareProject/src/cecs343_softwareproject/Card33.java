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
    }

    @Override
    public boolean play(Player p) {
        if (!(p.room.getNameRoom().equals("Computer Lab"))
                || !(p.room.getNameRoom().equals("ECS302"))
                || !(p.room.getNameRoom().equals("Eat Club"))
                || !(p.room.getNameRoom().equals("CECS Conference Room"))
                || !(p.room.getNameRoom().equals("North Hall"))
                || !(p.room.getNameRoom().equals("South Hall"))
                || !(p.room.getNameRoom().equals("Room of Retirement"))
                || !(p.room.getNameRoom().equals("Elevators"))
                || !(p.room.getNameRoom().equals("ECS308"))
                || !(p.room.getNameRoom().equals("Lactation Lounge"))) {
            p.setQP(5);
            return true;

        } else {
            fail(p);
            return false;
        }

    }

    private void fail(Player p) {
        p.setRoomName("Student Parking");
    }
}
