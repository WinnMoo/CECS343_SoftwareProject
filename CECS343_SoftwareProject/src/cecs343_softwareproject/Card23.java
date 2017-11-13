package cecs343_softwareproject;

public class Card23 extends Card{
	public Card23() {
        this.name = "A New Laptop";
        this.reward = "3 Quality Points and a Chip of Your Choice";
        this.locationName = "Computer Lab";
        this.prereq = "4 Integrity";
        this.fail = "Discard 1 Game Card";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}