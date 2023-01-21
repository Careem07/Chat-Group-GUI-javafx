package iti.gov.db1.mavenproject2;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SenderScreenController  implements Initializable{

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

    String name;
    File img;
    Image image;

    public SenderScreenController() {

    }

    public SenderScreenController(String name,File img) {

        this.name=name;
        this.img=img;
    }

    public void sendMessage(ActionEvent e){ 
        if(sendTextField.getText() != ""){
            HBox message = new HBox();
            message.setAlignment(Pos.CENTER_RIGHT);
            message.prefHeight(42);
            message.prefWidth(394);
            message.setLayoutY(20);

            Label lbl = new Label("  " + sendTextField.getText() + "  ");
            lbl.setAlignment(Pos.CENTER);
            Color col = Color.rgb(255,255,255);
            CornerRadii corn = new CornerRadii(15);
            Background background = new Background(new BackgroundFill(col, corn, Insets.EMPTY));
            lbl.setBackground(background);
            lbl.setMinHeight(20);
            lbl.setLayoutY(10);

            ImageView image = new ImageView(senderImage.getImage());
            image.setFitHeight(35);
            image.setFitWidth(35);
            message.getChildren().add(lbl);
            message.getChildren().add(image);
            message.getChildren().add(new Label(" "));

            
            mainVBox.getChildren().add(message);
            
            sendTextField.setText("");

        }
    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

        URL url;
        try {
            url = img.toURI().toURL();
            image =new Image(url.toString());
            senderImage.setImage(image);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        grpName.setText(name);
        
    }
    
}
