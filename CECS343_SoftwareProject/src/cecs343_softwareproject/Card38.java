package cecs343_softwareproject;

public class Card38 extends Card {
    
    public Card38() {
        this.name = "Student Parking";
        this.reward = "1 Craft Chip and Teleport to Lactation Lounge";
        this.location.add("Student Parking");
        this.fileName = ("Card38.png");
        setImage("Card38.png");
    }
    
    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Student Parking")) {
            p.incCraft();
            p.setRoomName("Lactation Lounge");
            System.out.println("Incrementing Craft");
            System.out.println("Teleporting to Lactation Lounge");
            System.out.println("===========================");
            return true;
        } else {
            System.out.println("User has failed to play" + name);
            System.out.println("===========================");
            return false;
        }
    }
}
