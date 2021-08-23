package libact4e;

import java.util.function.Function;

public interface Mapping<K, T> extends Function<K, T> {
    Setoid<K> source();

    Setoid<T> target();

    T call(K a);
}
