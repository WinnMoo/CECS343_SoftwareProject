package cecs343_softwareproject;

public class Card34 extends Card{
	public Card34() {
		this.name = "The Outpost";
        this.reward = "1 Chip of Your Choice";
        this.locationName = "Any space outside ECS except Forbidden Parking";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}