package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void fizzQuandMultipleDeTrois() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.jouer(21);
        assertEquals("fizzbuzz.FizzBuzz", result);
    }

    @Test
    void buzzQuandMultipleDeCinq() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.jouer(20);
        assertEquals("Buzz", result);
    }

    @Test
    void fizzBuzzQuandMultipleDeQuinze() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.jouer(30);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void casParDefault() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.jouer(1);
        assertEquals("1", result);
    }
}