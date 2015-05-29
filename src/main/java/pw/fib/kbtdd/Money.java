package pw.fib.kbtdd;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money))
            return false;
        Money other = (Money) obj;
        return this.amount == other.amount;
    }
}
