package main.java.com.codewars.war12;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(sum(new BigInteger(a),new BigInteger(b)));
        System.out.println(multiply(new BigInteger(a),new BigInteger(b)));
    }
    public static BigInteger sum(BigInteger a,BigInteger b) {
        return a.add(b);
    }

    public static BigInteger multiply(BigInteger a,BigInteger b) {
        return a.multiply(b);
    }
}
