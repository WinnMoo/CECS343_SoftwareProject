package cecs343_softwareproject;

public class Card18 extends Card {

    public Card18() {
        this.name = "Choosing a Major";
        this.reward = "5 Quality Points";
        this.location.add("CECS Conference Room");
        this.prereq = "3 Integrity";
        this.fail = "Lose 3 Quality Points";
        this.fileName = ("Card18.png");
        setImage("Card18.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("CECS Conference Room")) {
            if (p.getIntegrity() >= 3) {
                p.setQP(5);

                return true;
            }
            fail(p);
            return false;
        }

        return false;
    }

    private void fail(Player p) {
        p.setQP(-3);
    }
}
