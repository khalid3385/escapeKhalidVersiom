package org.example;

import java.util.ArrayList;

public class DailyScrum1Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer1: Wat voor app/website is handig om te gebruiken voor SCRUM?");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}