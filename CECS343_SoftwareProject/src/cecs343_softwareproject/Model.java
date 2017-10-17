
package cecs343_softwareproject;

import java.awt.List;
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
public class Model {

    private Controller appController;
    //Create all the rooms on the board
    ArrayList<Player> players = new ArrayList();
    ArrayList<Room> rooms = new ArrayList();
    Room ECS308 = new Room("ECS308");
    Room SouthHall = new Room("South Hall");
    Room Lact = new Room("Lactation Lounge");
    Room Elevators = new Room("Elevators");
    Room RoomOfRetirement = new Room("Room of Retirement");
    Room NorthHall = new Room("North Hall");
    Room ComputerLab = new Room("Computer Lab");
    Room ECS302 = new Room("ECS302");
    Room EatClub = new Room("Eat Club");
    Room ConfRoom = new Room("CECS Conference Room");
    Room StdtPark = new Room("Student Parking");
    Room ForbPark = new Room("Forbidden Parking");
    Room RecCenter = new Room("Rec Center");
    Room JPNGarden = new Room("Japanese Garden");
    Room GAField = new Room("George Allen Field");
    Room WestWalkway = new Room("West Walkway");
    Room EastWalkway = new Room("East Walkway");
    Room BratwurstHall = new Room("Bratwurst Hall");
    Room LA5 = new Room("LA 5");
    Room Library = new Room("Library");
    Room WalterPyramid = new Room("Walter Pyramid");

    //Create the players for the game
    Player John = new Player("John", ECS308, 1);
    Player Rebecca = new Player("Rebecca", ECS308, 2);
    Player Charles = new Player("Charles", ECS308, 3);

    Player[] listOfPlayers = {John, Rebecca, Charles};

    public Model(Controller appController) {
        this.appController = appController;

        constructRooms();

    }

    /*
    Method to create rooms, used to clean up model constructor
     */
    public void constructRooms() {
        ECS308.addRoom("South Hall");

        SouthHall.addRoom("ECS308");
        SouthHall.addRoom("Lactation Lounge");
        SouthHall.addRoom("East Walkway");
        SouthHall.addRoom("CECS Conference Room");
        SouthHall.addRoom("Eat Club");
        SouthHall.addRoom("ECS302");
        SouthHall.addRoom("North Hall");

        Lact.addRoom("South Hall");

        Elevators.addRoom("North Hall");
        Elevators.addRoom("LA 5");

        RoomOfRetirement.addRoom("North Hall");

        NorthHall.addRoom("Computer Lab");
        NorthHall.addRoom("ECS302");
        NorthHall.addRoom("West Walkway");
        NorthHall.addRoom("Elevators");
        NorthHall.addRoom("Room of Retirement");

        ComputerLab.addRoom("North Hall");

        ECS302.addRoom("North Hall");
        ECS302.addRoom("South Hall");

        EatClub.addRoom("South Hall");

        ConfRoom.addRoom("South Hall");

        StdtPark.addRoom("Japanese Garden");
        StdtPark.addRoom("Walter Pyramid");
        StdtPark.addRoom("Rec Center");
        StdtPark.addRoom("Forbidden Parking");

        ForbPark.addRoom("Student Parking");
        ForbPark.addRoom("Rec Center");
        ForbPark.addRoom("East Walkway");

        RecCenter.addRoom("Forbidden Parking");
        RecCenter.addRoom("Walter Pyramid");
        RecCenter.addRoom("West Walkway");

        JPNGarden.addRoom("Student Parking");
        JPNGarden.addRoom("Walter Pyramid");
        JPNGarden.addRoom("George Allen Field");

        GAField.addRoom("Japanese Garden");
        GAField.addRoom("Walter Pyramid");
        GAField.addRoom("Rec Center");
        GAField.addRoom("West Walkway");

        WestWalkway.addRoom("George Allen Field");
        WestWalkway.addRoom("Rec Center");
        WestWalkway.addRoom("North Hall");
        WestWalkway.addRoom("Library");

        EastWalkway.addRoom("Forbidden Parking");
        EastWalkway.addRoom("South Hall");
        EastWalkway.addRoom("Bratwurst Hall");

        BratwurstHall.addRoom("East Walkway");
        BratwurstHall.addRoom("LA 5");

        LA5.addRoom("Elevators");
        LA5.addRoom("Bratwurst Hall");
        LA5.addRoom("Library");

        Library.addRoom("LA 5");
        Library.addRoom("West Walkway");

        WalterPyramid.addRoom("Student Parking");
        WalterPyramid.addRoom("Japanese Garden");
        WalterPyramid.addRoom("George Allen Field");
        WalterPyramid.addRoom("Rec Center");
    }

    
    /*
    Method used for updating the JList that displays the list of available rooms that the player can go in
    */
    public Object[] createListOfRooms() {
        Room tempRoom = John.getRoom();
        String stringTempRoom = tempRoom.getNameRoom();

        Object emptyList[] = {"Room doesn't have connected rooms"};

        if (stringTempRoom.equals("ECS308")) {
            Object results[] = ECS308.getConnectedRooms().toArray(new String[ECS308.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("South Hall")) {
            Object results[] = SouthHall.getConnectedRooms().toArray(new String[SouthHall.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Lactation Lounge")) {
            Object results[] = Lact.getConnectedRooms().toArray(new String[Lact.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Elevators")) {
            Object results[] = Elevators.getConnectedRooms().toArray(new String[Elevators.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Room of Retirement")) {
            Object results[] = RoomOfRetirement.getConnectedRooms().toArray(new String[RoomOfRetirement.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("North Hall")) {
            Object results[] = NorthHall.getConnectedRooms().toArray(new String[NorthHall.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Computer Lab")) {
            Object results[] = ComputerLab.getConnectedRooms().toArray(new String[ComputerLab.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("ECS302")) {
            Object results[] = ECS302.getConnectedRooms().toArray(new String[ECS302.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Eat Club")) {
            Object results[] = EatClub.getConnectedRooms().toArray(new String[EatClub.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("CECS Conference Room")) {
            Object results[] = ConfRoom.getConnectedRooms().toArray(new String[ConfRoom.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Student Parking")) {
            Object results[] = StdtPark.getConnectedRooms().toArray(new String[StdtPark.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Forbidden Parking")) {
            Object results[] = ForbPark.getConnectedRooms().toArray(new String[ForbPark.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Rec Center")) {
            Object results[] = RecCenter.getConnectedRooms().toArray(new String[RecCenter.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Japanese Garden")) {
            Object results[] = JPNGarden.getConnectedRooms().toArray(new String[JPNGarden.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("George Allen Field")) {
            Object results[] = GAField.getConnectedRooms().toArray(new String[GAField.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("West Walkway")) {
            Object results[] = WestWalkway.getConnectedRooms().toArray(new String[WestWalkway.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("East Walkway")) {
            Object results[] = EastWalkway.getConnectedRooms().toArray(new String[EastWalkway.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Bratwurst Hall")) {
            Object results[] = BratwurstHall.getConnectedRooms().toArray(new String[BratwurstHall.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("LA 5")) {
            Object results[] = LA5.getConnectedRooms().toArray(new String[LA5.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Library")) {
            Object results[] = Library.getConnectedRooms().toArray(new String[Library.getConnectedRooms().size()]);
            return results;
        } else if (stringTempRoom.equals("Walter Pyramid")) {
            Object results[] = WalterPyramid.getConnectedRooms().toArray(new String[WalterPyramid.getConnectedRooms().size()]);
            return results;
        }

        return emptyList;
    }



}
