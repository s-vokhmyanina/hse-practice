package libact4e;

public interface Mapping<K, T> {
    Setoid<K> source();

    Setoid<T> target();

    T call(K a);
}
