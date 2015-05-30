package pw.fib.kbtdd;

public class Franc extends Money {
    protected Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return franc(amount * multiplier);
    }

    @Override
    public String toString() {
        return "(" + amount + ", franc)";
    }
}