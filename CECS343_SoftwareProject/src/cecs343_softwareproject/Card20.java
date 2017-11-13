package cecs343_softwareproject;

public class Card20 extends Card{
	public Card20() {
        this.name = "Score a Goal!";
        this.reward = "5 Quality Points and 1 Integrity Chip";
        this.locationName = "George Allen Field";
        this.prereq = "3 Craft";
        this.fail = "Go to Student Parking";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}