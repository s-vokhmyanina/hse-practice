package LibACT4E;

import java.util.Map;

public interface Setoid<T> extends Iterable<T> {
    boolean contains(T x);

    default boolean equals(T x, T y) {
        return x.equals(y);
    }

    default boolean apart(T x, T y) {
        return !x.equals(y);
    }

    //TODO: Подумать
    Map<String, T> save(T x);

    T load(Map<String, T> concreteRealization);
}