
import static org.junit.Assert.*;

import org.junit.Test;

public class RPNCalcTest {

    @Test
    public void testSimple() {
        RPNCalc calc = new RPNCalc();
        double result = calc.calculate("10 15 +");
        assertEquals(25, result, 0);
    }
    @Test
    public void testSimple2() {
        RPNCalc calc = new RPNCalc();
        double result = calc.calculate("100 5 -");
        assertEquals(-95, result, 0);
    }

}


