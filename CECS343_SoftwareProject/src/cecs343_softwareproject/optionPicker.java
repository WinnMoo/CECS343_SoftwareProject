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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    String selectedA = "";
    AbilityType selectedAbility;

    public optionPicker(final Player p,boolean b, boolean b0, boolean b1) {
        this.buttons.setLayout(new BoxLayout(this.buttons, 0));
        setSize(new Dimension(920, 240));
        this.buttons.setSize(new Dimension(920, 240));

        this.knowledge = new JButton("Learning");
        this.knowledge.setEnabled(b);
        this.knowledge.setAlignmentX(0.5F);
        this.knowledge.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                p.incLearning();
                System.out.println("Incrementing Learning");
                dispose();
            }
        });

        this.honor = new JButton("Integrity");
        this.honor.setEnabled(b0);
        this.honor.setAlignmentX(0.5F);
        this.honor.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                p.incIntegrity();
                System.out.println("Incrementing Integrity");
                dispose();
            }
        });

        this.skill = new JButton("Craft");
        this.skill.setEnabled(b1);
        this.skill.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                p.incCraft();
                System.out.println("Inrementing Craft");
                dispose();
            }
        });

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

}