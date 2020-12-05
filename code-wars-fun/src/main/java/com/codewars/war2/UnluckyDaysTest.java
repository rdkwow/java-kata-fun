package main.java.com.codewars.war2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnluckyDaysTest {
    @Test
    public void whenYearContainsUnluckyDaysThenReturHowManyItIs() {

        for (int i = 0; i < 20; i++) {
            System.out.println(UnluckyDays.unluckyDays(1990+i));
        }
        assertEquals(3, UnluckyDays.unluckyDays(2015));
        assertEquals(1, UnluckyDays.unluckyDays(1986));

    }

}
