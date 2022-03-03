import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setup () {
        calculator = new Calculator();
    }

    @Test
    void testHelloWorld() {
        String result = calculator.helloWorld();
        String expected = "Hello World!";
        assertEquals(expected, result);
    }
    @Test
    void testSum() {
        int expected = 1+1;
        int result = calculator.sum(1,1);
        assertEquals(expected,result);
    }

    @Test
    void testSubtraction() {
        int expected = 2-1;
        int result = calculator.subtraction(2, 1);
        assertEquals(expected, result);
    }

    @Test
    void testMultiplication() {
        int expected = 2*2;
        int result = calculator.multiplication(2, 2);
        assertEquals(expected, result);
    }

    @Test
    void testSumAndSubtraction(){
        int expected = (1+2) - (1+1);
        int result = calculator.sumAndSubtraction(1, 2);
        assertEquals(expected, result);
    }

}