package cecs343_softwareproject;

public class Card13 extends Card{
	public Card13() {
        this.name = "Physics 151";
        this.reward = "5 Quality Points";
        this.locationName = "ECS 308";
        this.prereq = "3 Craft";
        this.fail = "Lose 3 Quality Points";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}