package pw.fib.kbtdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue("5 dollars equals 5 dollars", Money.dollar(5).equals(Money.dollar(5)));
        assertFalse("5 dollars don't equal 6 dollars", Money.dollar(5).equals(Money.dollar(6)));
        assertFalse("5 dollars don't equals 5 francs", Money.dollar(5).equals(Money.franc(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USE", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}