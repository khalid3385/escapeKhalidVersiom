package org.example;
import java.util.HashMap;
import java.util.Map;

class CheckQuestions { //Deze klas checkt of het antwoord goed is of niet
    Map<Integer, String> questions = new HashMap<>(); //Deze methode bevat de juiste antwoorden voor elke hoofdvraag in de arraylist op volgorde
    public void checkquestions() {
        questions.put(0, "A"); //de 0 staat voor de index van de hoofdvraag in de arraylist en de A voor de juiste antwoord
        questions.put(1, "B");
        //voeg zelf dus later de index en juiste antwoord van een hoofdvraag hieraan toe (question.put(--,--)) als je hoofdvragen toevoegd aan de arraylist
    }

    public void sendCorrectionMessage(int x, String y) { //Deze methode hoef je niet te veranderen
        String correct = questions.getOrDefault(x, "");
        if (y.equalsIgnoreCase(correct)) {
            System.out.println("[Correct antwoord!]");
        } else {
            System.out.println("[Fout antwoord]");
        }
    }
}