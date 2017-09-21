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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class View {
    private JFrame frame;
    private JPanel panel;
    private JButton moveButton;
    private JTextArea dateDisplay;
    private JList roomsList;
    private int FRAME_WIDTH;
    private int FRAME_HEIGHT;
    
  
    
    
    public View(Controller appController){
        frame = new JFrame();
        panel = new JPanel();
        moveButton = new JButton("Move");
        moveButton.addActionListener(new mouseListener());
        
        dateDisplay = new JTextArea();
        dateDisplay.setSize(700,300);
        FRAME_WIDTH = 800;
        FRAME_HEIGHT = 600;
        
    }

    void displayUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        panel.add(moveButton);
        panel.add(dateDisplay);
        frame.add(panel);
        frame.setVisible(true);
    }
    
    
    
    class mouseListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("User Clicked Move");
        }
    
}
}
