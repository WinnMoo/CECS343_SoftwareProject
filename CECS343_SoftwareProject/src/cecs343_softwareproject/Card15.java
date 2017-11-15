package cecs343_softwareproject;

public class Card15 extends Card {

    public Card15() {
        this.name = "KIN 253 Learning the Rules of Soccer";
        this.reward = "2 Craft Chips";
        this.location.add("George Allen Field");
        this.prereq = "4 Integrity";
        this.fail = "Go to Room of Retirement";
        this.fileName = ("Card15.png");
        setImage("Card15.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("George Allen Field")) {
            if (p.getIntegrity() >= 4) {
                p.incCraft();
                p.incCraft();
                System.out.println("Incrementing craft points by 2");
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
        p.setRoomName("Room of Retirement");
    }

}
