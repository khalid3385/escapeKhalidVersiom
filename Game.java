package org.example;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        Player speler = new Player();
        monsterGebruik miniMonster = new monsterGebruik(new MiniMonster());
        monsterGebruik mainBoss = new monsterGebruik(new MainBoss());
        monsterGebruik healer = new monsterGebruik(new Healer());

        List<ControlKamers> kamerLijst = Arrays.asList(
                new ControlKamers(new DailyScrum1Questions()),
                new ControlKamers(new Kamer2Questions()),
                new ControlKamers(new Kamer3Questions()),
                new ControlKamers(new Kamer4Questions()),
                new ControlKamers(new Review5Questions()),
                new ControlKamers(new Kamer6Questions()),
                new ControlKamers(new Kamer7Questions()),
                new ControlKamers(new Kamer8Questions()),
                new ControlKamers(new Kamer9Questions()),
                new ControlKamers(new Kamer10Questions())
        );

        for (ControlKamers kamer : kamerLijst) {
            kamer.object.setKamerquestions();
        }

        MultipleChoiceAnswers answers = new MultipleChoiceAnswers();
        CheckAnswers checker = new CheckAnswers();

        for (ControlKamers kamer : kamerLijst) {
            for (int i = 0; i < kamer.object.getQuestionCount(); i++) {
                if (speler.getHP() <= 0) {
                    System.out.println("Je bent dood! Game over.");
                    return;
                }

                kamer.object.getKamerquestions(i);
                answers.MultipleChoice(counter);
                String text = scanner.nextLine();

                boolean correct = checker.sendCorrectionMessage(counter, text); // true als goed
                if (correct) {
                    if (Math.random() < 0.2) {
                        healer.monsterAanval(speler);
                        System.out.println("de healer heeft je geheald! HP: " + speler.getHP());
                    } else {
                        System.out.println("Goed antwoord! Geen healing. HP: " + speler.getHP());
                    }
                } else {
                    miniMonster.monsterAanval(speler);
                    miniMonster.monsterWordtSterker();
                    mainBoss.monsterWordtSterker();
                    System.out.println("Fout antwoord! MiniMonster valt aan. HP: " + speler.getHP());
                }

                counter++;
            }

            speler.nextRoom();
            System.out.println(); // lege regel tussen kamers
        }

        System.out.println(" Je betreed nu de BOSS room!, de main BOSS valt je aan");
        mainBoss.monsterAanval(speler);

        if (speler.getHP() > 0) {
            System.out.println("Je hebt de main BOSS overleefd en gewonnen!");
        } else {
            System.out.println(" De main BOSS heeft je verslagen. Game over.");
        }
    }
}
