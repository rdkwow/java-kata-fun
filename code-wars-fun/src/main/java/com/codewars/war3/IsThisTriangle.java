package main.java.com.codewars.war3;

import java.util.stream.Stream;

public class IsThisTriangle {
    public static boolean isTriangle(int a, int b, int c) {
        int max = Stream.of(a, b, c).mapToInt(Integer::intValue).max().getAsInt();

        return max < (a + b + c) - max;
    }

}
