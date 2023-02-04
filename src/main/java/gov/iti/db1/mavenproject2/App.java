package gov.iti.db1.mavenproject2;

import java.io.File;
import java.io.IOException;

import gov.iti.service.Connection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    SenderScreenController chatController;

    @Override
    public void start(Stage stage) throws IOException {

        File imgFileName=new File(getClass().getClassLoader().getResource("pic.png").getFile());

        chatController=new SenderScreenController("guest",imgFileName);

        HomeController controller = new HomeController(stage,chatController);

        FXMLLoader loader= new FXMLLoader();

        loader.setController(controller);
        
        Parent root = loader.load(getClass().getResource("/fxml_files/home.fxml").openStream());

        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    

    @Override
    public void stop() throws Exception {
        // TODO Auto-generated method stub
        Connection.getInstance().getServerRef().unRegister(chatController.getClientObj());
        super.stop();
    }



    public static void main(String[] args) {
        Connection.getInstance();
        launch();
    }

    public SenderScreenController getController() {
        return chatController;
    }

}