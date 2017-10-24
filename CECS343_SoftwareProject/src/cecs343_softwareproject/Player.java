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

public class Player {
    String name;
    Room room;
    int roomNum;
    
    int orderNumber;
    
    int positionX;
    int positionY;
    
    public Player(String givenName, Room givenRoom, int playerNumber){
        name = givenName; 
        room = givenRoom;
        orderNumber = playerNumber;
        positionX = 50;
        positionY = 50;
    }
    
    
    public String getName(){
        return name;
    }
    public Room getRoom(){
        return room;
    }
    public int getPositionX(){
        return positionX;
    }
    public int getPositionY(){
        return positionY;
    }
    
    public void setRoom(Room newRoom){
        room = newRoom;
    }
    public void setCoords(int x, int y )
    {
    	  positionX = x;
    	  positionY  = y;
    }
 
    
    
}
