package cecs343_softwareproject;

public class Card37 extends Card {

    public Card37() {
        this.name = "Enjoying Nature";
        this.reward = "1 Craft Chip and Teleport to Lactation Lounge";
        this.location.add("Japanese Garden");
        this.location.add("Student Parking");
        this.location.add("Forbidden Parking");
        this.location.add("Rec Center");
        this.location.add("George Allen Field");
        this.location.add("West Walkway");
        this.location.add("East Walkway");
        this.location.add("Bratwurst Hall");
        this.location.add("LA 5");
        this.location.add("Library");
        this.location.add("Walter Pyramid");
    }

    public boolean play(Player p) {
        if (p.room.getNameRoom().equals("Japanese Garden") || p.room.getNameRoom().equals("Student Parking") || p.room.getNameRoom().equals("Forbidden Parking") || p.room.getNameRoom().equals("Rec Center") || p.room.getNameRoom().equals("George Allen Field") || p.room.getNameRoom().equals("West Walkway")|| p.room.getNameRoom().equals("East Walkway")|| p.room.getNameRoom().equals("Bratwurst Hall")|| p.room.getNameRoom().equals("LA 5")|| p.room.getNameRoom().equals("Library")|| p.room.getNameRoom().equals("Walter Pyramid")) {
            if (p.getIntegrity() >= 2) {
                p.setQP(3);
                optionPicker a = new optionPicker(true, true, true);
                if (a.selectedAbility == AbilityType.CRAFT) {
                    p.incCraft();
                } else if (a.selectedAbility == AbilityType.LEARNING) {
                    p.incLearning();
                } else {
                    p.incIntegrity();
                }
                return true;
            }
            fail(p);
            return false;
        }

        return false;
    }

    private void fail(Player p) {
        p.discardCard();
    }
}
