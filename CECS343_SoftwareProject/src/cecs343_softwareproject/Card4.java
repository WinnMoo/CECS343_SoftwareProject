package cecs343_softwareproject;

public class Card4 extends Card{
	public Card4() {
		this.name = "Lunch at Bratwurst Hall";
        this.reward = "1 Craft Chip";
        this.locationName = "Bratwurst Hall";

}
	public boolean play(Player p)
	{
		return true;
		
	}
}