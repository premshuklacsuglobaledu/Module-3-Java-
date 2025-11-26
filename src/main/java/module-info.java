module com.example.module3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.module3 to javafx.fxml;
    exports com.example.module3;
}