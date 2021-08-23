package libact4e;

public interface Relation<K, T> {
    Setoid<K> source();

    Setoid<T> target();
}
