package org.example;

public class Healer implements Monster{
    public void increasePower(){

    }
    public void attack(Player player){
        System.out.println("De mini monster valt je aan");
        player.increaceHP(20);
    }
}

