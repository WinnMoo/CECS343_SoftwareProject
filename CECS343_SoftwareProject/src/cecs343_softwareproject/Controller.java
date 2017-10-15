package cecs343_softwareproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author winn
 */
public class Controller {
    public Model appModel;
    public View appView;
    
    public Controller(){
        appModel = new Model(this);
        appView = new View(this);

    }
    public void startApp() {
        appView.displayUI();
    }
    
    public void updatePlayerRoom(String updatedRoom){
        if(updatedRoom == "ECS308"){
            appModel.John.setRoom(appModel.ECS308);
        }else if(updatedRoom == "SouthHall"){
            appModel.John.setRoom(appModel.SouthHall);
        }else if(updatedRoom == "Lact"){
            appModel.John.setRoom(appModel.Lact);
        }else if(updatedRoom == "Elevators"){
            appModel.John.setRoom(appModel.Elevators);
        }else if(updatedRoom == "RoomOfRetirement"){
            appModel.John.setRoom(appModel.RoomOfRetirement);
        }else if(updatedRoom == "NorthHall"){
            appModel.John.setRoom(appModel.NorthHall);
        }else if(updatedRoom == "ComputerLab"){
            appModel.John.setRoom(appModel.ComputerLab);
        }else if(updatedRoom == "ECS302"){
            appModel.John.setRoom(appModel.ECS302);
        }else if(updatedRoom == "EatClub"){
            appModel.John.setRoom(appModel.EatClub);
        }else if(updatedRoom == "ConfRoom"){
            appModel.John.setRoom(appModel.ConfRoom);
        }else if(updatedRoom == "StdtPark"){
            appModel.John.setRoom(appModel.StdtPark);
        }else if(updatedRoom == "ForbPark"){
            appModel.John.setRoom(appModel.ForbPark);
        }else if(updatedRoom == "RecCenter"){
            appModel.John.setRoom(appModel.RecCenter);
        }else if(updatedRoom == "JPNGarden"){
            appModel.John.setRoom(appModel.JPNGarden);
        }else if(updatedRoom == "GAField"){
            appModel.John.setRoom(appModel.GAField);
        }else if(updatedRoom == "WestWalkway"){
            appModel.John.setRoom(appModel.WestWalkway);
        }else if(updatedRoom == "EastWalkway"){
            appModel.John.setRoom(appModel.EastWalkway);
        }else if(updatedRoom == "Bratwurst Hall"){
            appModel.John.setRoom(appModel.BratwurstHall);
        }else if(updatedRoom == "LA5"){
            appModel.John.setRoom(appModel.LA5);
        }else if(updatedRoom == "Library"){
            appModel.John.setRoom(appModel.Library);
        }else if(updatedRoom == "WalterPyramid"){
            appModel.John.setRoom(appModel.WalterPyramid);
        }
    }
    
    public void updateJList(){
        
    }
    
    class MyJButton extends JButton{
        public MyJButton(String textToDisplay) {
            this.setText(textToDisplay);
            ClickListener cl = new ClickListener();
            cl.createComponents();
        }
        class ClickListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object element = appView.roomsList.getSelectedValue();
                String convertedString = element.toString();
                updatePlayerRoom(convertedString);
            }
            
            
            private void createComponents() {
                ActionListener listener = new ClickListener();
                addActionListener(listener);
            }
        }
    }
    
}
