package main.java.com.codewars.war10;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SimpleStringTest {
    @Test
    public void test123213() {

        assertArrayEquals(new int[]{8,6,3,2}, SimpleString.isPerfectPower("CbgA5<1d-tOwUZTS8yQ"));
        assertArrayEquals(new int[]{9,9,6,9}, SimpleString.isPerfectPower("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"));
        assertArrayEquals(new int[]{15,8,6,9}, SimpleString.isPerfectPower("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"));
        assertArrayEquals(new int[]{10,7,3,6}, SimpleString.isPerfectPower("$Cnl)Sr<7bBW-&qLHI!mY41ODe"));
        assertArrayEquals(new int[]{7,13,4,10}, SimpleString.isPerfectPower("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"));
    }
    }
