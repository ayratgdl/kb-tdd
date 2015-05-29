package pw.fib.kbtdd;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Franc))
            return false;
        Franc other = (Franc) obj;
        return this.amount == other.amount;
    }

    @Override
    public String toString() {
        return "(" + amount + ", dollar)";
    }
}