package com.company.Players;

import com.company.Boss.Boss;
import com.company.Game.Ability;
import com.company.Game.GameEntity;

public abstract class Hero extends GameEntity implements HavingAbility {

    private Ability ability;

    public Hero(int health, int damage, Ability ability) {
        super(health, damage);
        this.ability = ability;
    }

    public Ability getAbility() {
        return ability;
    }


}
