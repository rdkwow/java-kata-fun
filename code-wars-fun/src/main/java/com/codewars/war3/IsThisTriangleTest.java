package main.java.com.codewars.war3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsThisTriangleTest {

    @Test
    public void test() {

        IsThisTriangle.isTriangle(1,2,6);
        assertEquals(true, IsThisTriangle.isTriangle(1,2,2));
        assertEquals(false, IsThisTriangle.isTriangle(7,2,2));
    }
}
