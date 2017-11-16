package cecs343_softwareproject;

public class Card35 extends Card {

    public Card35() {
        this.name = "Learning Linux";
        this.reward = "3 Quality Points and a Chip of Your Choice";
        this.location.add("Computer Lab");
        this.prereq = "2 Craft and 3 Integrity";
        this.fail = "Lose 1 Quality Point";
        this.fileName = ("Card35.png");
        setImage("Card35.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Computer Lab")) {
            p.setQP(3);
            optionPicker a = new optionPicker(true, true, true);
            if (a.selectedAbility == AbilityType.LEARNING) {
                p.incLearning();
                System.out.println("Incrementing Learning");
            } else if(a.selectedAbility == AbilityType.CRAFT) {
                p.incCraft();
                System.out.println("Incrementing Craft");
            }else {
                p.incIntegrity();
                System.out.println("Incrementing Integrity");
            }
            System.out.println("===========================");
            return true;
        } else {
            fail(p);
            System.out.println("Player has failed to play " + name);
            System.out.println("===========================");
            return false;
        }

    }

    private void fail(Player p) {
        p.setQP(-1);
    }
}
