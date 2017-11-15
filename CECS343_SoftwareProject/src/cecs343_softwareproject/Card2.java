package cecs343_softwareproject;

public class Card2 extends Card {

    public Card2() {
        this.name = "Math 122";
        this.reward = "1 Learning Chip, 1 Integrity Chip";
        this.location.add("Library");
        this.fileName = ("Card2.png");
        setImage("Card2.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if ((p.room.getNameRoom().equals("Library"))) {
            optionPicker a = new optionPicker(true, false, true);
            if (a.selectedAbility == AbilityType.LEARNING) {
                p.incLearning();
                System.out.println("Incrementing Learning");
            } else {
                p.incIntegrity();
                System.out.println("Incrementing Integrity");
            }
            System.out.println("===========================");
            return true;
        }
        System.out.println("User has failed to play " + name);
        System.out.println("===========================");
        return false;

    }
}
