package cecs343_softwareproject;

public class Card26 extends Card {

    public Card26() {
        this.name = "Program Crashes";
        this.reward = "5 Quality Points and Chip of Your Choice";
        this.location.add("Lactation Lounge");
        this.prereq = "2 Learning";
        this.fail = "Discard 1 Game Card";
        this.fileName = ("Card26.png");
        setImage("Card26.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Lactation Lounge")) {
            System.out.println("Player successfully played card");
            if (p.getLearning() >= 6) {
                p.setQP(5);
                optionPicker a = new optionPicker(true, true, true);
                if (a.selectedAbility == AbilityType.CRAFT) {
                    p.incCraft();
                    System.out.println("Incrementing Craft");
                } else if (a.selectedAbility == AbilityType.LEARNING) {
                    p.incLearning();
                    System.out.println("Incrementing Learning");
                } else {
                    p.incIntegrity();
                    System.out.println("Incrementing Integrity");
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
