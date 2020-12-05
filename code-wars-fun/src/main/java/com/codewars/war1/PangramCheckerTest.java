package main.java.com.codewars.war1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramCheckerTest {


    @Test
    public void whenSenteceIsPangramThenReturnTrue(){
        PangramChecker pangramChecker = new PangramChecker();
        String pangram1 = "The''''''' quick brown foX  jumps over the lazy dog.";

        boolean check = pangramChecker.check(pangram1);

        assertTrue(check);
    }
}
