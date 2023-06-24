package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Throwable.class.getDeclaredMethod("setCause", Throwable.class).setAccessible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}