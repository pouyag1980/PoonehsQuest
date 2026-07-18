package com.poonehsquest.poonehsquest.model;

public abstract class Monster {
  String monsterName = "";
  String monsterPicUrl = "";
  int numberOfMonsterAttacks = 0;
  int monsterMinDamage = 0;
  int monsterMaxDamage = 0;

  public int randomizeDamage () {
      return  monsterMinDamage +(int)(Math.random() * (monsterMaxDamage - monsterMinDamage));
  }
  public int totalDamage() {
    int sumOfDamage = 0; for (int attacks = 0; attacks < numberOfMonsterAttacks; attacks++)
    { sumOfDamage = sumOfDamage + randomizeDamage(); }
    return  sumOfDamage; }
}
