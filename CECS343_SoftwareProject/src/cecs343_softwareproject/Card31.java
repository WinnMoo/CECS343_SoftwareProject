package cecs343_softwareproject;

public class Card31 extends Card{
	public Card31() {
        this.name = "Oral Communication";
        this.reward = "4 Quality Points and 1 Chip of Your Choice";
        this.locationName = "Any Building other than ECS";
        this.prereq = "4 Integrity";
        this.fail = "Discard 1 Game Card";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}