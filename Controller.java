package sample;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller extends Parent {
    @FXML
    public TextField search1;
    @FXML
    public Button search;
    @FXML
    Stage window = new Stage();
    @FXML
    public Scene scene1;

    @FXML
    public void setOnAction() {
        if (search1.getText().isEmpty()) {
            System.out.println("Please Enter Text In The Search Field");
        } else {
            if (search1.getText().contains("TSB")) {
                window.setScene(scene1);
                window.show();
            }else{
                    System.out.println("Unable to Locate Results of Your Search, Try Again");
                }
            }
        }
    }