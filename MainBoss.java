package org.example;

public class MainBoss implements Monster{
    int mainBossPower = 10;

    public void increasePower(){
        mainBossPower +=10;
    }
    public void attack(Player player){
        System.out.println("De Main Boss valt je aan");
        player.decreaseHP(mainBossPower);
    }
}
