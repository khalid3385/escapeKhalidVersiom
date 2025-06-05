package org.example;

public class StatusDisplay implements AntwoordObserver {
    @Override
    public void update(boolean juist) {
        if (juist) {
            System.out.println("✔ Juist antwoord! Score verhoogd.");
        } else {
            System.out.println("✘ Fout antwoord. Probeer opnieuw!");
        }
    }
}