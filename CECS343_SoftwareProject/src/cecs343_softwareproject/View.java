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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import cecs343_softwareproject.Controller.MyJButton;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class View extends javax.swing.JPanel {

    private JFrame frame;

    //Gameboard Panel
    public JPanel imagePanel;
    private ImageIcon gameBoard;
    private JLabel imageLabel;
    public JLabel token1;
    public JLabel token2;
    public JLabel token3;
    private JLabel token4;
    //Controls Panel
    private JPanel buttonPanel;
    private MyJButton moveButton;
    public JList roomsList;
    public DefaultListModel listModel;
    public Model appModel;
    private Room listOfRooms;

 

    private JScrollPane mapScroller;

    private JScrollPane roomListScroller;

    public View(Controller appController) {
        //Gameboard Components
        gameBoard = new ImageIcon("CSULBMap5_1200x1437.png");
        imageLabel = new JLabel("", gameBoard, JLabel.CENTER);
        imagePanel = new JPanel(new BorderLayout());

        mapScroller = new JScrollPane(imagePanel);
        

         imageLabel.setLayout(null);
         
         token1 = new JLabel("John");
         
         token1.setFont(token1.getFont().deriveFont(Font.BOLD, 20));
         token1.setForeground(Color.RED);
         token1.setBounds(appController.appModel.listOfPlayers[0].room.getRoomPositionX(),appController.appModel.listOfPlayers[0].room.getRoomPositionY(), 100, 50);

         
         token2 = new JLabel("Rebecca");
         token2.setFont(token2.getFont().deriveFont(Font.BOLD, 20));
         token2.setForeground(Color.RED);
         token2.setBounds(appController.appModel.listOfPlayers[1].room.getRoomPositionX(),appController.appModel.listOfPlayers[1].room.getRoomPositionY()+25, 100, 50);

       
         
         token3 = new JLabel("Charles");
         token3.setFont(token3.getFont().deriveFont(Font.BOLD, 20));
         token3.setForeground(Color.RED);
         token3.setBounds(appController.appModel.listOfPlayers[2].room.getRoomPositionX(),appController.appModel.listOfPlayers[2].room.getRoomPositionY()-25, 100, 50);
         
         
         
         token4 = new JLabel("Jamal");
         token4.setFont(token4.getFont().deriveFont(Font.BOLD, 24));
         token4.setForeground(Color.RED);
         token4.setBounds(1400,800, 100, 50);

         imagePanel.add(token1);
         imagePanel.add(token2);
         imagePanel.add(token3);
         imagePanel.add(token4);
        
       
        //Controls Components
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

        buttonPanel = new JPanel();
        moveButton = appController.new MyJButton("Move");

        frame = new JFrame();

        
      
    }
       
 

    void displayUI() {
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);

        //imagePanel.setPreferredSize(new Dimension(1200, 949));
        roomListScroller.setPreferredSize(new Dimension(120, 150));

        imagePanel.add(imageLabel, BorderLayout.NORTH);

        buttonPanel.add(roomListScroller);
        buttonPanel.add(moveButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);
        //Only need to add the scrollpanel because the image panel is added to the scroll panel
        //Scrollpanel automatically scales the image according to the preferred size
        frame.add(mapScroller);
        frame.setVisible(true);
    }


}
