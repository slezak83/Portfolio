package sample;

import javafx.fxml.FXML;

import java.awt.*;
import java.io.*;

public class FileReader extends Controller {

    /*Path for file to be read
    * bufferedReader to store path variable*/
    String location = "C:\\Users\\f22b2\\IdeaProjects\\ToyotaInfoApp\\src\\sample\\";
    String fileName = "nav map update";
    File file = new File(location + fileName);
    @FXML
    public TextArea textArea;

    public void setTextArea(TextArea textArea) {
        this.textArea = textArea;
    }

    public FileReader() throws IOException {

    }

    /*OVERRIDING PARENT CLASS OF SETONACTION IN CONTROLLER*/
    @Override
    public void setOnAction() throws IOException {

        { BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                String line = in.readLine();
                while (line!=null) {
                    System.out.println(line);
                    line = in.readLine();
                }
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}