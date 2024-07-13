package com.example.resumebuilder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ResumeBuilder extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Resume Builder");

        TextField nameField = new TextField();
        nameField.setPromptText("Full Name");

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        TextField phoneField = new TextField();
        phoneField.setPromptText("Phone Number");

        TextArea educationField = new TextArea();
        educationField.setPromptText("Education");

        TextArea experienceField = new TextArea();
        experienceField.setPromptText("Work Experience");

        Button generateButton = new Button("Generate Resume");

        generateButton.setOnAction(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String education = educationField.getText();
            String experience = experienceField.getText();

            DatabaseManager.saveResume(name, email, phone, education, experience);
            PDFGenerator.generatePDF(name, email, phone, education, experience);
        });

        VBox vbox = new VBox(10, nameField, emailField, phoneField, educationField, experienceField, generateButton);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
