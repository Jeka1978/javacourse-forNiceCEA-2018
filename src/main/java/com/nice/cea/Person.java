package com.nice.cea;

import lombok.*;
import lombok.experimental.Wither;
import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
@Wither
@Log4j
public class Person extends Object{
    private transient int age2;


    @Test
    public void stam() {
        System.out.println("STAMMMMM!!!");
    }


    @NonNull
    private String name;
    @NonNull
    private Integer age;
    private int salary;
    @Singular
    private Map<String,Integer> children;

    public static void main(String[] args) {
        log.error("I love lombok");
    }





}




