/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package iti.gov.db1.mavenproject2;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    FXMLLoader loader;
    SenderScreenController controller;
    public  String userName;

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
    private void chooseImage() {
        
        FileChooser imgChooser = new FileChooser();
        imgChooser.setTitle("choose new image");
        imgFileName = imgChooser.showOpenDialog(myImageView.getScene().getWindow());

        if(imgFileName !=null) {
            myImageView.setImage(new Image(imgFileName.toString()));
        } 
    }
    
    @FXML
    private void chatNow(ActionEvent event) {

        userName=myTextField.getText();
    
        Parent root;
        try {
            stage = (Stage) myImageView.getScene().getWindow();
            loader=new FXMLLoader();

            if(imgFileName ==null) {
                imgFileName=new File(getClass().getClassLoader().getResource("pic.png").getFile());
            }

            if(myTextField.getText().isBlank()) userName="user";

            controller=new SenderScreenController(userName,imgFileName);
            loader.setController(controller);
            root = loader.load(getClass().getResource("/fxml_files/firstscr.fxml").openStream());

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
       
        
    }
}
