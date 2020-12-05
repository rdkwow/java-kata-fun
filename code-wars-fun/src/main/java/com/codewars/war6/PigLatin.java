package main.java.com.codewars.war6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        List<String> collect = Arrays.stream(str.split(" ")).collect(Collectors.toList());
        String text = "";
        for (String s : collect) {
            text = text + convert(s);
        }
        return text.trim();
    }

    private static String convert(String s) {
        if (isLetter(s.toCharArray()[0])) {
            char end = s.toCharArray()[0];
            String ending = end + "ay ";
            String start = "";
            for (int i = 1; i < s.length(); i++) {
                start = start + s.toCharArray()[i];
            }
            return start + ending;
        }
        return s;
    }

    private static boolean isLetter(char letter) {
        if (Character.isLetter(letter)) {
            return true;
        } else return false;
    }
}
