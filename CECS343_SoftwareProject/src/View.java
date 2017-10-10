/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author winn
 */


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class View {
    private JFrame frame;
    
    //Gameboard Panel
    private JPanel imagePanel;
    private ImageIcon gameBoard;
    private JLabel imageLabel;
    
    //Controls Panel
    private JPanel buttonPanel;
    private JButton moveButton;
    private JList roomsList;
    
    
    
    
    private JScrollPane mapScroller;
    
    private JScrollPane roomListScroller;
    
    
    public View(Controller appController){
        //Gameboard Components
        gameBoard = new ImageIcon("CSULBMap5_1200x1437.png");
        imageLabel = new JLabel("", gameBoard, JLabel.CENTER);
        imagePanel = new JPanel(new BorderLayout());
        
        mapScroller = new JScrollPane(imagePanel);
        
        //Controls Components
        buttonPanel = new JPanel();
        moveButton = new JButton("Move");
        moveButton.addActionListener(new mouseListener());
        
        roomsList = new JList(appController.appModel.listOfPlayers);
        roomsList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        roomsList.setLayoutOrientation(JList.VERTICAL);
        roomsList.setVisibleRowCount(5);
        roomListScroller = new JScrollPane(roomsList);
        
        
        
        frame = new JFrame();

    }

    void displayUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);
    
        //imagePanel.setPreferredSize(new Dimension(1200, 949));
        roomListScroller.setPreferredSize(new Dimension(250, 80));
        
       
        imagePanel.add(imageLabel, BorderLayout.NORTH);
        
           
        buttonPanel.add(moveButton);
        buttonPanel.add(roomListScroller);
       
        frame.add(buttonPanel, BorderLayout.SOUTH);
        //Only need to add the scrollpanel because the image panel is added to the scroll panel
        //Scrollpanel automatically scales the image according to the preferred size
        frame.add(mapScroller);
        frame.setVisible(true);
    }
    
    
    
    class mouseListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("User Clicked Move");
        }
    
}
}
