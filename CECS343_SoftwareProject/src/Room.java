
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
    ArrayList listOfRooms = new ArrayList();
    
    public Room(String givenName){
        name = givenName;
        
    }
    public void addRoom(String roomToAdd){
        listOfRooms.add(roomToAdd);
    }
    
}

