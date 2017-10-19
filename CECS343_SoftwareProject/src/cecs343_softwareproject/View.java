/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author winn
 */
package cecs343_softwareproject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;

import javax.swing.event.ListSelectionEvent;


import cecs343_softwareproject.Controller.MyJButton;

public class View {

    private JFrame frame;

    //Gameboard Panel
    private JPanel imagePanel;
    private ImageIcon gameBoard;
    private JLabel imageLabel;

    //Controls Panel
    public JPanel controlPanel;
    
    private JPanel buttonPanel;
    private MyJButton moveButton;
    public JButton drawButton;
    public JButton playButton;
    public JList roomsList;
    public DefaultListModel listModel;

    public JPanel textPanel;
    
    public JTextArea textArea;
    public JTextArea cardArea;
    
    private JScrollPane mapScroller;

    public JScrollPane textScroller;
    private JScrollPane roomListScroller;

    public View(Controller appController) {
        //Gameboard Components
        gameBoard = new ImageIcon("CSULBMap5_1200x1437.png");
        imageLabel = new JLabel("", gameBoard, JLabel.CENTER);
        imagePanel = new JPanel(new BorderLayout());

        mapScroller = new JScrollPane(imagePanel);

        //Controls Components
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < appController.appModel.createListOfRooms().length; i++) {
            listModel.addElement(appController.appModel.createListOfRooms()[i]);
        }
        roomsList = new JList(listModel);
        roomsList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        roomsList.setLayoutOrientation(JList.VERTICAL);
        roomsList.setVisibleRowCount(5);

        
        
        roomListScroller = new JScrollPane(roomsList);

        cardArea = new JTextArea(5,30);
        
        textArea = new JTextArea(5,30);
        textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textArea.setWrapStyleWord(true);
        textScroller = new JScrollPane(textArea);
        
        
        controlPanel = new JPanel();
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        moveButton = appController.new MyJButton("Move");
        drawButton = new JButton("Draw Card");
        playButton = new JButton("Play Card");
        
        drawButton.setEnabled(false);
        playButton.setEnabled(false);
        
        frame = new JFrame();

    }

    void displayUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);

        //imagePanel.setPreferredSize(new Dimension(1200, 949));
        roomListScroller.setPreferredSize(new Dimension(120, 90));

        imagePanel.add(imageLabel, BorderLayout.NORTH);

        textPanel.add(cardArea);
        textPanel.add(textScroller);
        
        buttonPanel.add(drawButton);
        buttonPanel.add(moveButton);
        buttonPanel.add(playButton);
        buttonPanel.add(roomListScroller);
        controlPanel.add(buttonPanel);
        controlPanel.add(textPanel);

        frame.add(controlPanel, BorderLayout.SOUTH);
  
        //Only need to add the scrollpanel because the image panel is added to the scroll panel
        //Scrollpanel automatically scales the image according to the preferred size
        frame.add(mapScroller);
        frame.setVisible(true);
    }


}
