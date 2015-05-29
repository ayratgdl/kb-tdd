package pw.fib.kbtdd;

public abstract class Money {
    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money))
            return false;
        Money other = (Money) obj;
        return this.amount == other.amount && this.getClass().equals(other.getClass());
    }
}
