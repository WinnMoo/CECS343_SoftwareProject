/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecs343_softwareproject;

/**
 *
 * @author Winn
 */
public class Card14 extends Card {

    public Card14() {
        this.name = "The Big Game";
        this.reward = "1 Craft Chip and Teleport to Lactation Lounge";
        this.location.add("Walter Pyramid");
        this.fileName = ("Card14.png");
        setImage("Card14.png");
    }

    @Override
    public boolean play(Player p) {
        System.out.println("===========================");
        System.out.println("Player is in " + p.room.getNameRoom());
        if (p.room.getNameRoom().equals("Walter Pyramid")) {
            p.incCraft();
            System.out.println("Incrementing Craft");
            p.setRoomName("Lactation Lounge");
            System.out.println("Teleporting player to Lactation Lounge");
            System.out.println("===========================");
            return true;
        }
        System.out.println("User has failed to play " + name);
        System.out.println("===========================");
        return false;
    }
}
