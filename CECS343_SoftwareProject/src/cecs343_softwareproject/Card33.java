package cecs343_softwareproject;

public class Card33 extends Card{
	public Card33() {
        this.name = "CHEM 111";
        this.reward = "5 Quality Points";
        this.locationName = "Any building except ECS";
        this.prereq = "6 Craft";
        this.fail = "Go to Student Parking";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}