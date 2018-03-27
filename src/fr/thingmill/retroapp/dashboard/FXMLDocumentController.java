/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Stoneset for RetroBox
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane holderPane;
    @FXML
    private JFXButton btninfo;
    @FXML
    private JFXButton btnHome;
    @FXML
    private JFXButton btnInstall;
    @FXML
    private JFXButton btnNavigate;
    @FXML
    private JFXButton btnManual;
    @FXML
    private JFXButton btnSettings;
    @FXML
    private JFXButton btnProfiles;
    @FXML
    private JFXButton btnBuy;
    @FXML
    private JFXButton btnCreator;
    @FXML
    private JFXButton linkJFoenix;
    @FXML
    private JFXButton linkEfxclipse;
    @FXML
    private JFXButton linkFontawesome;
    @FXML
    private JFXButton linkEclipseIDE;
    @FXML
    private JFXButton linkScenebuilde;
    @FXML
    private JFXButton linkRepo;
    @FXML
    private JFXButton linkGithub;
    
    AnchorPane navigate,install,profiles,manual,settings,home,info,buy,creator;
    @FXML
    private JFXButton btnControls;

    public void initialize(URL url, ResourceBundle rb) {
        //Load all fxmls in a cache
        try {
             navigate = FXMLLoader.load(getClass().getResource("navigate.fxml"));
             install = FXMLLoader.load(getClass().getResource("install.fxml"));
             profiles = FXMLLoader.load(getClass().getResource("Profiles.fxml"));
             manual = FXMLLoader.load(getClass().getResource("manual.fxml"));
             settings = FXMLLoader.load(getClass().getResource("settings.fxml"));
             home = FXMLLoader.load(getClass().getResource("home.fxml"));
             info = FXMLLoader.load(getClass().getResource("info.fxml"));
             buy = FXMLLoader.load(getClass().getResource("buy.fxml"));
             creator = FXMLLoader.load(getClass().getResource("creator.fxml"));
             
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Set selected node to a content holder
    private void setNode(Node node) {
        holderPane.getChildren().clear();
        holderPane.getChildren().add((Node) node);

        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void switchInstall(ActionEvent event) {
        setNode(install);
    }
    
    @FXML
    private void switchHome(ActionEvent event) {
        setNode(creator);
    }

    @FXML
    private void switchNavigate(ActionEvent event) throws IOException {
    	setNode(navigate);

        try {
        	System.out.println("Ouverture du dossier...");
        	String command = "cmd /c %windir%\\explorer.exe \\\\RETROPIE";
            Runtime.getRuntime().exec(command);
        } 
        catch (IllegalArgumentException iae) {
            System.out.println("Connexion impossible");
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Connexion impossible...");
            alert.setHeaderText(null);
            Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image(this.getClass().getResource("/fr/thingmill/retroapp/icons/icon.png").toString()));
            alert.setContentText("Connexion impossible ! Vérifier si votre console est connectée !");

            alert.showAndWait();
        }
    }

    @FXML
    private void switchManual(ActionEvent event) {
        setNode(manual);
    }

    @FXML
    private void switchProfile(ActionEvent event) {
        setNode(profiles);
    }


    @FXML
    private void switchSettings(ActionEvent event) {
        setNode(settings);
    }

    @FXML
    private void switchButtonInfo(ActionEvent event) {
    	setNode(info);
    }
    @FXML
    private void switchButtonBuy(ActionEvent event) {
    	setNode(buy);
    }
    @FXML
    private void switchButtonCreator(ActionEvent event) {
    	setNode(creator);
    }
    ////////////////////////////////////////////////////////////////////////////////////    ////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private void linkJfoenix(ActionEvent event) {
//openlink


    }

    @FXML
    private void linkEfxclipse(ActionEvent event) {
//openlink


    }
    @FXML
    private void linkFontawesome(ActionEvent event) {
//openlink


    }
    @FXML
    private void linkEclipseIDE(ActionEvent event) {
//openlink


    }
    @FXML
    private void linkScenebuilde(ActionEvent event) {
//openlink


    }
    @FXML
    private void linkRepo(ActionEvent event) {
//openlink


    }
    @FXML
    private void linkGithub(ActionEvent event) {
//openlink


    }
}
