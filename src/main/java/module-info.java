module com.example.resumebuilder {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires pdfbox;

    opens com.example.resumebuilder to javafx.fxml;

    exports com.example.resumebuilder;
}
