package main.java.com.codewars.war9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TimeFormatter {
    private static long sec;
    private static long min;
    private static long hour;
    private static long day;
    private static long year;

    public static String formatDuration(long seconds) {

        min = parseTime(seconds, 60);
        sec = getRest(seconds, 60);

        hour = parseTime(min, 60);
        min = getRest(min, 60);

        day = parseTime(hour, 24);
        hour = getRest(hour, 24);

        year = parseTime(day, 365);
         day = getRest(day, 365);


        return formatOutput(year, day, hour, min, sec);
    }


    private static String formatOutput(long year, long day, long hour, long min, long sec) {
        List<String> output = Arrays.asList(prlongYear(year), prlongDays(day), prlongHours(hour), prlongMinutes(min), prlongSec(sec));

        List<String> collect = output.stream().filter(e -> e != "").collect(Collectors.toList());
        if (collect.size() == 5)
            return collect.get(0) + ", " + collect.get(1) + ", " + collect.get(2) + ", " + collect.get(3) + " and " + collect.get(4);
        if (collect.size() == 4)
            return collect.get(0) + ", " + collect.get(1) + ", " + collect.get(2) + " and " + collect.get(3);
        if (collect.size() == 3)
            return collect.get(0) + ", " + collect.get(1) + " and " + collect.get(2);
        if (collect.size() == 2)
            return collect.get(0) + " and " + collect.get(1);
        if (collect.size() == 1)
            return collect.get(0);
        return "now";
    }

    private static String prlongSec(long sec) {
        if (sec == 1)
            return "1 second";
        if (sec > 1)
            return sec + " seconds";
        return "";
    }

    private static String prlongMinutes(long sec) {
        if (sec == 1)
            return "1 minute";
        if (sec > 1)
            return sec + " minutes";
        return "";
    }

    private static String prlongHours(long sec) {
        if (sec == 1)
            return "1 hour";
        if (sec > 1)
            return sec + " hours";
        return "";
    }

    private static String prlongDays(long sec) {
        if (sec == 1)
            return "1 day";
        if (sec > 1)
            return sec + " days";
        return "";
    }

    private static String prlongYear(long sec) {
        if (sec == 1)
            return "1 year";
        if (sec > 1)
            return sec + " years";
        return "";
    }


    private static long getRest(long seconds, long i) {
        if (seconds > 0 && i > 0)
            return seconds % i;
        return 0;
    }

    private static long parseTime(long seconds, long i) {
        if (seconds > 0 && i > 0)
            return seconds / i;
        return 0;
    }
}
