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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static java.lang.System.getProperty;

public class Main extends Application implements EventHandler<ActionEvent> {
    Button b = new Button("Search");
    TextField search1 = new TextField();
    @Override
    public void start(Stage primaryStage) throws Exception {
        /* FXML loader file loads controller file */
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Toyota Reference Information Search");
        Scene scene= new Scene(root, 900, 575);
        scene.getStylesheets().add(Main.class.getResource("project.css").toExternalForm());
        b.setOnAction(this::handle);
        primaryStage.setScene(scene);
        primaryStage.show();

        /* Gridpane properties */
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        /* Label */
        Label label = new Label("Reference Information Search");
        grid.getChildren().add(label);

        /* textfield properties */
        search1.setPromptText("Toyota Docs");
        search1.setPrefSize(299, 25);
        GridPane.setConstraints(search1, 20, 20);
        grid.getChildren().add(search1);

    }

    @Override
    public void handle(ActionEvent event) {
        File file = new File(getProperty("user.home"),"/Desktop/Toyota References and TSB's/CSP WEP/ze7.pdf");
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (event.getSource() == b) ;
        {
            search1.getText().equals(inputStream);
            System.out.println(inputStream);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}