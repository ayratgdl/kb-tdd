package pw.fib.kbtdd;

public class Sum implements Expression {
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(String to) {
        return new Money(augend.amount + addend.amount, to);
    }
}
