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
import java.awt.Component;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.ArrayList;

public class View extends javax.swing.JPanel {

	private JFrame frame;

	// Gameboard Panel
	public JPanel imagePanel;
	private ImageIcon gameBoard;
	private JLabel imageLabel;
	public JLabel token1;
	public JLabel token2;
	public JLabel token3;
	private JLabel token4;
	// Controls Panel
	private JPanel buttonPanel;
	private MyJButton moveButton;
	public JList roomsList;
	public DefaultListModel listModel;
	public Model appModel;
	private Room listOfRooms;

	private JScrollPane mapScroller;

	private JScrollPane roomListScroller;

	private MyJButton playCardButton;

	private MyJButton drawCardButton;

	private ImageIcon card1;

	private JLabel cardLabel;

	private TextField textField;

	private JPanel leftButtonPanel;

	private JPanel rightButtonPanel;

	private JPanel middleButtonPanel;

	private TextArea textArea;

	public View(Controller appController) {
		// Gameboard Components
		gameBoard = new ImageIcon("CSULBMap5_1200x1437.png");
		card1 = new ImageIcon("card1.png");
		cardLabel = new JLabel("",card1, JLabel.CENTER);
		imageLabel = new JLabel("", gameBoard, JLabel.CENTER);
		imagePanel = new JPanel(new BorderLayout());

		mapScroller = new JScrollPane(imagePanel);

		imageLabel.setLayout(null);

		token1 = new JLabel("John");

		token1.setFont(token1.getFont().deriveFont(Font.BOLD, 20));
		token1.setForeground(Color.RED);
		token1.setBounds(appController.appModel.listOfPlayers[0].room.getRoomPositionX(),
				appController.appModel.listOfPlayers[0].room.getRoomPositionY(), 100, 50);

		token2 = new JLabel("Rebecca");
		token2.setFont(token2.getFont().deriveFont(Font.BOLD, 20));
		token2.setForeground(Color.RED);
		token2.setBounds(appController.appModel.listOfPlayers[1].room.getRoomPositionX(),
				appController.appModel.listOfPlayers[1].room.getRoomPositionY() + 25, 100, 50);

		token3 = new JLabel("Charles");
		token3.setFont(token3.getFont().deriveFont(Font.BOLD, 20));
		token3.setForeground(Color.RED);
		token3.setBounds(appController.appModel.listOfPlayers[2].room.getRoomPositionX(),
				appController.appModel.listOfPlayers[2].room.getRoomPositionY() - 25, 100, 50);

		token4 = new JLabel("Jamal");
		token4.setFont(token4.getFont().deriveFont(Font.BOLD, 24));
		token4.setForeground(Color.RED);
		token4.setBounds(1400, 800, 100, 50);

		imagePanel.add(token1);
		imagePanel.add(token2);
		imagePanel.add(token3);
		imagePanel.add(token4);

		// Controls Components
		mapScroller = new JScrollPane(imagePanel);

		// Controls Components
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
		leftButtonPanel = new JPanel();
		middleButtonPanel= new JPanel();
		rightButtonPanel = new JPanel();
		drawCardButton = appController.new MyJButton("Draw Card");
		moveButton = appController.new MyJButton("Move");
		playCardButton = appController.new MyJButton("Play Card");
		
		
		
		//TextField
		textField = new java.awt.TextField();
		textField.setText("HELLO");

		textArea = new java.awt.TextArea();
		textArea.setText("AMANDA WAS HERE");
		
		frame = new JFrame();

	}

	void displayUI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);

		// imagePanel.setPreferredSize(new Dimension(1200, 949));
		roomListScroller.setPreferredSize(new Dimension(100, 100));
		// roomListScroller.setBounds(100, 1000, 150, 150);;
		imagePanel.add(imageLabel, BorderLayout.NORTH);
		// buttonPanel.setBounds(40,1300,100,60);
		leftButtonPanel.setLayout(new BoxLayout(leftButtonPanel, BoxLayout.Y_AXIS));
		
		leftButtonPanel.add( Box.createVerticalStrut(10));

		drawCardButton.setPreferredSize(new Dimension(150,20));
		drawCardButton.setAlignmentX(Component.LEFT_ALIGNMENT);
		leftButtonPanel.add(drawCardButton);

		leftButtonPanel.add( Box.createVerticalStrut(10));
		moveButton.setPreferredSize(new Dimension(150,20));
		moveButton.setAlignmentX(Component.LEFT_ALIGNMENT);
		leftButtonPanel.add(moveButton);

		leftButtonPanel.add( Box.createVerticalStrut(10));
		playCardButton.setPreferredSize(new Dimension(150,20));
		playCardButton.setAlignmentX(Component.LEFT_ALIGNMENT);
		leftButtonPanel.add(playCardButton);

		leftButtonPanel.add( Box.createVerticalStrut(10));

		
		roomListScroller.setAlignmentX(Component.LEFT_ALIGNMENT);
		leftButtonPanel.add(roomListScroller);
		leftButtonPanel.add( Box.createVerticalStrut(10));

		

//		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		middleButtonPanel.add(cardLabel);
		buttonPanel.add( Box.createVerticalStrut(10));
		rightButtonPanel.setLayout(new BoxLayout(rightButtonPanel, BoxLayout.Y_AXIS));

		rightButtonPanel.add(textField);
		textField.setPreferredSize(new Dimension(2100,300));
		rightButtonPanel.add( Box.createVerticalStrut(10));

		rightButtonPanel.add(textArea);
		textArea.setPreferredSize(new Dimension(1500,100));

		
		
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

		buttonPanel.add(leftButtonPanel);
		leftButtonPanel.setAlignmentX(Component.BOTTOM_ALIGNMENT);

		buttonPanel.add(middleButtonPanel);
		leftButtonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

		buttonPanel.add(rightButtonPanel);
		leftButtonPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);



		frame.add(buttonPanel, BorderLayout.SOUTH);
		// Only need to add the scrollpanel because the image panel is added to
		// the scroll panel
		// Scrollpanel automatically scales the image according to the preferred
		// size
		frame.add(mapScroller);
		frame.setVisible(true);
	}

}
