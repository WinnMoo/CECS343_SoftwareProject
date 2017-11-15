package cecs343_softwareproject;

public class Card17 extends Card {

    public Card17() {
        this.name = "Learning Netbeans";
        this.reward = "5 Quality Points";
        this.location.add("Lactation Lounge");
        this.prereq = "3 Learning";
        this.fail = "Lose 3 Quality Points";
        this.fileName = ("Card17.png");
        setImage("Card17.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Lactation Lounge")) {
            if (p.getLearning() >= 3) {
                p.setQP(5);
                System.out.println("Incrementing quality points by 5");
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
