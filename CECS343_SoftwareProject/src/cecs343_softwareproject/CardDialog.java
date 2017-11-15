/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecs343_softwareproject;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author scuba
 */
class CardDialog extends JDialog {

    JPanel cardsButtonPanel = new JPanel();
    JButton firstCard;
    JButton secondCard;
    JButton thirdCard;
    JButton fourthCard;
    JButton fifthCard;

    buttonListener cardListener = new buttonListener();
    String selectedCard = "";

    public CardDialog(Card card1, Card card2, Card card3, Card card4, Card card5) {
        this.cardsButtonPanel.setLayout(new BoxLayout(cardsButtonPanel, 0));
        setSize(new Dimension(920, 300));
        cardsButtonPanel.setSize(new Dimension(920,300));
        
        firstCard = new JButton(card1.name);
        firstCard.addActionListener(cardListener);
        firstCard.setEnabled(true);
        firstCard.setAlignmentX(0.5F);
        
        secondCard = new JButton(card2.name);
        secondCard.addActionListener(cardListener);
        secondCard.setEnabled(true);
        secondCard.setAlignmentX(0.5F);
        
        thirdCard = new JButton(card3.name);
        thirdCard.addActionListener(cardListener);
        thirdCard.setEnabled(true);
        thirdCard.setAlignmentX(0.5F);
        
        fourthCard = new JButton(card4.name);
        fourthCard.addActionListener(cardListener);
        fourthCard.setEnabled(true);
        fourthCard.setAlignmentX(0.5F);
        
        fifthCard = new JButton(card5.name);
        fifthCard.addActionListener(cardListener);
        fifthCard.setEnabled(true);
        fifthCard.setAlignmentX(0.5F);
        
        cardsButtonPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        cardsButtonPanel.add(firstCard);
        cardsButtonPanel.add(secondCard);
        cardsButtonPanel.add(thirdCard);
        cardsButtonPanel.add(fourthCard);
        cardsButtonPanel.add(fifthCard);
        
        
        add(cardsButtonPanel);
        setVisible(true);
    }

    public String getDiscardedCard(){
        System.out.println("Discarding " + "'" + selectedCard + "'");
        return selectedCard;
    }
    
    private void handleClick(){
        setVisible(false);
    }
    
    class buttonListener implements ActionListener {

        buttonListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            selectedCard = e.getActionCommand();
            handleClick();
        }
    }

}
