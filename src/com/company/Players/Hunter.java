package com.company.Players;

import com.company.Boss.Boss;
import com.company.Game.Ability;

import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int health, int damage) {
        super(health, damage, Ability.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setDamage(hero.getDamage() * randomCrit());
            }
        }

    }

    public int randomCrit() {
        Random r = new Random();
        int random = r.nextInt(4);
        return random;
    }
}
