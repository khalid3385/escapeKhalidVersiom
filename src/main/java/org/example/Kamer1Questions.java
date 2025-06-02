package org.example;
import java.util.ArrayList;

class Kamer1Questions { //Deze klas bevat de vragen + multiple antwoorden
    ArrayList<String> kamer1questions = new ArrayList<>();

    public void setKamer1questions() { //Deze methode voegt de hoofdvragen toe aan een arraylist (je kunt zelf vragen toevoegen hieraan)
        kamer1questions.add("Hoeveel uren zitten er in een dag?");
        kamer1questions.add("Hoeveel minuten zitten er in een uur?");
    }

    public int getQuestionCount() { //Deze methode hoef je niet aan te passen
        return kamer1questions.size();
    }

    public void getKamer1questions(int x) { //Deze methode hoef je niet aan te passen
        System.out.println(kamer1questions.get(x));
    }

    public void SubQuestions(int x) { //Deze methode bevat de multiple choice antwoorden voor elke hoofdvraag op volgorde van de vragen in de arraylist (dus je kunt zelf multiple choice antwoorden toevoegen voor elke toegevoegde hoofdvraag)
        String[] subquestions = {"A. 24 - B. 26 - C.28",
                "A. 2000 - B. 3600 - C. 1500"};

        System.out.println(subquestions[x]);
    }
}