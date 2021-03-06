package cecs343_softwareproject;

public class Card13 extends Card {

    public Card13() {
        this.name = "Physics 151";
        this.reward = "5 Quality Points";
        this.location.add("ECS308");
        this.prereq = "3 Craft";
        this.fail = "Lose 3 Quality Points";
        this.fileName = ("Card13.png");
        setImage("Card13.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("ECS308")) {
            if (p.getCraft() >= 3) {
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
