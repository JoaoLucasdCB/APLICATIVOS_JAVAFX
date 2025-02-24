module com.example.inicio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inicio to javafx.fxml;
    exports com.example.inicio;
}