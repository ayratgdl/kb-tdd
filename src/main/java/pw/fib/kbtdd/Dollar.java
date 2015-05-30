package pw.fib.kbtdd;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public String toString() {
        return "(" + amount + ", dollar)";
    }
}