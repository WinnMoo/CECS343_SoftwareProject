package cecs343_softwareproject;

public class Card34 extends Card {

    public Card34() {
        this.name = "The Outpost";
        this.reward = "1 Chip of Your Choice";
        this.location.add("Japanese Garden");
        this.location.add("Student Parking");
        this.location.add("Rec Center");
        this.location.add("George Allen Field");
        this.location.add("West Walkway");
        this.location.add("East Walkway");
        this.location.add("Bratwurst Hall");
        this.location.add("LA 5");
        this.location.add("Library");
        this.location.add("Walter Pyramid");
        this.fileName = ("Card34.png");
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
            //chipDialog
            return true;
        }
        return true;

    }
}