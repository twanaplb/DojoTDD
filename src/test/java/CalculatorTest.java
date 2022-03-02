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

}