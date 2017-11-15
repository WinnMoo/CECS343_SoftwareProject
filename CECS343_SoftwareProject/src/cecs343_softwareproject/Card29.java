package cecs343_softwareproject;

public class Card29 extends Card {

    public Card29() {
        this.name = "Soccer Goalie";
        this.reward = "5 Quality Points and 1 Game Card";
        this.location.add("George Allen Field");
        this.prereq = "3 Learning and 3 Craft";
        this.fail = "Go to Student Parking";
        this.fileName = ("Card29.png");
        setImage("Card29.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("George Allen Field")) {
            if (p.getLearning() >= 3 && p.getCraft() >= 3) {
                p.setQP(5);
                System.out.println("Incrementing quality points by 5");
                p.dealACard(appModel.deck.dealCard());
                System.out.println("User has been dealt a card");
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
        System.out.println("Failed to play " + name);
        p.setRoomName("Student Parking");
        System.out.println("");
    }
}
