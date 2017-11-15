package cecs343_softwareproject;

public class Card21 extends Card {

    public Card21() {
        this.name = "Fall in the Pond";
        this.reward = "1 Integrity Chip and 1 Craft Chip";
        this.location.add("Japanese Garden");
        this.prereq = "3 Learning";
        this.fail = "Go to Lactation Lounge";
        this.fileName = ("Card21.png");
        setImage("Card21.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Japanese Garden")) {
            if (p.getLearning() >= 3) {
                p.incCraft();
                System.out.println("Incrementing Craft");
                p.incIntegrity();
                System.out.println("Incrementing Integrity");
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
        p.setRoomName("Lactation Lounge");
    }
}
