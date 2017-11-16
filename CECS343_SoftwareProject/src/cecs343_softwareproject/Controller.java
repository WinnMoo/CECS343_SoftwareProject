package cecs343_softwareproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

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
                    moveCounter = handleMove(moveCounter);
                } else if (e.getActionCommand().equals("Draw Card")) {
                    handleDraw();
                    moveCounter = 0;
                } else if (e.getActionCommand().equals("Play Card")) {
                    moveCounter = handlePlay();
                }
            }

            private void createComponents() {
                ActionListener listener = new ClickListener();
                addActionListener(listener);
            }
        }
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

        appView.cardLabel.setIcon(new ImageIcon(appModel.listOfPlayers[0].hand.get(0).getImage()));

        updateTokens();
    }

    public void handleDraw() {
        //Code to draw card
        numOfCardsInDeck--;
        numDiscarded++;
        if (numOfCardsInDeck <= 0) {
            appModel.gameDeck = appModel.constructDeck();
            numOfCardsInDeck = 40;
        } else {
            Card tempCard = appModel.gameDeck.get(appModel.gameDeck.size() - 1);
            appModel.gameDeck.remove(appModel.gameDeck.size() - 1);
            appModel.listOfPlayers[0].hand.add(tempCard);
            System.out.println("The number of cards in hand after playing a card is :" + appModel.listOfPlayers[0].hand.size());
            //Code to enable play button
            appView.playCardButton.setEnabled(true);
            appView.moveButton.setEnabled(true);
            appView.drawCardButton.setEnabled(false);
        }
        
        updateJList();
        updateTextArea();
    }

    public int handleMove(int counter) {
        int moveCounter = counter;
        Object element = appView.roomsList.getSelectedValue();

        if (element == null) {

        } else {
            System.out.println("The amount of moves left are: " + (moveCounter + 1));
            moveCounter++;
            if (moveCounter == 3) {
                moveCounter = 0;
                appView.moveButton.setEnabled(false);
                String convertedString = element.toString();
                updatePlayerRoom(convertedString, appModel.John);

                updateTextArea();

                updateJList();
            } else {

                String convertedString = element.toString();
                updatePlayerRoom(convertedString, appModel.John);

                updateTextArea();

                // update jlist
                updateJList();
            }
        }
        updateTextArea();
        return moveCounter;
    }

    public int handlePlay() {
        if (appModel.listOfPlayers[0].hand.get(appView.currentCardNumber).play(appModel.listOfPlayers[0])) {
            appView.textArea.setText(appModel.listOfPlayers[0].name
                    + " has played "
                    + appModel.listOfPlayers[0].hand.get(appView.currentCardNumber).name
                    + "' for " + appModel.listOfPlayers[0].hand.get(appView.currentCardNumber).getReward());
        } else {
            appView.textArea.setText(appModel.listOfPlayers[0].name + " has failed this card.");
        }

        System.out.println("The card being removed from the hand because it was played is: " 
                + appModel.listOfPlayers[0].hand.get(appView.currentCardNumber).fileName
                + " "
                + appModel.listOfPlayers[0].hand.get(appView.currentCardNumber).name);
        
        
        appModel.listOfPlayers[0].hand.remove(appView.currentCardNumber);

        //code to disable play card button
        appView.playCardButton.setEnabled(false);
        appView.moveButton.setEnabled(false);
        int moveCounter = 0;
        appView.drawCardButton.setEnabled(true);

        System.out.println("John is in: " + appModel.listOfPlayers[0].room.getNameRoom());
        //After player has played a card, indicates end of turn and start of AI
        gameAI.handleAIDraw();
        gameAI.handleAIMove();
        gameAI.handleAIPlay();
        updateJList();
        updateTextArea();
        return moveCounter;
    }
}
