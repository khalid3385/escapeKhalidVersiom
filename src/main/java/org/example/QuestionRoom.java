package org.example;

import org.example.hints.Room;
import java.util.Scanner;



public class QuestionRoom extends Room {
    private final MiniMonster monster;

    public QuestionRoom(String name, MiniMonster monster) {
        super(name);
        this.monster = monster;
    }

    @Override
    public void enter(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom in: " + getName());
        System.out.println("Wat is het Scrum event waarmee je een sprint plant?");
        String antwoord = scanner.nextLine();

        if (antwoord.equalsIgnoreCase("Sprint Planning")) {
            completed = true;
            System.out.println("Correct!");
        } else {
            System.out.println("Fout! Boss wordt sterker.");
            monster.increasePower();
        }
    }
}
