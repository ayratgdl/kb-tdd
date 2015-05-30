package pw.fib.kbtdd;

public class Franc extends Money {
    protected Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public String toString() {
        return "(" + amount + ", franc)";
    }
}