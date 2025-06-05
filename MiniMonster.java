package org.example;

public class MiniMonster implements Monster{
     int miniBossPower= 5;
    public   void increasePower(){
        miniBossPower+=5;

  }
    public void attack(Player player){
        System.out.println("De mini monster valt je aan");
        player.decreaseHP(miniBossPower);
    }
}
