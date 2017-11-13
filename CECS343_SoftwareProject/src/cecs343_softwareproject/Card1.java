package cecs343_softwareproject;

public class Card1 extends Card {
	public Card1() {
		this.name = "Research Compilers";
        this.reward = "1 Learning Chip";
        this.locationName = "Library";

}
	public boolean play(Player p)
	{
		return true;
		
	}
}
