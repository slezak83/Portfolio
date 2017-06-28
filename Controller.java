package sample;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static java.lang.System.getProperty;
import static java.lang.System.out;

public class Controller extends Parent {
    public void setOnAction(ActionEvent actionEvent) throws IOException {
        Stage window= new Stage();
        Scene scene1 =new Scene(this, 900, 575);
        scene1.getStylesheets().add(Controller.class.getResource("project.css").toExternalForm());
        Button b = new Button("Search");
        TextField search1 = new TextField();
        File file = new File(getProperty("user.home"),"/Desktop/Toyota References and TSB's/CSP WEP/ze7.pdf");
        FileInputStream inputStream = new FileInputStream(file);
        window.setScene(scene1);
        window.show();

        if (!(actionEvent.getSource() == b)) {
            search1.getText().equals(inputStream);
            System.out.print(inputStream);
            inputStream.close();
        }

        else {
            out.println("File Not Found");
        }
    }
}