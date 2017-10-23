
package cecs343_softwareproject;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author winn
 */
public class Room {
    String name;
    int roomPositionX;
    int roomPositionY;
    ArrayList listOfRooms = new ArrayList();
    int numOfRooms = 0;
    int y;
 
    
    public Room(String givenName, int xCoord, int yCoord){
        name = givenName;
        roomPositionX = xCoord;
        roomPositionY = yCoord;
        
    }
    
    public String getNameRoom(){
        return name;
    }
    public void addRoom(String roomToAdd){
        listOfRooms.add(roomToAdd);
        numOfRooms++;
    }
    
    public ArrayList getConnectedRooms(){
        return listOfRooms;
    }
    
    public int getNumOfRooms(){
        return numOfRooms;
    }
    
    public int getRoomPositionX(){
        return roomPositionX;
    }
    public int getRoomPositionY(){
        return roomPositionY;
    }
    
}

