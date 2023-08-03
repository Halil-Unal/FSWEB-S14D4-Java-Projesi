package com.work.MONSTER;

public class Warewolf extends Monster {

    public Warewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage()+bleed()+poison();
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return 0;
    }
}
