package cecs343_softwareproject;

public class Card9 extends Card {

    public Card9() {
        this.name = "Goodbye, Professor";
        this.reward = "10 Quality Points";
        this.location.add("Room Of Retirement");
        this.prereq = "6 Learning, 6 Craft, 6 Integrity";
        this.fail = "Lose 1 Game Card and Leave this card in ROR";
        this.fileName = ("Card9.png");
        setImage("Card9.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if ((p.room.getNameRoom().equals("Room of Retirement"))) {
            if (p.learning < 6 || p.craft < 6 || p.integrityChip < 6) {
                p.setQP(10);
                System.out.println("Player has earned 10 quality points");
                System.out.println("===========================");
                return true;
            }
            fail(p);
            System.out.println("===========================");
            return false;
        } else {
            fail(p);
            System.out.println("===========================");
            return false;
        }
    }

    private void fail(Player p) {
        System.out.println("Failed to play " + name);
        if (p.name.equals("John")) {
            CardDialog c = new CardDialog(p);
            c.setVisible(true);
        }
    }
}
