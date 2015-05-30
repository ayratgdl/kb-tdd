package pw.fib.kbtdd;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);}

    public Money times(int multiplier) {
        return dollar(amount * multiplier);
    }

    @Override
    public String toString() {
        return "(" + amount + ", dollar)";
    }
}