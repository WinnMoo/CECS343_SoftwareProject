package cecs343_softwareproject;

public class Card30 extends Card {
    
    public Card30() {
        this.name = "Elective Class";
        this.reward = "1 Learning Chip and 1 Game Card";
        this.location.add("Library");
        this.prereq = "2 Learning";
        this.fail = "Lose 2 Quality Points";
        this.fileName = ("Card30.png");
        setImage("Card30.png");
    }
    
    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Library")) {
            if (p.getLearning() >= 2) {
                p.incLearning();
                p.dealACard(appModel.deck.dealCard());
                
                return true;
            }
            fail(p);
            return false;
        }
        
        return false;
    }
    
    private void fail(Player p) {
        p.setQP(-2);
    }
}
