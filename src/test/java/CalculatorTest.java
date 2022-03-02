import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setup () {
        calc = new Calculator();
    }

    @Test
    void testHelloWorld() {
        String result = calc.helloWorld();
        String expected = "Hello World!";
        assertEquals(expected, result);
    }

}