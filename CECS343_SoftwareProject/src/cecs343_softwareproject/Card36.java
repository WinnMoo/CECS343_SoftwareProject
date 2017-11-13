package cecs343_softwareproject;

public class Card36 extends Card{
	public Card36() {
		this.name = "Make a Friend";
        this.reward = "3 Quality Points and a Chip of Your Choice";
        this.locationName = "North or South Hall";
        this.prereq = "2 Integrity";
        this.fail = "Discard 1 Game Card";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}