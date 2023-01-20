/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package iti.gov.db1.mavenproject2;

/**
 *
 * @author marwa
 */
public class HomeController implements Initializable {

    Stage stage;
    File imgFileName;
    String msg;

    public HomeController() {

    }

    public HomeController(Stage stage) {
        this.stage=stage
    }

    @FXML
    private Button pictureButton;

    @FXML
    private Button chatButton;

    @FXML
    private TextField myTextField;

    @FXML
    private ImageView myImageView;

    @FXML
    private ImageView plusImgView;

    private void pushPictureImage(ActionEvent event) {
        FileChooser imgChooser = new FileChooser();
        imgFileName = imgChooser.showOpenDialog(stage);
        myImageView.setImage(new Image(imgFileName.toString()));
    }
    
    private void pushsaveButton(ActionEvent event) {
        msg=myTextField.getText();
        System.out.println(msg);
    }
}
