package libact4e;

public interface Setoid<T> extends Iterable<T> {
    boolean contains(T x);

    default boolean equals(T x, T y) {
        return x.equals(y);
    }

    default boolean apart(T x, T y) {
        return !x.equals(y);
    }
}
