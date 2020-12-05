package main.java.com.codewars.war5;

import java.util.stream.IntStream;

public class Multiples {

    static int solution(int number) {
        return IntStream.range(2, number)
                .filter(e -> e % 3 == 0 || e % 5 == 0)
                .sum();
    }
}
