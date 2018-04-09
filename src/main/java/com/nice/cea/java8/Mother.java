package com.nice.cea.java8;

/**
 * @author Evgeny Borisov
 */
public interface Mother {
    default void speakToSon(){
        System.out.println("COME TO ME!!!");
    }
}
