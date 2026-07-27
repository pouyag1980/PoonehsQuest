package com.poonehsquest.poonehsquest.service;

import com.poonehsquest.poonehsquest.model.Monster;

public class BattleService {


public int battle ( int currentHeroHealth, Monster currentMonster ){
return currentHeroHealth - currentMonster.totalDamage();
}
}