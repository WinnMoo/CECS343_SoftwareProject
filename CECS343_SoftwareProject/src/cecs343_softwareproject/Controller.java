package cecs343_softwareproject;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

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

    public AI gameAI;
    static Model model;
    public Model appModel;
    public View appView;
    public Random rand;
    int numOfCardsInDeck;
    int numDiscarded;
    discardDialog dscdDlg;

    public Controller() {
        appModel = new Model(this);
        appView = new View(this);
        gameAI = new AI(this);
        rand = new Random(System.currentTimeMillis());
        numOfCardsInDeck = appModel.gameDeck.size();
        numDiscarded = 0;

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

        appView.token1.setBounds(appModel.listOfPlayers[0].room.getRoomPositionX(),
                appModel.listOfPlayers[0].room.getRoomPositionY(), 100, 50);
        appView.token2.setBounds(appModel.listOfPlayers[1].room.getRoomPositionX(),
                appModel.listOfPlayers[1].room.getRoomPositionY() + 25, 100, 50);
        appView.token3.setBounds(appModel.listOfPlayers[2].room.getRoomPositionX(),
                appModel.listOfPlayers[2].room.getRoomPositionY() - 25, 100, 50);

    }

    public void updateCard() {

        //update card in panel
        appModel.listOfPlayers[0].hand.remove(0);
        String nameOfFile = appModel.listOfPlayers[0].hand.get(0).fileName;
        this.appView.cardLabel.setIcon(new ImageIcon(nameOfFile));
        //if clicked

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
                    Object checkerElement = appView.roomsList.getSelectedValue();
                    String checkerString = checkerElement.toString();
                    if (checkerString.equals("")) {

                    } else {
                        System.out.println(moveCounter);
                        moveCounter++;
                        if (moveCounter == 3) {
                            moveCounter = 0;
                            appView.moveButton.setEnabled(false);
                        } else {

                            Object element = appView.roomsList.getSelectedValue();

                            String convertedString = element.toString();
                            updatePlayerRoom(convertedString, appModel.John);

                            updateTextArea();

                            // update jlist
                            updateJList();
                            // update tokens
                            updateTokens();

                        }
                    }

                } else if (e.getActionCommand().equals("Draw Card")) {
                    //Code to draw card
                    numOfCardsInDeck--;
                    numDiscarded++;
                    if (numOfCardsInDeck == 0) {
                        appModel.gameDeck = appModel.constructDeck();
                    } else {
                        Card tempCard = appModel.gameDeck.get(appModel.gameDeck.size() - 1);
                        appModel.gameDeck.remove(appModel.gameDeck.size() - 1);
                        appModel.listOfPlayers[0].hand.add(tempCard);

                        //Code to enable play button
                        appView.playCardButton.setEnabled(true);
                        appView.drawCardButton.setEnabled(false);

                        updateTextArea();
                    }
                } else if (e.getActionCommand().equals("Play Card")) {
                    //code to play card
                    //card0
                    if(appModel.listOfPlayers[0].hand.get(0).play(appModel.listOfPlayers[0])){
                        
                    }
                    
                    
                    
                    
                    //code to disable play card button
                    appView.playCardButton.setEnabled(false);
                    appView.drawCardButton.setEnabled(true);
                    appView.moveButton.setEnabled(true);

                    //update card in panel
                    System.out.println(appModel.listOfPlayers[0].hand.get(0).fileName);
                    updateCard();
                    appView.textArea.setText(appModel.listOfPlayers[0].name + " has played " + appModel.listOfPlayers[0].hand.get(0).getName() + "' for " + appModel.listOfPlayers[0].hand.get(0).getReward());
                    
                    appModel.listOfPlayers[0].hand.remove(0);
                    
                    if (appModel.listOfPlayers[0].hand.get(0).fileName == null) {
                        System.out.println("The null card is" + appModel.listOfPlayers[0].hand.get(0).name);
                    }
                    //After player has played a card, indicates end of turn and start of AI
                    gameAI.handleAIDraw();
                    gameAI.handleAIMove();
                    gameAI.handleAIPlay();
                }
            }

            private void createComponents() {
                ActionListener listener = new ClickListener();
                addActionListener(listener);
            }
        }
    }

    public void discardCard() {
        ArrayList<Card> handBeforeDiscard = new ArrayList();
        handBeforeDiscard = appModel.listOfPlayers[0].hand;
        dscdDlg = new discardDialog(appView.frame, true, handBeforeDiscard);
        dscdDlg.setVisible(true);

    }

    public void selectSkillChip() {

    }

    public static Model getModel() {
        return model;
    }

    public void updateTextArea() {
        String a = "\tLearning\tCraft\tIntegrity\tQuality Points";
        String b = appModel.listOfPlayers[0].name + "\t" + Integer.toString(appModel.listOfPlayers[0].learning)
                + "\t" + Integer.toString(appModel.listOfPlayers[0].craft)
                + "\t" + Integer.toString(appModel.listOfPlayers[0].integrityChip)
                + "\t" + Integer.toString(appModel.listOfPlayers[0].qualityPoints)
                + "\t";
        String c = appModel.listOfPlayers[1].name + "\t" + Integer.toString(appModel.listOfPlayers[1].learning)
                + "\t" + Integer.toString(appModel.listOfPlayers[1].craft)
                + "\t" + Integer.toString(appModel.listOfPlayers[1].integrityChip)
                + "\t" + Integer.toString(appModel.listOfPlayers[1].qualityPoints)
                + "\t";
        String d = appModel.listOfPlayers[2].name + "\t" + Integer.toString(appModel.listOfPlayers[2].learning)
                + "\t" + Integer.toString(appModel.listOfPlayers[2].craft)
                + "\t" + Integer.toString(appModel.listOfPlayers[2].integrityChip)
                + "\t" + Integer.toString(appModel.listOfPlayers[2].qualityPoints)
                + "\t";

        String r = appModel.listOfPlayers[0].name + " is now in " + appModel.listOfPlayers[0].room.getNameRoom();
        String t = "Cards in deck " + numOfCardsInDeck;
        String x = "Cards discarded " + numDiscarded;
        String z = a + "\n" + b + "\n" + c + "\n" + d + "\n" + r + "\n" + t + "\n" + x;
        appView.jTextArea.setText(z);
    }
}
