package fr.thingmill.retroapp.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import fr.theshark34.swinger.colored.SColoredBar;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.thingmill.retroapp.*;


@SuppressWarnings("unused")
public class PersonOverviewController{

    // Reference to the main application.

    @FXML
    private ImageView close;
    private Label infoLabel;
    private ProgressBar progressBar;
    
	private MainApp mainApp;
    public PersonOverviewController() {
    }
    
    @FXML
    private void handleClose(KeyEvent event) {
    	System.exit(0);
    }


    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;


    }


	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}

	