package main.java.com.codewars.war6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {

    @Test
    public void FixedTests() {
        System.out.println( PigLatin.pigIt("oratay oay oresmay ![]"));
        System.out.println(PigLatin.pigIt("This is my string"));
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }

}
