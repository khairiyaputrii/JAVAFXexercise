module com.example.anotherbutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.anotherbutton to javafx.fxml;
    exports com.example.anotherbutton;
}