package cecs343_softwareproject;

public class Card27 extends Card {

    public Card27() {
        this.name = "Professor Englert";
        this.reward = "Chip of Your Choice";
        this.location.add("CECS Conference Room");
        this.prereq = "3 Integrity";
        this.fail = "Discard 1 Game Card";
        this.fileName = ("Card27.png");
        setImage("Card27.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("CECS Conference Room")) {
            if (p.getIntegrity() >= 3) {
                if(p.name.equals("John")){
                optionPicker a = new optionPicker(p, true, true, true);
                }
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
