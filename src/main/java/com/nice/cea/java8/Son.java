package com.nice.cea.java8;

import java.util.*;

/**
 * @author Evgeny Borisov
 */
public class Son implements Father,Mother {


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Integer s1 = map.getOrDefault("s",123);
    }

    @Override
    public void speakToSon() {
        Mother.super.speakToSon();
        Father.super.speakToSon();
    }
}
