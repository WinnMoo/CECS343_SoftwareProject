package cecs343_softwareproject;

public class Card26 extends Card{
	public Card26() {
        this.name = "Program Crashes";
        this.reward = "5 Quality Points and Chip of Your Choice";
        this.locationName = "Lactation Lounge";
        this.prereq = "2 Learning";
        this.fail = "Discard 1 Game Card";
}
	public boolean play(Player p)
	{
		return true;
		
	}
}