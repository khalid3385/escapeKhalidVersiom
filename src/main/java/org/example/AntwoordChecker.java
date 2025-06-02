package org.example;

import java.util.ArrayList;
import java.util.List;

public class AntwoordChecker {
    private List<AntwoordObserver> observers = new ArrayList<>();

    public void addObserver(AntwoordObserver observer) {
        observers.add(observer);
    }

    public void controleerAntwoord(String antwoord) {
        boolean juist = antwoord.equalsIgnoreCase("correct"); // eenvoudige check

        // Notify all observers
        for (AntwoordObserver observer : observers) {
            observer.update(juist);
        }
    }
}