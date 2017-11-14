package cecs343_softwareproject;

public class Card2 extends Card {

    public Card2() {
        this.name = "Math 122";
        this.reward = "1 Learning Chip, 1 Integrity Chip";
        this.location.add("Library");

    }

    public boolean play(Player p) {
        if ((p.room.getNameRoom().equals("Library"))) {
            optionPicker a = new optionPicker(true,false,true);
            if(a.selectedAbility == AbilityType.LEARNING)
            {
            p.incLearning();
            }
            else{
                p.incIntegrity();
            }
            p.incLearning();
            return true;
        }
        return true;

    }
}
