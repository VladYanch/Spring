package org.example;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    private void doMyInit() {
        System.out.println("Do my init");
    }
    private void doMyDestroy() {
        System.out.println("Do my destroy");
    }
}
