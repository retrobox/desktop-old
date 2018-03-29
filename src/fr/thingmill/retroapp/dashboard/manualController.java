
package fr.thingmill.retroapp.dashboard;

import com.jfoenix.controls.JFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Stoneset for RetroBox
 */
@SuppressWarnings("unused")
public class manualController implements Initializable {

    @FXML
    private AnchorPane holderPane;

    @FXML
    private WebView web;
    
    @FXML
    private JFXButton button1;
    
    @FXML
    private JFXButton button2;
    
    @FXML
    private JFXButton button3;
    
    @FXML
    private JFXButton button4;
    
    public void initialize(URL url, ResourceBundle rb) {
        //Load all fxmls in a cach

    }

    //Set selected node to a content holder
    ////////////////////////////////////////////////////////////////////////////////////    ////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private void webManual(ActionEvent event) {
//openlink


    }

    @FXML
    private void webTechnical(ActionEvent event) {
//openlink


    }
    @FXML
    private void webIssues(ActionEvent event) {
//openlink


    }
    @FXML
    private void webGetting(ActionEvent event) {
//openlink


    }
}
