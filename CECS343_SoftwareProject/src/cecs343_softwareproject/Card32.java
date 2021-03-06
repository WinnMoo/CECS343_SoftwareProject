package cecs343_softwareproject;

public class Card32 extends Card {

    public Card32() {
        this.name = "Professor Hoffman";
        this.reward = "5 Quality Points and 2 Game Cards";

        this.location.add("Computer Lab");
        this.location.add("ECS308");
        this.location.add("ECS302");
        this.location.add("Eat Club");
        this.location.add("CECS Conference Room");
        this.location.add("North Hall");
        this.location.add("South Hall");
        this.location.add("Room of Retirement");
        this.location.add("Elevators");

        this.prereq = "3 Learning";
        this.fail = "Lose 5 Quality Points and Go to Lactation Lounge";
        this.fileName = ("Card32.png");

        setImage("Card32.png");
    }

    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Computer Lab")
                || p.room.getNameRoom().equals("ECS308")
                || p.room.getNameRoom().equals("ECS302")
                || p.room.getNameRoom().equals("Eat Club")
                || p.room.getNameRoom().equals("CECS Conference Room")
                || p.room.getNameRoom().equals("North Hall")
                || p.room.getNameRoom().equals("South Hall")
                || p.room.getNameRoom().equals("Room of Retirement")
                || p.room.getNameRoom().equals("Elevators")) {
            if (p.getLearning() >= 3) {
                p.setQP(5);
                System.out.println("Incrementing quality points by 5");
                System.out.println("===========================");
                return true;
            }
            fail(p);
            System.out.println("User has failed to play" + name);
            System.out.println("===========================");
            return false;
        }
        fail(p);
        System.out.println("User has failed to play" + name);
        System.out.println("===========================");
        return false;
    }

    private void fail(Player p) {
        if (p.getName().equals("John")) {
            System.out.println("Failed to play " + name);
            if (p.name.equals("John")) {
                CardDialog c = new CardDialog(p);
                c.setVisible(true);
            }
        }
    }
}
