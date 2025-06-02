package org.example;

class SwitchControl{
    private final SwitchRules kamers;

    SwitchControl(SwitchRules x){
        this.kamers=x;
    }

    public void SwitchMessageFinal() {
        kamers.SwitchMessage();
    }
}
