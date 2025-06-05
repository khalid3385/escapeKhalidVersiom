package org.example;

import java.util.ArrayList;

class Kamer2Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer2: Waar staat DoR voor?");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}