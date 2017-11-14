/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecs343_softwareproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author scuba
 */
public class CardDeck {

    int deckSize = 40;
    ArrayList<Card> deck = new ArrayList();
    ArrayList<Card> discardDeck = new ArrayList();

    public void createDeck() {
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

    }

    public void discard(Card c) {
        this.discardDeck.add(c);
    }

    public Card dealCard() {
        if (this.deck.isEmpty()) {
            this.deck.addAll(this.discardDeck);
            this.discardDeck.removeAll(this.discardDeck);
            System.out.println("Shuffling..");
        }
        //Removes top card after dealt;
        return this.deck.remove(0);

    }

    public void removeCards() {
    }

    public int getDeckSize() {
        return deckSize;
    }
}
