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
    
    ArrayList<Card> hand = new ArrayList();

    public Player(String givenName, Room givenRoom, int playerNumber) {
        name = givenName;
        room = givenRoom;
        orderNumber = playerNumber;
        positionX = 50;
        positionY = 50;
        
        learning = 6;
        craft = 7;
        integrityChip = 8;
        qualityPoints = 9;
        
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

    public void setCoords(int x, int y) {
        positionX = x;
        positionY = y;
    }
    
    public void addCard(){
        
    }
    
    public void removeCard(){
        
    }

}
