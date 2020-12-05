package main.java.com.codewars.hackerrank1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TokenFormatterTest {

    String input = "!2He? is a very very good boy, isn't he?";
    TokenFormatter tokenFormatter = new TokenFormatter();

    @Test
    public void testFormatter() {
        List<char[]> s = tokenFormatter.formatToken(input);

        System.out.println(tokenFormatter.getCount(s));
        tokenFormatter.getTokens(s);
    }

}
