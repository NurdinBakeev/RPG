package com.company.Players;

import com.company.Boss.Boss;
import com.company.Game.Ability;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, Ability.SAVE_DAMAGE_AND_REVERSE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {

                hero.setDamage(boss.getDamage() + hero.getDamage());

            }
        }

    }
}
