package cecs343_softwareproject;

public class Card28 extends Card {

    public Card28() {
        this.name = "Press the Right Floor";
        this.reward = "2 Craft Chips";
        this.location.add("Elevators");
        this.prereq = "4 Learning";
        this.fail = "Lose 2 Quality Points";
        this.fileName = ("Card28.png");
        setImage("Card28.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Elevators")) {
            if (p.getLearning() >= 4) {
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
        p.setQP(-2);
    }
}
