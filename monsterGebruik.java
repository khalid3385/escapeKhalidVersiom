package org.example;

public class monsterGebruik {
    private Monster monster;

    public monsterGebruik(Monster monster) {
        this.monster = monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public void monsterAanval(Player player) {
        monster.attack(player);
    }

    public void monsterWordtSterker() {
        monster.increasePower();
    }
}
