package cecs343_softwareproject;

public class Card19 extends Card {

    public Card19() {
        this.name = "Pass Soccer Class";
        this.reward = "5 Quality Points";
        this.location.add("George Allen Field");
        this.prereq = "5 Craft";
        this.fail = "Lose 3 Quality Points";
        this.fileName = ("Card19.png");
        setImage("Card19.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("George Allen Field")) {
            if (p.getCraft() >= 5) {
                p.setQP(5);
                System.out.println("Incrementing Craft by 5");
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
        p.setQP(-3);
    }
}
