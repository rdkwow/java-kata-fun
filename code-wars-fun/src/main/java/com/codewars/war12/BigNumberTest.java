package main.java.com.codewars.war12;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigNumberTest {

    @Test
    public void sum() {
        assertEquals(new BigInteger("1254"),BigNumber.sum(new BigInteger("1234"),new BigInteger("20")));
    }

    @Test
    public void multiply() {
        assertEquals(new BigInteger("24680"),BigNumber.multiply(new BigInteger("1234"),new BigInteger("20")));
    }
}
