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
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class View {
    private JPanel panel;
    private JButton moveButton;
    private JTextArea dateDisplay;
    private ActionListener moveListener;
    private JList roomsList;
    private JFrame frame;
  
    
    
    public View(Controller appController){
        panel = new JPanel();
        moveButton = new JButton("Move");
        //moveButton.addActionListener(new ActionListener());
        panel.add(moveButton);
        
        dateDisplay = new JTextArea();
        dateDisplay.setSize(700,300);
        panel.add(dateDisplay);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        frame.add(panel);
    }
    
    public void displayUI(){
        frame.setVisible(true);
    }
}
