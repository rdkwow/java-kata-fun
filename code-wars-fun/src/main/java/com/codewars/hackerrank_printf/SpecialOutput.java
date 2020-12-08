package main.java.com.codewars.hackerrank_printf;

import java.util.Scanner;

public class SpecialOutput {
    public static void main(String[] args) {
        String s = "elo";
        int number = 22;


        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d",s1,x);
            System.out.println();
        }
        System.out.println("================================");

    }
}

