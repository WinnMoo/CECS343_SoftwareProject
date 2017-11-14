package cecs343_softwareproject;

public class Card12 extends Card {

    public Card12() {
        this.name = "Late for Class";
        this.reward = "1 Craft Chip and Teleport to Lactation Lounge";
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
        this.fileName = ("Card12.png");
    }

    public boolean play(Player p) {
        if(!(p.room.getNameRoom()).equals("Forbidden Parking"))
        {
            p.incCraft();
            p.setRoomName("Lactaction Lounge");
            return true;
            
        }
        return false;

    }
}
