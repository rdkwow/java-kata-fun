package main.java.com.codewars.war11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaLoopsTest {

    @Test
    public void shouldReturnCorrectValue() {
        JavaLoops javaLoops = new JavaLoops();

        javaLoops.calculate(0, 2, 0);
        assertEquals(2, javaLoops.calculate(0, 2, 0));
        assertEquals(4, javaLoops.calculate(0, 2, 1));
        assertEquals(8, javaLoops.calculate(0, 2, 2));
        assertEquals(16, javaLoops.calculate(0, 2, 3));


        assertEquals(8, javaLoops.calculate(5, 3, 0));
        assertEquals(4, javaLoops.calculate(5, 3, 1));
        assertEquals(16, javaLoops.calculate(5, 3, 2));
        assertEquals(16, javaLoops.calculate(5, 3, 3));
        assertEquals(16, javaLoops.calculate(5, 3, 4));

    }

}
