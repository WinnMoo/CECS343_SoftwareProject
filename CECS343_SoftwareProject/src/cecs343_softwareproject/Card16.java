package cecs343_softwareproject;

public class Card16 extends Card {
Player p;
    public Card16() {
        this.name = "Math 123";
        this.reward = "5 Quality Points";
        this.location.add("ECS 302");
        this.location.add("ECS 308");
        this.prereq = "5 Learning";
        this.fail = "Lose 3 Quality Points and Lose 1 Game Card";
        this.fileName = ("Card16.png");
    }

    public boolean play(Player pp) {
        this.p = pp;
        if(p.room.getNameRoom().equals("ECS 302")||p.room.getNameRoom().equals("ECS 302"))
        {
            if(this.p.getLearning()>=5)
            {
                this.p.setQP(5);
                return true;
            }
            fail();
                return false;
        }
        
        return false; 

    }

    private void fail() {
        this.p.setQP(-3);
        CardDialog c = new CardDialog();
        c.setVisible(true);
    }
}
