package cecs343_softwareproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author winn
 */
public class Controller {

    static Model model;
    public Model appModel;
    public View appView;
    public Random rand;

    public Controller() {
        appModel = new Model(this);
        appView = new View(this);
        rand = new Random(System.currentTimeMillis());

    }

    public void startApp() {
        appView.displayUI();
    }

    public void updatePlayerRoom(String updatedRoom, Player nameOfPlayer) {
        if (updatedRoom.equals("ECS308")) {
            nameOfPlayer.setRoom(appModel.ECS308);
            appModel.listOfPlayers[0].setCoords(appModel.ECS308.getRoomPositionX(), appModel.ECS308.getRoomPositionY());
        } else if (updatedRoom.equals("South Hall")) {
            nameOfPlayer.setRoom(appModel.SouthHall);
            appModel.listOfPlayers[0].setCoords(appModel.SouthHall.getRoomPositionX(),
                    appModel.SouthHall.getRoomPositionY());

        } else if (updatedRoom.equals("Lactation Lounge")) {
            nameOfPlayer.setRoom(appModel.Lact);
            appModel.listOfPlayers[0].setCoords(appModel.Lact.getRoomPositionX(), appModel.Lact.getRoomPositionY());

        } else if (updatedRoom.equals("Elevators")) {
            nameOfPlayer.setRoom(appModel.Elevators);
        } else if (updatedRoom.equals("Room Of Retirement")) {
            nameOfPlayer.setRoom(appModel.RoomOfRetirement);
        } else if (updatedRoom.equals("North Hall")) {
            nameOfPlayer.setRoom(appModel.NorthHall);
        } else if (updatedRoom.equals("Computer Lab")) {
            nameOfPlayer.setRoom(appModel.ComputerLab);
        } else if (updatedRoom.equals("ECS302")) {
            nameOfPlayer.setRoom(appModel.ECS302);
        } else if (updatedRoom.equals("Eat Club")) {
            nameOfPlayer.setRoom(appModel.EatClub);
        } else if (updatedRoom.equals("CECS Conference Room")) {
            nameOfPlayer.setRoom(appModel.ConfRoom);
        } else if (updatedRoom.equals("Student Parking")) {
            nameOfPlayer.setRoom(appModel.StdtPark);
        } else if (updatedRoom.equals("Forbidden Parking")) {
            nameOfPlayer.setRoom(appModel.ForbPark);
        } else if (updatedRoom.equals("Rec Center")) {
            nameOfPlayer.setRoom(appModel.RecCenter);
        } else if (updatedRoom.equals("Japanese Garden")) {
            nameOfPlayer.setRoom(appModel.JPNGarden);
        } else if (updatedRoom.equals("George Allen Field")) {
            nameOfPlayer.setRoom(appModel.GAField);
        } else if (updatedRoom.equals("West Walkway")) {
            nameOfPlayer.setRoom(appModel.WestWalkway);
        } else if (updatedRoom.equals("East Walkway")) {
            nameOfPlayer.setRoom(appModel.EastWalkway);
        } else if (updatedRoom.equals("Bratwurst Hall")) {
            nameOfPlayer.setRoom(appModel.BratwurstHall);
        } else if (updatedRoom.equals("LA 5")) {
            nameOfPlayer.setRoom(appModel.LA5);
        } else if (updatedRoom.equals("Library")) {
            nameOfPlayer.setRoom(appModel.Library);
        } else if (updatedRoom.equals("Walter Pyramid")) {
            nameOfPlayer.setRoom(appModel.WalterPyramid);
        } else {
            System.out.println("no rooms available");
        }
    }

    public void updateJList() {
        DefaultListModel tempModel = new DefaultListModel();
        for (int i = 0; i < appModel.createListOfRooms().length; i++) {
            tempModel.addElement(appModel.createListOfRooms()[i]);
        }
        appView.roomsList.setModel(tempModel);

    }

    public void updateTokens() {
        System.out.println(appModel.listOfPlayers[0].room.getRoomPositionX() + " "
                + appModel.listOfPlayers[0].room.getRoomPositionY());
        appView.token1.setBounds(appModel.listOfPlayers[0].room.getRoomPositionX(),
                appModel.listOfPlayers[0].room.getRoomPositionY(), 100, 50);
        appView.token2.setBounds(appModel.listOfPlayers[1].room.getRoomPositionX(),
                appModel.listOfPlayers[1].room.getRoomPositionY() + 25, 100, 50);
        appView.token3.setBounds(appModel.listOfPlayers[2].room.getRoomPositionX(),
                appModel.listOfPlayers[2].room.getRoomPositionY() - 25, 100, 50);

    }

    // public void pickRandomRoom(Player p, int d)
    // {
    // int t = 0;
    // while (t < d)
    // {
    // int len =
    // (appModel.listOfPlayers[i].room.listOfRooms.get(p.roomNum)).reachable1.size();
    // int r = (int)(Math.random() * len);
    // int newRoom =
    // ((Integer)((Room)model.rooms.get(p.room)).reachable1.get(r)).intValue();
    // p.setRoom(newRoom);
    //
    // this.view.paintComponent( this.view.getGraphics());
    // try
    // {
    // TimeUnit.SECONDS.sleep(1L);
    // }
    // catch (InterruptedException ex)
    // {
    // Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
    // }
    // t++;
    //
    // }
    // }
    class MyJButton extends JButton {

        //Move counter is used to keep track of how many times a player has moved, once movecounter
        //has reached 2, move counter is reset then the ai is allowed its turn
        int moveCounter = 0;

        public MyJButton(String textToDisplay) {
            this.setText(textToDisplay);
            ClickListener cl = new ClickListener();
            cl.createComponents();
        }

        class ClickListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getActionCommand().equals("Move")) {
                    System.out.println(moveCounter);
                    moveCounter++;
                    
                    
                    if (moveCounter == 3) {
                        moveCounter = 0;
                        appView.moveButton.setEnabled(false);
                    } else {

                        Object element = appView.roomsList.getSelectedValue();

                        String convertedString = element.toString();
                        updatePlayerRoom(convertedString, appModel.John);
                        System.out.println("John is now in "
                                + appModel.John.getRoom().getNameRoom());

                        // update jlist
                        updateJList();
                        // update tokens
                        updateTokens();
                        for (int i = 1; i < appModel.listOfPlayers.length; i++) {

                            int numberOfRoomsToChooseFrom = appModel.listOfPlayers[i].room.numOfRooms;

                            int n = rand.nextInt(numberOfRoomsToChooseFrom);

                            Object newRoomThatWasChosenObject = appModel.listOfPlayers[i].room.listOfRooms.get(n);
                            String newRoomThatWasChosenString = newRoomThatWasChosenObject.toString();

                            updatePlayerRoom(newRoomThatWasChosenString, appModel.listOfPlayers[i]);
                            System.out.println(appModel.listOfPlayers[i].name + " is now in "
                                    + appModel.listOfPlayers[i].room.getNameRoom());
                            System.out.println(appModel.listOfPlayers[i].name + "is now at"
                                    + appModel.listOfPlayers[i].room.getRoomPositionX() + " "
                                    + appModel.listOfPlayers[i].room.getRoomPositionY());
                        }
                    }

                } else if (e.getActionCommand().equals("Draw Card")) {
                    //Code to enable play button
                    appView.playCardButton.setEnabled(true);
                    appView.drawCardButton.setEnabled(false);
                } else if (e.getActionCommand().equals("Play Card")) {
                    //code to play card

                    //code to disable play card button
                    appView.playCardButton.setEnabled(false);
                    appView.drawCardButton.setEnabled(true);
                    appView.moveButton.setEnabled(true);
                }
            }

            private void createComponents() {
                ActionListener listener = new ClickListener();
                addActionListener(listener);
            }
        }
    }

    public static Model getModel() {
        return model;
    }

}
