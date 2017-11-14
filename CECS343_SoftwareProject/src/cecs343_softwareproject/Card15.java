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
        if (p.room.getNameRoom().equals("George Allen Field")) {
            if (p.getIntegrity() >= 4) {
                p.incCraft();
                p.incCraft();

                return true;
            }
            fail(p);
            return false;
        }

        return false;
    }

    private void fail(Player p) {
        p.setRoomName("Room of Retirement");
    }
}
