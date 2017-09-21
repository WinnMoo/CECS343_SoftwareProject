
import java.io.IOException;
import java.sql.SQLException;

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

}
