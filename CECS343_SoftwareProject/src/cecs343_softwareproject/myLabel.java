package cecs343_softwareproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class myLabel
  extends JLabel
{
  static View m;
  static Model model;
  
  public myLabel(ImageIcon i)
  {
    super(i);
    model = Controller.getModel();
  }
  
  public void paintComponent(Graphics g)
  {
    Graphics2D g2d = (Graphics2D)g;
    super.paintComponent(g2d);
    g2d.setColor(Color.RED);
    g2d.setFont(new Font("Monospaced", 1, 40));
    
    g2d.drawString(model.listOfPlayers[0].getName(), getRoomX(0), getRoomY(0));
    g2d.drawString(model.listOfPlayers[1].getName(), getRoomX(1), getRoomY(1));
    g2d.drawString(model.listOfPlayers[2].getName(), getRoomX(2), getRoomY(2));
  }
  
  private int getRoomX(int i)
  {
    int room = model.listOfPlayers[i].roomNum;
    return ((Room)model.rooms.get(room)).roomPositionX;
  }
  
  private int getRoomY(int i)
  {
    int room = model.listOfPlayers[i].roomNum;
    return ((Room)model.rooms.get(room)).roomPositionY + i * 40 + 40;
  }
}
