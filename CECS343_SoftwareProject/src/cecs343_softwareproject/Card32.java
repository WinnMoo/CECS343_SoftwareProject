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
    }
    
    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("Lactation Lounge")||p.room.getNameRoom().equals("ECS 308")||p.room.getNameRoom().equals("ECS 302")||p.room.getNameRoom().equals("Eat Club")||p.room.getNameRoom().equals("CECS Conference Room")||p.room.getNameRoom().equals("North Hall")||p.room.getNameRoom().equals("South Hall")||p.room.getNameRoom().equals("Room of Retirement")||p.room.getNameRoom().equals("Elevators")) {
            if (p.getLearning() >= 3) {
                p.setQP(5);
                p.dealACard(appModel.deck.dealCard());
                p.dealACard(appModel.deck.dealCard());
                
                return true;
            }
            fail(p);
            return false;
        }
        
        return false;
    }
    
    private void fail(Player p) {
        p.setQP(-5);
        p.setRoomName("Lactation Lounge");
    }
}
