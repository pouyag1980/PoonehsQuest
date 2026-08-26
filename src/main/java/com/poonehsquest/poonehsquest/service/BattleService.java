package com.poonehsquest.poonehsquest.service;

import com.poonehsquest.poonehsquest.model.Armor;
import com.poonehsquest.poonehsquest.model.Monster;
import com.poonehsquest.poonehsquest.model.Potion;
import com.poonehsquest.poonehsquest.model.Shield;

public class BattleService {


public int battle ( int currentHeroHealth, Monster currentMonster ){
return currentHeroHealth - currentMonster.totalDamage();
}

    public int usePotion(int currentHeroHealth, Potion currentPotion) {
        return currentHeroHealth + currentPotion.calculateAddedHealthFromPotion(currentHeroHealth);
    }

    public int useShield(int currentHeroHealth, Shield currentShield) {
        return currentHeroHealth + currentShield.addedHealth ;
    }

    public int useArmor(int currentHeroHealth, Armor currentArmor) {
        return currentHeroHealth + currentArmor.addedHealth ;
    }
}