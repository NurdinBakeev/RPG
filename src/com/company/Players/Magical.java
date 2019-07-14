package com.company.Players;

import com.company.Boss.Boss;
import com.company.Game.Ability;

public class Magical extends Hero {

    public Magical(int health, int damage) {
        super(health, damage, Ability.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setDamage(hero.getHealth() + 5);
            }
        }

    }
}
