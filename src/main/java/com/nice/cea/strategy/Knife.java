package com.nice.cea.strategy;

/**
 * @author Evgeny Borisov
 */
public class Knife implements Weapon {
    @Override
    public void fight() {
        System.out.println("knife is fighting...");
    }
}
