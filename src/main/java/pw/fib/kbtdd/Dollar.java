package pw.fib.kbtdd;

public class Dollar extends Money {
    protected Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public String toString() {
        return "(" + amount + ", dollar)";
    }
}