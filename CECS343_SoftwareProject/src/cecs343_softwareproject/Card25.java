package cecs343_softwareproject;

public class Card25 extends Card{
	public Card25() {
        this.name = "Loud Buzzing";
        this.reward = "1 Chip of Your Choice";
        this.locationName = "EAT Room";
        this.prereq = "3 Craft";
        this.fail = "Lose 2 Quality Points";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}