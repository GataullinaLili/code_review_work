import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator=new Calculator();

    @Test
    void add() {
        assertEquals(6,calculator.add(5,1));
    }

    @Test
    void dif() {
        //парам
        assertEquals(3,calculator.dif(4,1));
    }

    @Test
    void div() {
        assertEquals(6,calculator.div(6,1));
    }

    @Test
    void times() {
        assertEquals(-1,calculator.times(-1,1));
    }

    @Test
    void solver() {
        assertEquals(7,calculator.solver());
    }
}