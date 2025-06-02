package org.example;

class Kamer2 implements SwitchRules{
    public void SwitchMessage() {
        System.out.print("Switching to Kamer1");
        for(int i=0;i<10;i++){
            try{
                System.out.print(".");
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("[Complete!]");
    }
}
