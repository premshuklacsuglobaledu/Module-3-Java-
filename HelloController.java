package com.example.module3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class HelloController {
    @FXML
    private TextArea textBox;
    @FXML
    private BorderPane rootPane;
    private final Random rand = new Random();

    @FXML
    protected void onShowDateTime() {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy    -    hh:mm:ss a"));
        this.textBox.setText(now);
    }

    @FXML
    protected void onWriteToFile() {
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write(this.textBox.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    protected void onRandomGreenHue() {
        int g = 150 + this.rand.nextInt(105);
        int r = this.rand.nextInt(80);
        int b = this.rand.nextInt(80);
        String color = String.format("rgb(%d,%d,%d)", r, g, b);
        this.rootPane.setStyle("-fx-background-color: " + color + ";");
    }

    @FXML
    protected void onExit() {
        System.exit(0);
    }
}
