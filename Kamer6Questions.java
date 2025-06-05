package org.example;

import java.util.ArrayList;

class Kamer6Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer6: Wat zijn User-stories");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}

