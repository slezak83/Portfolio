<<<<<<< HEAD
package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller extends Main{
    @FXML
    public TextField search1;
    @FXML
    public Button search;
    Stage window = new Stage();
    TextArea textArea = new TextArea();

    public void setOnAction() throws IOException {
        textArea.setEditable(false);
        Parent root2 = FXMLLoader.load(getClass().getResource("nextScene.FXML"));
        Scene scene1 = new Scene(root2, 900, 575);
        FileReader fileReader = new FileReader();


        if (search1.getText().isEmpty()) {
            System.out.println("Please Enter Text In The Search Field");
        } else {
            if (search1.getText().contains("TSB")) {
                fileReader.setOnAction();
                window.setScene(scene1);
                window.show();
            } else {
                System.out.println("Unable to Locate Results of Your Search, Try Again");
            }
        }
    }
}
=======
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
>>>>>>> f9fbe85a31f4c55a3b5de30a853f2423f47d44cf
