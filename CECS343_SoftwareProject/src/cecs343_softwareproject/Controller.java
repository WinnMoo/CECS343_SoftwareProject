package cecs343_softwareproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

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
        }else if(updatedRoom == "South Hall"){
            appModel.John.setRoom(appModel.SouthHall);
        }else if(updatedRoom == "Lactaction Lounge"){
            appModel.John.setRoom(appModel.Lact);
        }else if(updatedRoom == "Elevators"){
            appModel.John.setRoom(appModel.Elevators);
        }else if(updatedRoom == "Room Of Retirement"){
            appModel.John.setRoom(appModel.RoomOfRetirement);
        }else if(updatedRoom == "North Hall"){
            appModel.John.setRoom(appModel.NorthHall);
        }else if(updatedRoom == "Computer Lab"){
            appModel.John.setRoom(appModel.ComputerLab);
        }else if(updatedRoom == "ECS302"){
            appModel.John.setRoom(appModel.ECS302);
        }else if(updatedRoom == "Eat Club"){
            appModel.John.setRoom(appModel.EatClub);
        }else if(updatedRoom == "CECS Conference Room"){
            appModel.John.setRoom(appModel.ConfRoom);
        }else if(updatedRoom == "Student Parking"){
            appModel.John.setRoom(appModel.StdtPark);
        }else if(updatedRoom == "Forbidden Parking"){
            appModel.John.setRoom(appModel.ForbPark);
        }else if(updatedRoom == "Rec Center"){
            appModel.John.setRoom(appModel.RecCenter);
        }else if(updatedRoom == "Japanese Garden"){
            appModel.John.setRoom(appModel.JPNGarden);
        }else if(updatedRoom == "George Allen Field"){
            appModel.John.setRoom(appModel.GAField);
        }else if(updatedRoom == "West Walkway"){
            appModel.John.setRoom(appModel.WestWalkway);
        }else if(updatedRoom == "East Walkway"){
            appModel.John.setRoom(appModel.EastWalkway);
        }else if(updatedRoom == "Bratwurst Hall"){
            appModel.John.setRoom(appModel.BratwurstHall);
        }else if(updatedRoom == "LA 5"){
            appModel.John.setRoom(appModel.LA5);
        }else if(updatedRoom == "Library"){
            appModel.John.setRoom(appModel.Library);
        }else if(updatedRoom == "Walter Pyramid"){
            appModel.John.setRoom(appModel.WalterPyramid);
        }
    }
    
    public void updateJList(){
        DefaultListModel tempModel = new DefaultListModel();;  
        for (int i = 0; i < appModel.createListOfRooms().length; i++) {
            tempModel.addElement(appModel.createListOfRooms()[i]);
        }
        appView.roomsList.setModel(tempModel);
        
                
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
                System.out.println(convertedString);
                updatePlayerRoom(convertedString);
                //Delete this line later, used for debugging
                String tempVar = appModel.John.room.getNameRoom();
                System.out.println(tempVar);
                
                //update jlist
                updateJList();
            }
            
            
            private void createComponents() {
                ActionListener listener = new ClickListener();
                addActionListener(listener);
            }
        }
    }
    
}
