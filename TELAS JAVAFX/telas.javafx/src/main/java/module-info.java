module org.example.telas_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.telas_javafx to javafx.fxml;
    exports org.example.telas_javafx;
}