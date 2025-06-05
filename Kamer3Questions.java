package org.example;

import java.util.ArrayList;

class Kamer3Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer3: Waar staat DoD voor?");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}
