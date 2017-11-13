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
    
    public Player(int l, int c, int i, int q, String n)
    {
    	this.learning = l;
    	this.craft = c;
    	this.integrityChip= i;
    	this.qualityPoints = q;
    	this.name = n;
    }
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
    public void dealCard(Card c)
    {
    	this.hand.add(c);
    }
    public void addCard(){
        
    }
    
    public void removeCard(){
        
    }
    public int getLearning()
    {
      return this.learning;
    }
    
    public void incLearning()
    {
      this.learning += 1;
    }
    
    public int getCraft()
    {
      return this.craft;
    }
    
    public void incCraft()
    {
      this.craft += 1;
    }
    
    public int getIntegrity()
    {
      return this.integrityChip;
    }
    
    public void incIntegrity()
    {
      this.integrityChip += 1;
    }
    
    
    public int getQP()
    {
      return this.qualityPoints;
    }
    
    public void setQP(int p)
    {
      if (this.qualityPoints + p < 0) {
        return;
      }
      this.qualityPoints += p;
    }

}
