/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author winn
 */
public final class Model {

    private Controller appController;
    //Create all the rooms on the board
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
    Player John = new Player("John", ECS308);
    Player Rebecca = new Player("Rebecca", ECS308);
    Player Charles = new Player("Charles", ECS308);

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

}
