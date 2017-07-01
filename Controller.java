package sample;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

import static java.lang.System.getProperty;

public class Controller extends Parent {
    Button b = new Button("Search");
    TextField search1 = new TextField();
    Stage stage = new Stage();
    Scene scene1= new Scene(this, 900, 575);
    File file = new File(getProperty("user.home"), "/Desktop/Toyota References and TSB's/CSP WEP/new.txt");

    public void setOnAction(ActionEvent actionEvent) throws IOException {
        FileInputStream inputStream = new FileInputStream(file);
        scene1.getStylesheets().add(Controller.class.getResource("actionevent.css").toExternalForm());
        stage.setScene(scene1);
        stage.show();

        if (!(actionEvent.getSource() == b)) {
            b.setText(search1.getText());
            return;
        }
    }
}