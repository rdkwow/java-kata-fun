package main.java.com.codewars.war4;

import java.util.Arrays;

public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split("\\s+"))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
