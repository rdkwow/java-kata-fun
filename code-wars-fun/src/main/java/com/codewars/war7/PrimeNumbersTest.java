package main.java.com.codewars.war7;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumbersTest {

    @Test
    public void testBasic() {
        assertFalse(PrimeNumbers.isPrime(4), "4  is not prime");
        assertFalse(PrimeNumbers.isPrime(1), "1  is not prime");
        assertTrue(PrimeNumbers.isPrime(2), "2  is prime");
        assertTrue(PrimeNumbers.isPrime(73), "73 is prime");
        assertFalse(PrimeNumbers.isPrime(75), "75 is not prime");
        assertFalse(PrimeNumbers.isPrime(-1), "-1 is not prime");
    }

    @Test
    public void testPrime() {
        assertTrue(PrimeNumbers.isPrime(3), "3 is prime");
        assertTrue(PrimeNumbers.isPrime(5), "5 is prime");
        assertTrue(PrimeNumbers.isPrime(7), "7 is prime");
        assertTrue(PrimeNumbers.isPrime(41), "41 is prime");
        assertTrue(PrimeNumbers.isPrime(5099), "5099 is prime");
    }


}
