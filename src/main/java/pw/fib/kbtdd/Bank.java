package pw.fib.kbtdd;

import java.util.HashMap;

public class Bank {
    private HashMap<Pair, Integer> rates = new HashMap<>();

    public Money reduce(Expression source, String currency) {
        return source.reduce(this, currency);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    public int rate(String from, String to) {
        if (from.equals(to))
            return 1;
        return rates.get(new Pair(from, to));
    }

    private static class Pair {
        final String from;
        final String to;

        public Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (from != null ? !from.equals(pair.from) : pair.from != null) return false;
            return !(to != null ? !to.equals(pair.to) : pair.to != null);

        }

        @Override
        public int hashCode() {
            int result = from != null ? from.hashCode() : 0;
            result = 31 * result + (to != null ? to.hashCode() : 0);
            return result;
        }
    }
}
