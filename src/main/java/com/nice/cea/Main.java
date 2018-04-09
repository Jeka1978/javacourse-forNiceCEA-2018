package com.nice.cea;

import java.util.HashMap;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        Person moshe = Person.builder().age(33).salary(35).name("Moshe")
                .child("Goldstar",7)
                .child("Stella",9)
                .build();
        System.out.println("moshe = " + moshe);
        Person person = moshe.withAge(34);
    }
}
