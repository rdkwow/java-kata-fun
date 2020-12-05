package main.java.com.codewars.hackerrank2;

public class SingletonPattern {
    private static final SingletonPattern INSTANCE = new SingletonPattern();

    public String str = "213";

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        return INSTANCE;
    }

}
