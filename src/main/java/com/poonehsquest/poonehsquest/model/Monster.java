package com.poonehsquest.poonehsquest.model;

public abstract class Monster {
  String monsterName = "";
  String monsterPicUrl = "";
  int monsterMinDamage = 0;
  int monsterMaxDamage = 0;

  public int randomizeDamage () {
      return  monsterMinDamage +(int)(Math.random() * (monsterMaxDamage - monsterMinDamage));
  }
}
