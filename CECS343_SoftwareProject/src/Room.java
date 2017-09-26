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
    String northRoom;
    String eastRoom;
    String southRoom;
    String westRoom;
    
    public Room(String givenName, String north, String east, String south, String west){
        this.name = givenName;
        this.northRoom = north;
        this.eastRoom = east;
        this.southRoom = south;
        this.westRoom = west;
    }
    
    public String getName(){
        return name;
    }
    
    public String getNorth(){
        return northRoom;
    }
    
    public String getEast(){
        return eastRoom;
    }
    
    public String getSouth(){
        return southRoom;
    }
    
    public String getWest(){
        return westRoom;
    }
}

