package cecs343_softwareproject;

public class Card29 extends Card{
	public Card29() {
        this.name = "Soccer Goalie";
        this.reward = "5 Quality Points and 1 Game Card";
        this.locationName = "George Allen Field";
        this.prereq = "3 Learning and 3 Craft";
        this.fail = "Go to Student Parking";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}