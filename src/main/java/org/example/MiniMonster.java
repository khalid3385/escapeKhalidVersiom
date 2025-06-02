package org.example;

public class MiniMonster implements Monster{
    @Override
    public  void increasePower(){

  }
    @Override
    public void attack(Player player){
        System.out.println("De mini monster valt je aan");
        player.decreaseHP(1);
    }
}
