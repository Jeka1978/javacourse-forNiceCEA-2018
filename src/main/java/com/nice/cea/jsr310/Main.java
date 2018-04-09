package com.nice.cea.jsr310;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate tomorrow = now.plusDays(1);
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPAN));
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPAN));
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
        System.out.println(now.withYear(2017).getDayOfWeek());
        LocalDate jeka = LocalDate.of(1978, 3, 10);
        LocalDate moshe = LocalDate.of(1984, 12, 11);
        long between = ChronoUnit.DAYS.between(jeka, moshe);
        System.out.println("between = " + between);
    }
}
