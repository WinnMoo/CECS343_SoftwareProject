/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecs343_softwareproject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author scuba
 */
class CardDialog extends JDialog {

    JPanel cardsButtonPanel = new JPanel();
    JButton cardDiscardButton;

    String selectedCard = "";

    int currentCardNumber;
    String fName;
    protected ImageIcon card1;
    protected JLabel cardLabel;

    public CardDialog(final Player p) {
        currentCardNumber = 0;

        fName = p.hand.get(0).fileName;
        card1 = new ImageIcon(fName);
        cardLabel = new JLabel("", card1, JLabel.CENTER);

        cardLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                System.out.println("The number of cards in hand while clicking is: " + p.hand.size());
                currentCardNumber++;
                if (currentCardNumber == p.hand.size()) {
                    currentCardNumber = 0;
                }
                cardLabel.setIcon(new ImageIcon(p.hand.get(currentCardNumber).getImage()));
            }
        });

        cardDiscardButton = new JButton("Discard this card");
        cardDiscardButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Discarding " + "'" + selectedCard + "'");
                p.hand.remove(currentCardNumber);
                dispose();
            }
        });

        this.cardsButtonPanel.setLayout(new BorderLayout());
        cardsButtonPanel.add(cardDiscardButton, BorderLayout.SOUTH);
        cardsButtonPanel.add(cardLabel, BorderLayout.NORTH);
        
        setSize(new Dimension(200, 400));
        cardsButtonPanel.setSize(new Dimension(200, 400));

        add(cardsButtonPanel);
        setVisible(true);
    }

}
