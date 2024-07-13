module com.example.resumebuilder {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.apache.pdfbox;

    opens com.example.resumebuilder to javafx.fxml;

    exports com.example.resumebuilder;
}
