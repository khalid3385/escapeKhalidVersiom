package org.example;

import org.example.hints.Room;

public class HintJoker implements Joker{
    boolean used = false;
    @Override
    public void useIn(Room room){
        if(!used){
            room.revealHint();
            used = true;
        } else {
            System.out.println(" HintJoker is al gebruikt.");
        }
    }
}