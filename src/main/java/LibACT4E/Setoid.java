package LibACT4E;

import java.util.Map;

public interface Setoid<E> extends Iterable<E> {
    boolean contains(E x);

    default boolean equals(E x, E y) {
        return x.equals(y);
    }

    default boolean apart(E x, E y) {
        return !x.equals(y);
    }

    //TODO: Подумать
    Map<String, E> save(E x);

    E load(Map<String, E> concreteRealization);
}