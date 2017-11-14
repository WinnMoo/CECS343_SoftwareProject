package cecs343_softwareproject;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

public class Card {

    String name;
    String reward;
    ArrayList<String> location = new ArrayList();
    String prereq;
    String fail;
    Image img;
    String fileName;
    static Model appModel;

    private boolean activeCard;

    public void printName() {
        System.out.println("  Card:" + this.name);
    }

    public void printLocation() {
        for (int i = 0; i < location.size(); i++) {
            System.out.println("  Location:" + this.location.get(i));
        }

    }

    public void printReward() {
        System.out.println("  Reward:" + this.reward);
    }

    public String getName() {
        return name;

    }

    public String getReward() {
        return reward;

    }

    public void setImage(String i) {
        try {
            this.img = ImageIO.read(new File(i));
        } catch (IOException ex) {
            Logger.getLogger(Card.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Image getImage() {
        return this.img;
    }

    public boolean getActive() {
        return this.activeCard;
    }

    public void setActive(boolean active) {
        this.activeCard = active;
    }
}
