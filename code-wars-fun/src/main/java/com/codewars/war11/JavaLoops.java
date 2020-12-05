package main.java.com.codewars.war11;

import java.util.Arrays;
import java.util.Scanner;

public class JavaLoops {
    private final static int BASE = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            printResult(collectResult(a, b, n));
        }
        in.close();
    }

    private static void printResult(int[] results) {
        for (int result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
    }

    static int[] collectResult(int firstElement, int secondElement, int expectedResultCount) {
        int sum = 0;
        int[] resultArray = new int[expectedResultCount];

        for (int j = 0; j < expectedResultCount; j++) {
            sum = sum + calculate(firstElement, secondElement, j);
            resultArray[j] = sum;
        }
        return resultArray;
    }

    static int calculate(int firstElement, int secondElement, int power) {
        if (power == 0)
            return (int) (firstElement + Math.pow(BASE, power) * secondElement);
        else
            return (int) (Math.pow(BASE, power) * secondElement);
    }

    public void test() {
        int[] players = new int[5];
        for (int i = 0; i < players.length; i++) {
            players[i] = (int) Math.random();
        }
            Arrays.sort(players);
    }
}
