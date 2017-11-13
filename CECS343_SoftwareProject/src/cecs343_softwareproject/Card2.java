package cecs343_softwareproject;

public class Card2 extends Card{
	public Card2() {
		this.name = "Math 122";
        this.reward = "1 Learning Chip, 1 Integrity Chip";
        this.locationName = "Library";

}
	public boolean play(Player p)
	{
		return true;
		
	}
}