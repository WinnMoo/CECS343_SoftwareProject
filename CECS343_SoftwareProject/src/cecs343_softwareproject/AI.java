/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecs343_softwareproject;

import java.util.Random;

/**
 *
 * @author Winn
 */
public class AI {

    Controller appController;
    public Random rand;

    AI(Controller controller) {
        appController = controller;
        rand = new Random(System.currentTimeMillis());
    }

    public void handleAIDraw() {
        for (int i = 1; i < appController.appModel.listOfPlayers.length; i++) {
            appController.numOfCardsInDeck--;
            if (appController.numOfCardsInDeck == 0) {
                appController.appModel.gameDeck = appController.appModel.constructDeck();
            } else {
                Card tempCard = appController.appModel.gameDeck.get(appController.appModel.gameDeck.size() - 1);
                appController.appModel.gameDeck.remove(appController.appModel.gameDeck.size() - 1);
                appController.appModel.listOfPlayers[i].hand.add(tempCard);
            }
        }
    }

    public void handleAIMove() {
        for (int i = 1; i < appController.appModel.listOfPlayers.length; i++) {

            int numberOfRoomsToChooseFrom = appController.appModel.listOfPlayers[i].room.numOfRooms;

            int n = rand.nextInt(numberOfRoomsToChooseFrom);

            Object newRoomThatWasChosenObject = appController.appModel.listOfPlayers[i].room.listOfRooms.get(n);
            String newRoomThatWasChosenString = newRoomThatWasChosenObject.toString();

            appController.updatePlayerRoom(newRoomThatWasChosenString, appController.appModel.listOfPlayers[i]);
        }
        System.out.println(appController.appModel.listOfPlayers[1].name + " is in " + appController.appModel.listOfPlayers[1].room.getNameRoom());
        System.out.println(appController.appModel.listOfPlayers[2].name + " is in " + appController.appModel.listOfPlayers[2].room.getNameRoom());
        appController.updateTokens();
    }

    public void handleAIPlay() {
        for (int i = 1; i < appController.appModel.listOfPlayers.length; i++) {
            appController.numDiscarded++;
            if (appController.appModel.listOfPlayers[i].hand.get(0).play(appController.appModel.listOfPlayers[i])) {
                appController.appView.textArea.append(appController.appModel.listOfPlayers[i].name
                        + " has played "
                        + appController.appModel.listOfPlayers[i].hand.get(appController.appView.currentCardNumber).name
                        + " for " + appController.appModel.listOfPlayers[i].hand.get(appController.appView.currentCardNumber).getReward() + "\n");
            } else {
                appController.appView.textArea.append(appController.appModel.listOfPlayers[i].name + " has failed this card." + "\n");
            }
            appController.appModel.listOfPlayers[i].hand.remove(0);
        }
    }

}
