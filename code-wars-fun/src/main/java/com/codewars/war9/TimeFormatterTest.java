package main.java.com.codewars.war9;


import org.junit.jupiter.api.Test;

public class TimeFormatterTest {

    @Test
    public void ttest123() {

        TimeFormatter timeFormatter = new TimeFormatter();

        System.out.println(timeFormatter.formatDuration(31622400));

    }
}
