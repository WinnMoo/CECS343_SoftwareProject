package cecs343_softwareproject;

import java.util.ArrayList;

public class Card36 extends Card {

    discardDialog dscdDlg;
    public Card36() {
        this.name = "Make a Friend";
        this.reward = "3 Quality Points and a Chip of Your Choice";
        this.location.add("North Hall");
        this.location.add("South Hall");
        this.prereq = "2 Integrity";
        this.fail = "Discard 1 Game Card";
        this.fileName = ("Card36.png");
        setImage("Card36.png");
    }

    @Override
    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("South Hall") || p.room.getNameRoom().equals("North Hallf")) {
            if (p.integrityChip >= 2) {
                p.setQP(3);
                //chip dialog
                return true;
            } else {
                fail(p);
                return false;
            }
        } else {
            fail(p);
            return false;
        }

    }
    
    private void fail(Player p){
        ArrayList<Card> handBeforeDiscard = new ArrayList();
        handBeforeDiscard = appModel.listOfPlayers[0].hand;
//s        dscdDlg.setVisible(true);
    }
}
