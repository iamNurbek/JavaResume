package com.example.resumebuilder;

public class Main {
    public static void main(String[] args) {
        DatabaseManager.createDatabase();
        ResumeBuilder.launch(ResumeBuilder.class, args);
    }
}
