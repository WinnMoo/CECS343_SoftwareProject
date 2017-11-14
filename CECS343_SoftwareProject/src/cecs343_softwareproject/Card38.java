package cecs343_softwareproject;

public class Card38 extends Card {
    
    public Card38() {
        this.name = "Student Parking";
        this.reward = "1 Craft Chip and Teleport to Lactation Lounge";
        this.location.add("Student Parking");
        this.fileName = ("Card38.png");
    }
    
    @Override
    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("Student Parking")) {
            p.incCraft();
            p.setRoomName("Lactation Lounge");
            return true;
        } else {
            return false;
        }
    }
}
