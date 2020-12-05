package main.java.com.codewars.war2;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class UnluckyDays {


    public static int unluckyDays(int year) {
        int counter = 0;
        for (int j = 1; j <= 12; j++) {
            for (int i = 1; i <= 13; i++) {
                if (LocalDate.of(year, j, i).getDayOfWeek() == DayOfWeek.FRIDAY && LocalDate.of(year, j, i).getDayOfMonth() == 13)
                    counter++;
            }
        }
        return counter;
    }
}
