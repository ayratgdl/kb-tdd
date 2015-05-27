package pw.fib.kbtdd;

public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dollar))
            return false;
        Dollar other = (Dollar) obj;
        return this.amount == other.amount;
    }
}