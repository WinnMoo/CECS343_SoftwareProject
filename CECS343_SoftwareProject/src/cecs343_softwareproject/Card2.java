package cecs343_softwareproject;

public class Card2 extends Card {

    public Card2() {
        this.name = "Math 122";
        this.reward = "1 Learning Chip, 1 Integrity Chip";
        this.location.add("Library");
        this.fileName = ("Card2.png");
        setImage("Card2.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if ((p.room.getNameRoom().equals("Library"))) {
            if(p.name.equals("John")){
            optionPicker a = new optionPicker(p, true, false, true);
            }
            System.out.println("===========================");
            return true;
        }
        System.out.println("User has failed to play " + name);
        System.out.println("===========================");
        return false;

    }
}
