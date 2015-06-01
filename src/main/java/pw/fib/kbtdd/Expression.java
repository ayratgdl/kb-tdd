package pw.fib.kbtdd;

public interface Expression {
    Money reduce(Bank bank, String to);
}
