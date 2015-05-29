package pw.fib.kbtdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue("5 dollars equals 5 dollars", new Dollar(5).equals(new Dollar(5)));
        assertFalse("5 dollars don't equal 6 dollars", new Dollar(5).equals(new Dollar(6)));
    }
}