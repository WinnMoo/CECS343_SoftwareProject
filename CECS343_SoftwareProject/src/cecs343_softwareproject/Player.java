/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author winn
 */
package cecs343_softwareproject;

import java.util.ArrayList;

public class Player {

    String name;
    Room room;
    int roomNum;

    int orderNumber;

    int positionX;
    int positionY;

    //Player Stats
    int learning;
    int craft;
    int integrityChip;
    int qualityPoints;

    ArrayList<Room> mapOfSchool = new ArrayList();
    ArrayList<Card> hand = new ArrayList();

    public Player(int l, int c, int i, int q, String n) {
        this.learning = l;
        this.craft = c;
        this.integrityChip = i;
        this.qualityPoints = q;
        this.name = n;
    }

    public Player(String givenName, Room givenRoom, int playerNumber) {
        name = givenName;
        room = givenRoom;
        orderNumber = playerNumber;
        positionX = 50;
        positionY = 50;

        learning = 5;
        craft = 5;
        integrityChip = 5;
        qualityPoints = 5;

    }

    public String getName() {
        return name;
    }

    public Room getRoom() {
        return room;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setRoom(Room newRoom) {
        room = newRoom;
    }

    public void setRoomName(String roomName) {
        for (int i = 0; i < mapOfSchool.size(); i++) {
            if (mapOfSchool.get(i).getNameRoom().equals(roomName)) {
                System.out.println("Player's room is being changed to " + mapOfSchool.get(i).getNameRoom());
                this.room = mapOfSchool.get(i);
            }
        }
    }

    public void setCoords(int x, int y) {
        positionX = x;
        positionY = y;
    }

    public int getLearning() {
        return learning;
    }

    public void incLearning() {
        learning += 1;
    }

    public int getCraft() {
        return craft;
    }

    public void incCraft() {
        craft += 1;
    }

    public int getIntegrity() {
        return integrityChip;
    }

    public void incIntegrity() {
        integrityChip += 1;
    }

    public int getQP() {
        return qualityPoints;
    }

    public void setQP(int p) {
        if (qualityPoints + p < 0) {
            return;
        }
        qualityPoints += p;
    }

}
