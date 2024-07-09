package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private int score = 0;
    private StringProperty scoreProperty = new SimpleStringProperty();

    @FXML
    private Button orangeButton;

    @FXML
    private Label scoreLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        scoreProperty.set(String.valueOf(score));
        scoreLabel.textProperty().bind(scoreProperty);
    }

    @FXML
    protected void handleButtonClick() {
        score++;
        scoreProperty.set(String.valueOf(score));
        System.out.println(score);
    }
}

