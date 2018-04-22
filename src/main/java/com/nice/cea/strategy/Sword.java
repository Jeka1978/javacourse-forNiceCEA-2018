package com.nice.cea.strategy;

/**
 * @author Evgeny Borisov
 */
public class Sword implements Weapon {
    @Override
    public void fight() {
        System.out.println("sword is fighting...");
    }
}
