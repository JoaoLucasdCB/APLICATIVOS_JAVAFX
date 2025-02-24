module com.example.tela_config {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tela_config to javafx.fxml;
    exports com.example.tela_config;
}