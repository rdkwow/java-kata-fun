package main.java.com.codewars.war10;

public class SimpleString {

    public static int[] isPerfectPower(String word) {
        int upperCase = (int) word.chars().filter(value -> Character.isUpperCase(value)).count();
        int lowerCase = (int) word.chars().filter(value -> Character.isLowerCase(value)).count();
        int number = (int) word.chars().filter(value -> Character.isDigit(value)).count();
        int specialChar = word.length() - (upperCase + lowerCase + number);
        return new int[]{upperCase, lowerCase, number, specialChar};
    }
}
