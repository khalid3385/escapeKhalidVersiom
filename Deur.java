package org.example;

public class Deur implements AntwoordObserver {
    @Override
    public void update(boolean juist) {
        if (juist) {
            System.out.println("De deur gaat open!");
        } else {
            System.out.println("De deur blijft gesloten.");
        }
    }
}