package org.example;

public class MainBoss implements Monster{
    int power = 0;
    @Override
    public void increasePower(){
         power++;
    }
    @Override
    public void attack(Player player){
        System.out.println("De Main Boss valt je aan");
        player.decreaseHP(power);
    }
}
