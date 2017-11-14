package cecs343_softwareproject;

public class Card35 extends Card {

    public Card35() {
        this.name = "Learning Linux";
        this.reward = "3 Quality Points and a Chip of Your Choice";
        this.location.add("Computer Lab");
        this.prereq = "2 Craft and 3 Integrity";
        this.fail = "Lose 1 Quality Point";
        this.fileName = ("Card35.png");
    }

    @Override
    public boolean play(Player p) {

        if (p.room.getNameRoom().equals("Computer Lab")) {
            p.setQP(3);
            //chipDialog
            
            return true;
        } else {
            fail(p);
            return false;
        }

    }

    private void fail(Player p) {
        p.setQP(-1);
    }
}
