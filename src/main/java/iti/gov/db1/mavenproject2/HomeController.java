/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package iti.gov.db1.mavenproject2;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author marwa
 */
public class HomeController implements Initializable {

    Stage stage;
    File imgFileName;
    public  String msg;

    public HomeController() {

    }

    public HomeController(Stage stage) {
        this.stage=stage;
    }

    
    @FXML
    private Button chatButton;

    @FXML
    private TextField myTextField;

    @FXML
    private ImageView myImageView;

    
    @FXML
    private void pushPictureImage(ActionEvent event) {
        FileChooser imgChooser = new FileChooser();
        imgFileName = imgChooser.showOpenDialog(stage);
        myImageView.setImage(new Image(imgFileName.toString()));
    }
    @FXML
    private void pushsaveButton(ActionEvent event) {
        msg=myTextField.getText();
        System.out.println(msg);
    }
    @FXML
    private void chatNow(ActionEvent event) {
        
        System.out.println(myTextField.getText());
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
       
        
    }
}
