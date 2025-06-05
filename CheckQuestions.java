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

    public boolean sendCorrectionMessage(int x, String y) {
        String correct = questions.getOrDefault(x, "").trim();
        String antwoord = y.trim();

        if (antwoord.equalsIgnoreCase(correct)) {
            System.out.println("[Correct antwoord!]");
            return true;
        } else {
            System.out.println("[Fout antwoord]");
            return false;
        }
    }
}
