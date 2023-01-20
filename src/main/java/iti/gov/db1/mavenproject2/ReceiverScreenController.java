package iti.gov.db1.mavenproject2;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ReceiverScreenController  implements Initializable{

    Stage stage;

    @FXML
    private TextField sendTextField;

    @FXML
    private VBox mainVBox;

    @FXML
    private HBox hBox;

    @FXML 
    private Label senderText;

    @FXML 
    private Label receiverText;

    @FXML 
    private Label grpName;

    @FXML 
    private ImageView senderImage ;

    @FXML 
    private ImageView receiverImage ;

    


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        
    }
    
}
