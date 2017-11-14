package cecs343_softwareproject;

public class Card9 extends Card {

    Player p;

    public Card9() {
        this.name = "Goodbye, Professor";
        this.reward = "10 Quality Points";
        this.location.add("Room Of Retirement");
        this.prereq = "6 Learning, 6 Craft, 6 Integrity";
        this.fail = "Lose 1 Game Card and Leave this card in ROR";
    }

    public boolean play(Player pp) {
        this.p = pp;
        if ((p.room.getNameRoom().equals("Room of Retirement"))) {
            if (p.learning <= 6 && p.craft <= 6 && p.integrityChip <= 6) {
                this.p.setQP(10);
                return true;
            }
            fail();
            return false;
        }
        return false;

    }

    private void fail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
