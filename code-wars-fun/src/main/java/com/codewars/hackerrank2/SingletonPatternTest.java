package main.java.com.codewars.hackerrank2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonPatternTest {

    @Test
    public void whenGetSingletonInstanceThenValueOfVariableShouldBeEqual() {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        Assertions.assertEquals(singletonPattern.str,SingletonPattern.getInstance().str);
    }
}
