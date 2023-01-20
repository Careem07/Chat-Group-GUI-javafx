package iti.gov.db1.mavenproject2;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public abstract class homePage extends Pane {

    protected final Label label;
    protected final Button button;
    protected final Button button0;
    protected final TextField textField;
    protected final ImageView imageView;
    protected final ImageView imageView0;

    public homePage() {

        label = new Label();
        button = new Button();
        button0 = new Button();
        textField = new TextField();
        imageView = new ImageView();
        imageView0 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(454.0);
        setPrefWidth(650.0);
        getStylesheets().add("/iti/gov/db1/mavenproject2/homecss.css");

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setId("titleLabel");
        label.setPrefHeight(41.0);
        label.setPrefWidth(650.0);
        label.getStyleClass().add("myLable");
        label.getStylesheets().add("/iti/gov/db1/mavenproject2/homecss.css");
        label.setText("Chat Room ");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));
        label.setFont(new Font("System Bold Italic", 31.0));

        button.setId("chatButton");
        button.setLayoutX(253.0);
        button.setLayoutY(353.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(46.0);
        button.setPrefWidth(126.0);
        button.getStyleClass().add("myLable");
        button.getStylesheets().add("/iti/gov/db1/mavenproject2/homecss.css");
        button.setText("Chat Now");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#fff9f9"));
        button.setFont(new Font("System Bold Italic", 21.0));

        button0.setId("pictureButton");
        button0.setLayoutX(301.0);
        button0.setLayoutY(212.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(32.0);
        button0.getStylesheets().add("/iti/gov/db1/mavenproject2/homecss.css");

        textField.setId("myTextField");
        textField.setLayoutX(186.0);
        textField.setLayoutY(287.0);
        textField.setPrefHeight(31.0);
        textField.setPrefWidth(261.0);
        textField.setPromptText("Enter Your name");
        textField.getStylesheets().add("/iti/gov/db1/mavenproject2/homecss.css");

        imageView.setFitHeight(150.0);
        imageView.setFitWidth(200.0);
        imageView.setId("myImageView");
        imageView.setLayoutX(242.0);
        imageView.setLayoutY(62.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../../../../../../../../../../../person.png").toExternalForm()));

        imageView0.setFitHeight(31.0);
        imageView0.setFitWidth(32.0);
        imageView0.setId("plusImgView");
        imageView0.setLayoutX(301.0);
        imageView0.setLayoutY(212.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../../../../../../../../../../../plus3.png").toExternalForm()));

        getChildren().add(label);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(textField);
        getChildren().add(imageView);
        getChildren().add(imageView0);

    }
}
