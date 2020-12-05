package main.java.com.codewars.war1;

public class PangramChecker {
    public boolean check(String sentence) {
        return sentence
                .chars()
                .map(Character::toLowerCase)
                .filter(Character::isLetter)
                .distinct()
                .count() == 26;
    }
}
