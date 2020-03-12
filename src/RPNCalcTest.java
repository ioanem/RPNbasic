
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
    @Test
    public void testSimple3() {
        RPNCalc calc = new RPNCalc();
        double result = calc.calculate("100 5 *");
        assertEquals(500, result, 0);
    }
    @Test
    public void testSimple4() {
        RPNCalc calc = new RPNCalc();
        double result = calc.calculate("4 4 /");
        assertEquals(1, result, 0);
    }

}


