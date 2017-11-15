package cecs343_softwareproject;

public class Card34 extends Card {

    public Card34() {
        this.name = "The Outpost";
        this.reward = "1 Chip of Your Choice";
        this.location.add("Japanese Garden");
        this.location.add("Student Parking");
        this.location.add("Rec Center");
        this.location.add("George Allen Field");
        this.location.add("West Walkway");
        this.location.add("East Walkway");
        this.location.add("Bratwurst Hall");
        this.location.add("LA 5");
        this.location.add("Library");
        this.location.add("Walter Pyramid");
        this.fileName = ("Card34.png");
        setImage("Card34.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("Player is in " + p.room.getNameRoom());
        if ((p.room.getNameRoom().equals("Japanese Garden"))
                || (p.room.getNameRoom().equals("Student Parking"))
                || (p.room.getNameRoom().equals("Rec Center"))
                || (p.room.getNameRoom().equals("George Allen Field"))
                || (p.room.getNameRoom().equals("West Walkway"))
                || (p.room.getNameRoom().equals("East Walkway"))
                || (p.room.getNameRoom().equals("Bratwurst Hall"))
                || (p.room.getNameRoom().equals("LA 5"))
                || (p.room.getNameRoom().equals("Library"))
                || (p.room.getNameRoom().equals("Walter Pyramid"))) {
            optionPicker a = new optionPicker(true, true, true);
            if (a.selectedAbility == AbilityType.LEARNING) {
                p.incLearning();
            } else if(a.selectedAbility == AbilityType.CRAFT) {
                p.incCraft();
            }else {
                p.incIntegrity();
            }
            
            return true;
        }
        return true;

    }
}