package org.example;

import java.util.HashMap;
import java.util.Map;

class CheckAnswers {
    Map<Integer, String> questions = new HashMap<>();
    public void checkIt() {
        questions.put(0, "A");
        questions.put(1, "A");
        questions.put(2, "C");
        questions.put(3, "A");
        questions.put(4, "D");
        questions.put(5, "C");
        questions.put(6, "D");
        questions.put(7, "C");
        questions.put(8, "C");
        questions.put(9, "B");
    }

    public boolean sendCorrectionMessage(int x, String y) {
        String correct = questions.getOrDefault(x, "").trim();
        if (y.equalsIgnoreCase(correct)) {
            System.out.println("[Correct antwoord!]");
            return true;
        } else {
            System.out.println("[Fout antwoord]");
            return false;
        }
    }

}