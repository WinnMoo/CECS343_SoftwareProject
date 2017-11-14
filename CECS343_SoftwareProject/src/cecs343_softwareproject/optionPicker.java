/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecs343_softwareproject;

import java.awt.Dimension;
import java.awt.Image;
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
public class optionPicker extends JDialog {

    JPanel buttons = new JPanel();
    JButton knowledge;
    JButton honor;
    JButton skill;
    Image image;
    buttonListener a = new buttonListener();
    String selectedA = "";
    AbilityType selectedAbility;

    public optionPicker(boolean b, boolean b0, boolean b1) {
        this.buttons.setLayout(new BoxLayout(this.buttons, 0));
        setSize(new Dimension(920, 240));
        this.buttons.setSize(new Dimension(920, 240));

        this.knowledge = new JButton("Learning");
        this.knowledge.addActionListener(this.a);
        this.knowledge.setEnabled(b);
        this.knowledge.setAlignmentX(0.5F);

        this.honor = new JButton("Integrity");
        this.honor.addActionListener(this.a);
        this.honor.setEnabled(b0);
      
        this.honor.setAlignmentX(0.5F);

        this.skill = new JButton("Craft");
        this.skill.addActionListener(this.a);
        this.skill.setEnabled(b1);
      
        this.skill.setAlignmentX(0.5F);

        this.buttons.add(Box.createRigidArea(new Dimension(50, 0)));
        this.buttons.add(this.knowledge);

        this.buttons.add(Box.createRigidArea(new Dimension(20, 0)));
        this.buttons.add(this.skill);

        this.buttons.add(Box.createRigidArea(new Dimension(20, 0)));
        this.buttons.add(this.honor);

        add(this.buttons);
        setVisible(true);
    }

    private void handleClick() {
        setVisible(false);
    }

    class buttonListener
            implements ActionListener {

        buttonListener() {
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Learning")) {
                optionPicker.this.selectedAbility = AbilityType.LEARNING;
                optionPicker.this.selectedA = "KNOWLEDGE";
            } else if (e.getActionCommand().equals("Integrity")) {
                 optionPicker.this.selectedAbility = AbilityType.INTEGRITY;
                 optionPicker.this.selectedA = "Honor";
            } else if (e.getActionCommand().equals("Craft")) {
                 optionPicker.this.selectedAbility = AbilityType.CRAFT;
                 optionPicker.this.selectedA = "Skill";
            } else {
                 optionPicker.this.selectedAbility = AbilityType.NONE;
            }
             optionPicker.this.handleClick();
        }
    }
}


