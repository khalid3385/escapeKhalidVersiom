package org.example;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) {

        AntwoordChecker antwoordChecker = new AntwoordChecker();

        antwoordChecker.addObserver(new Deur());
        antwoordChecker.addObserver(new StatusDisplay());

        System.out.println("Speler antwoordt: correct");
        antwoordChecker.controleerAntwoord("correct");

        System.out.println("\nSpeler antwoordt: fout");
        antwoordChecker.controleerAntwoord("fout");

        Scanner scanner= new Scanner(System.in);

        Kamer1Questions gameOn= new Kamer1Questions(); //object voor de vragen van kamer
        CheckQuestions questionsChecker= new CheckQuestions(); //object om vragen te checken
        gameOn.setKamer1questions(); //voegt de vragen toe aan een arraylist
        questionsChecker.checkquestions(); //activeert de checker

        for(int i=0;i<gameOn.getQuestionCount();i++) {
            gameOn.getKamer1questions(i);
            gameOn.SubQuestions(i);
            String text= scanner.nextLine();
            questionsChecker.sendCorrectionMessage(i, text);

            //kopieer de bovenstaande for-loop + volgorde voor juiste vragenronde

        }

    }
}