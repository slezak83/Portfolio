<<<<<<< HEAD
package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>{
    Button b = new Button("Search");
    TextField search1 = new TextField();
    @FXML
    GridPane grid = new GridPane();
    Label label = new Label("Reference Information Search");


    @Override
    public void start(Stage primaryStage) throws Exception {
        /* FXML loader file loads controller file */
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Toyota Reference Information Search");
        Scene scene = new Scene(root, 900, 575);
        scene.getStylesheets().add(Main.class.getResource("project.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();



        /* gridPane properties */
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        /* Label */
        grid.getChildren().add(label);

        /* textField properties */
        search1.setPromptText("Toyota Docs");
        search1.setPrefSize(299, 25);
        GridPane.setConstraints(search1, 20, 20);
        grid.getChildren().add(search1);
        b.setOnAction(this::handle);
        search1.setOnAction(this::handle);

    }
    /*Action event being performed
    * and is linked with controller and FXML file
    * to process event occurring. Attempted
    * to create another Java class file to
    * handle second part of event for I/O*/
    @Override
    public void handle(ActionEvent event) {
            if (event.getSource().equals(b));{
        }
            if (event.getSource().equals(search1));{

        }
    }

    public static void main(String[] args) {
        launch(args);
    }

=======
package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main extends Application implements EventHandler<ActionEvent>{
    Button b = new Button("Search");
    TextField search1 = new TextField();
    GridPane grid = new GridPane();
    Label label = new Label("Reference Information Search");

    @Override
    public void start(Stage primaryStage) throws Exception {
        /* FXML loader file loads controller file */
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Toyota Reference Information Search");
        Scene scene = new Scene(root, 900, 575);
        scene.getStylesheets().add(Main.class.getResource("project.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();



        /* gridPane properties */
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        /* Label */
        grid.getChildren().add(label);

        /* textField properties */
        search1.setPromptText("Toyota Docs");
        search1.setPrefSize(299, 25);
        GridPane.setConstraints(search1, 20, 20);
        grid.getChildren().add(search1);
        b.setOnAction(this::handle);
        search1.setOnAction(this::handle);

        /*Path for file to be read
        * bufferedReader to store path variable*/
        String location = "C:\\Users\\f22b2\\IdeaProjects\\ToyotaInfoApp\\src\\sample\\";
        String fileName = "HELLO";
        File file = new File(location+fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
    }
    /*Action event being performed
    * and is linked with controller and FXML file
    * to process event occurring. Attempted
    * to create another Java class file to
    * handle second part of event for I/O*/
    @Override
    public void handle(ActionEvent event) {
            if (event.getSource().equals(b));{
        }
            if (event.getSource().equals(search1));{

        }
    }

    public static void main(String[] args) {
        launch(args);
    }


>>>>>>> f9fbe85a31f4c55a3b5de30a853f2423f47d44cf
}