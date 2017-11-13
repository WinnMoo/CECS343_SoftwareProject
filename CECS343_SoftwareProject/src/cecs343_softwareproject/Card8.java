package cecs343_softwareproject;

public class Card8 extends Card{
	public Card8() {
        this.name = "Finding the Lab";
        this.reward = "1 Integrity Chip";
        this.locationName = "Elevators";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}