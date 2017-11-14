package cecs343_softwareproject;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

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
    ArrayList<Card> drawnCards;
    ArrayList<Room> rooms = new ArrayList();
    ArrayList<Card> gameDeck = new ArrayList();
    ArrayList<Card> discardDeck = new ArrayList();
    Room ECS308 = new Room("ECS308", 1100, 1000);
    Room SouthHall = new Room("South Hall", 1150, 850);
    Room Lact = new Room("Lactation Lounge", 1250, 1000);
    Room Elevators = new Room("Elevators", 800, 1000);
    Room RoomOfRetirement = new Room("Room of Retirement", 550, 1000);
    Room NorthHall = new Room("North Hall", 650, 850);
    Room ComputerLab = new Room("Computer Lab", 550, 700);
    Room ECS302 = new Room("ECS302", 850, 700);
    Room EatClub = new Room("Eat Club", 1150, 700);
    Room ConfRoom = new Room("CECS Conference Room", 1250, 700);
    Room StdtPark = new Room("Student Parking", 1250, 200);
    Room ForbPark = new Room("Forbidden Parking", 1250, 500);
    Room RecCenter = new Room("Rec Center", 750, 500);
    Room JPNGarden = new Room("Japanese Garden", 750, 50);
    Room GAField = new Room("George Allen Field", 450, 200);
    Room WestWalkway = new Room("West Walkway", 350, 900);
    Room EastWalkway = new Room("East Walkway", 1450, 850);
    Room BratwurstHall = new Room("Bratwurst Hall", 1250, 1300);
    Room LA5 = new Room("LA 5", 800, 1300);
    Room Library = new Room("Library", 450, 1300);
    Room WalterPyramid = new Room("Walter Pyramid", 750, 250);

    CardDeck deck = new CardDeck();
    Card Card0 = new Card0();
    Card Card1 = new Card1();
    Card Card2 = new Card2();
    Card Card3 = new Card3();
    Card Card4 = new Card4();
    Card Card5 = new Card5();
    Card Card6 = new Card6();
    Card Card7 = new Card7();
    Card Card8 = new Card8();
    Card Card9 = new Card9();
    Card Card10 = new Card10();
    Card Card11 = new Card11();
    Card Card12 = new Card12();
    Card Card13 = new Card13();
    Card Card14 = new Card14();
    Card Card15 = new Card15();
    Card Card16 = new Card16();
    Card Card17 = new Card17();
    Card Card18 = new Card18();
    Card Card19 = new Card19();
    Card Card20 = new Card20();
    Card Card21 = new Card21();
    Card Card22 = new Card22();
    Card Card23 = new Card23();
    Card Card24 = new Card24();
    Card Card25 = new Card25();
    Card Card26 = new Card26();
    Card Card27 = new Card27();
    Card Card28 = new Card28();
    Card Card29 = new Card29();
    Card Card30 = new Card30();
    Card Card31 = new Card31();
    Card Card32 = new Card32();
    Card Card33 = new Card33();
    Card Card34 = new Card34();
    Card Card35 = new Card35();
    Card Card36 = new Card36();
    Card Card37 = new Card37();
    Card Card38 = new Card38();

    //Create the players for the game
    Player John = new Player("John", ECS308, 1);
    Player Rebecca = new Player("Rebecca", ECS308, 2);
    Player Charles = new Player("Charles", ECS308, 3);

    Player[] listOfPlayers = {John, Rebecca, Charles};

    public Model(Controller appController) {
        this.appController = appController;

        constructRooms();
        gameDeck = constructDeck();
        dealCards();
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

    public ArrayList constructDeck() {
        ArrayList<Card> deck = new ArrayList();
        deck.add(Card0);
        deck.add(Card1);
        deck.add(Card2);
        deck.add(Card3);
        deck.add(Card4);
        deck.add(Card5);
        deck.add(Card6);
        deck.add(Card7);
        deck.add(Card8);
        deck.add(Card9);
        deck.add(Card10);
        deck.add(Card11);
        deck.add(Card12);
        deck.add(Card13);
        deck.add(Card14);
        deck.add(Card15);
        deck.add(Card16);
        deck.add(Card17);
        deck.add(Card18);
        deck.add(Card19);
        deck.add(Card20);
        deck.add(Card21);
        deck.add(Card22);
        deck.add(Card23);
        deck.add(Card24);
        deck.add(Card25);
        deck.add(Card26);
        deck.add(Card27);
        deck.add(Card28);
        deck.add(Card29);
        deck.add(Card30);
        deck.add(Card31);
        deck.add(Card32);
        deck.add(Card33);
        deck.add(Card34);
        deck.add(Card35);
        deck.add(Card36);
        deck.add(Card37);
        deck.add(Card38);
        Collections.shuffle(deck);
        return deck;
    }

    public void dealCards() {
        for (int i = 0; i < listOfPlayers.length; i++) {
            drawnCards = new ArrayList();
            for (int j = 0; j < 5; j++) {
                Card tempCard = gameDeck.get(gameDeck.size() - 1);
                gameDeck.remove(gameDeck.size() - 1);
                drawnCards.add(tempCard);

            }
            listOfPlayers[i].hand = drawnCards;
        }
    }

}
