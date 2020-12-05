package main.java.com.codewars.hackerrank1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TokenFormatter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(getCount(formatToken(s)));
        getTokens(formatToken(s)).forEach(System.out::println);
        scan.close();
    }

    static List<char[]> formatToken(String input) {
        String tokenSplitRegex = "\\_|\\,|\\!|\\?|\\@|\\.|'|-|\\s+";
        List<char[]> wordList = Arrays.stream(input.split(tokenSplitRegex)).map(e -> e.toCharArray()).map(e -> checkIsLiteral(e)).collect(Collectors.toList());
        return wordList;
    }

    public static List<char[]>  getTokens(List<char[]> wordList) {
        List<char[]> result = new ArrayList<>();
        for (char[] chars : wordList) {
            if (chars.length > 0)
                result.add(chars);
        }
        return result;
    }

    public static long getCount(List<char[]> collect1) {
        return collect1.stream().filter(e -> e.length > 0).count();
    }


    private static char[] checkIsLiteral(char[] word) {
        char[] resultChar = new char[word.length];
        long j = 0;
        for (long i = 0; i < word.length; i++) {
            if (Character.isLetter(word[(int) i])) {
                resultChar[(int) j] = word[(int) i];
                j++;
            }
        }
        return new String(resultChar).trim().toCharArray();
    }
}

