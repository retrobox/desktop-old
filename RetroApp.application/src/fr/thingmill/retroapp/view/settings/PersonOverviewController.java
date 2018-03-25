package fr.thingmill.retroapp.view.settings;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

import fr.thingmill.retroapp.*;
import fr.thingmill.retroapp.settings.MainAppsettings;


@SuppressWarnings("unused")
public class PersonOverviewController{

    // Reference to the main application.

    @FXML
    private ImageView close;
	
	private MainAppsettings mainApp;
    public PersonOverviewController() {
    }
    
    @FXML
    private void handleClose(KeyEvent event) {
    	System.exit(0);
    }


    public void setMainApp(MainAppsettings mainAppsettings) {
        this.mainApp = mainAppsettings;


    }


	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}