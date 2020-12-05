package main.java.com.codewars.war14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckPrimeTest {

    @Test
    public void shouldReturnPrimeWhenNumberIsPrime() {

        assertEquals("not prime", CheckPrime.isPrime("33"));
        assertEquals("prime", CheckPrime.isPrime("7"));
        assertEquals("prime", CheckPrime.isPrime("13"));
    }

}
