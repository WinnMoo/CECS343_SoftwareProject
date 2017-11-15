package cecs343_softwareproject;

public class Card25 extends Card {

    public Card25() {
        this.name = "Loud Buzzing";
        this.reward = "1 Chip of Your Choice";
        this.location.add("Eat Club");
        this.prereq = "3 Craft";
        this.fail = "Lose 2 Quality Points";
        this.fileName = ("Card25.png");
        setImage("Card25.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Eat Club")) {
            if (p.getCraft() >= 3) {
                optionPicker a = new optionPicker(true, true, true);
                if (a.selectedAbility == AbilityType.CRAFT) {
                    p.incCraft();
                    System.out.println("Incrementing Craft");
                } else if (a.selectedAbility == AbilityType.LEARNING) {
                    p.incLearning();
                    System.out.println("Incrementing Learning");
                } else {
                    p.incIntegrity();
                    System.out.println("Incrementing Integrety");
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
        p.setQP(-2);
    }
}
