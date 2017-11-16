package cecs343_softwareproject;

public class Card24 extends Card {

    public Card24() {
        this.name = "Meet the Dean";
        this.reward = "5 Quality Points and 1 Game Card";
        this.location.add("North Hall");
        this.location.add("South Hall");
        this.prereq = "3 Learning, 3 Craft, 3 Integrity";
        this.fail = "Discard 1 Game Card";
        this.fileName = ("Card24.png");
        setImage("Card24.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("North Hall") || p.room.getNameRoom().equals("South Hall")) {
            if (p.getIntegrity() >= 3 && p.getCraft() >= 3 && p.getIntegrity() >= 3) {
                p.setQP(5);
                System.out.println("Incrementing quality points by 5");
                //
                Card tempCard = appModel.gameDeck.get(appModel.gameDeck.size() - 1);
                appModel.gameDeck.remove(appModel.gameDeck.size() - 1);
                appModel.listOfPlayers[0].hand.add(tempCard);
                System.out.println("Dealing a card to player");
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
        if (p.getName().equals("John")) {
            System.out.println("Failed to play " + name);
            if (p.name.equals("John")) {
                CardDialog c = new CardDialog(p);
                c.setVisible(true);
            }
        }
    }
}
