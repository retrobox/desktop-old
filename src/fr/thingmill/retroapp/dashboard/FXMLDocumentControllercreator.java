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
public class FXMLDocumentControllercreator implements Initializable {

    @FXML
    private AnchorPane holderPane;

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
    
    //AnchorPane navigate,install,profiles,manual,settings,home,info,buy,creator;
    @FXML
    private JFXButton btnControls;

    public void initialize(URL url, ResourceBundle rb) {
        //Load all fxmls in a cach

    }

    //Set selected node to a content holder
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
