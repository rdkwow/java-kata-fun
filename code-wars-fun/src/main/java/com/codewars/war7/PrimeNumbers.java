package main.java.com.codewars.war7;

import java.math.BigInteger;
import java.util.Random;

public class PrimeNumbers {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
///https://www.hackerrank.com/challenges/prime-checker/problem
   public int[] checkPrime(int...vals) {
       BigInteger bigInteger = BigInteger.probablePrime(12, new Random());
       int[] ints = new int[vals.length];
       return ints;
   }

}
