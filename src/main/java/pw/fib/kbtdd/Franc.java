package pw.fib.kbtdd;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public String toString() {
        return "(" + amount + ", franc)";
    }
}