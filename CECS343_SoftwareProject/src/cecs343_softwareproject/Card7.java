package cecs343_softwareproject;

public class Card7 extends Card{
	public Card7() {
        this.name = "Parking Violation";
        this.reward = "1 Learning Chip. Option to discard 1 game card for another learning chip";
        this.locationName = "Forbidden Parking";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}