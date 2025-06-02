package org.example;
public class Player {
    private int hp = 10;
    private int currentRoom = 0;

    public void increaseHP(int amount) {
        this.hp += amount;
        if (this.hp < 0) this.hp = 0;
    }

    public void decreaseHP(int amount) {
        this.hp -= amount;
        if (this.hp < 0) this.hp = 0;
    }
    public int status(int currentRoom){
        return currentRoom;
    }

    public int getHP() {
        return hp;
    }

    public int getCurrentRoom() {
        return currentRoom;
    }

    public void nextRoom() {
        this.currentRoom++;
    }

    public String getStatus() {
        return "HP: " + hp + ", Kamer: " + currentRoom;
    }
}

