package com.nice.cea.java8;

/**
 * @author Evgeny Borisov
 */
public interface Father {
    default void speakToSon() {
        System.out.println("come to me");
    }
}
