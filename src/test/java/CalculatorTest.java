
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void addd() {
        assertEquals(7,Calculator.add(new int[]{20, 30, 25, 35, -16, 60, -100}));
    }

}