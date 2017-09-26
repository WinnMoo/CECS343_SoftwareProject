/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author winn
 */
public class Player {
    String name;
    String room;
    int positionX;
    int positionY;
    
    public Player(String givenName, String givenRoom){
        name = givenName; 
        room = givenRoom;
        positionX = 50;
        positionY = 50;
    }
    
    
    public String getName(){
        return name;
    }
    public String getRoom(){
        return room;
    }
    public int getPositionX(){
        return positionX;
    }
    public int getPositionY(){
        return positionY;
    }
    
    public void setRoom(String newRoom){
        room = newRoom;
    }
    public void setPositionX(int newPositionX){
        positionX = newPositionX;
    }
    public void setPositionY(int newPositionY){
        positionY = newPositionY;
    }
    
    
}
