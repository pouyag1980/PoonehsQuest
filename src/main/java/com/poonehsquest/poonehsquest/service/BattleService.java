package com.poonehsquest.poonehsquest.service;

import com.poonehsquest.poonehsquest.model.Monster;
import com.poonehsquest.poonehsquest.model.Potion;

public class BattleService {


public int battle ( int currentHeroHealth, Monster currentMonster ){
return currentHeroHealth - currentMonster.totalDamage();
}

    public int usePotion(int currentHeroHealth, Potion currentPotion) {
        return currentHeroHealth + currentPotion.calculateAddedHealthFromPotion(currentHeroHealth);
    }
}