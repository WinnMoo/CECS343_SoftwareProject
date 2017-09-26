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
    private JPanel imagePanel;
    private JPanel buttonPanel;
    private JButton moveButton;
    private JTextArea dateDisplay;
    private JList roomsList;
    private JScrollPane scrollbar;
    private ImageIcon gameBoard;
    
    


  
    
    
    public View(Controller appController){
        gameBoard = new ImageIcon("CSULBMap5_1200x1437.png");
        frame = new JFrame();
        imagePanel = new JPanel();
        buttonPanel = new JPanel();
        moveButton = new JButton("Move");
        scrollbar = new JScrollPane();
        moveButton.addActionListener(new mouseListener());
        
        
        dateDisplay = new JTextArea();
        dateDisplay.setSize(700,300);
     
        
    }

    void displayUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);
    
       
        JLabel label = new JLabel("", gameBoard, JLabel.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        
        panel.add(label, BorderLayout.NORTH );
        
        panel.add(scrollbar);
        //panel.setPreferredSize(new Dimension(frame.getContentPane().getWidth() * 2/3, frame.getContentPane().getHeight() * 2/3));
        
        buttonPanel.add(moveButton);
        //panel.add(dateDisplay);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
    
    
    
    class mouseListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("User Clicked Move");
        }
    
}
}
