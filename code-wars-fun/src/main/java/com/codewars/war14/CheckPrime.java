package main.java.com.codewars.war14;

import java.math.BigInteger;
import java.util.Scanner;

public class CheckPrime {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(isPrime(scanner.next()));

        scanner.close();


    }

    public static String isPrime(String number) {
        if (new BigInteger(String.valueOf(number)).isProbablePrime(1)) {
            return "prime";
        } else
            return "not prime";
    }
}
