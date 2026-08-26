package com.poonehsquest.poonehsquest.model;

public class Potion extends Item {
    public Potion() {
        itemName = "Potion";
        itemPicUrl = "/pics/potion.PNG";

    }

    public int calculateAddedHealthFromPotion(int heroHealth) {
        int wantedHealing = (int) (heroHealth * 0.15);
        int newTotalHealth = heroHealth + wantedHealing;

        if (newTotalHealth > 400) {
            return 400 - heroHealth;
        } else {
            return wantedHealing;

        }
    }
}



