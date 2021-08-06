package libact4e;

public interface FiniteMap<K, T> extends Mapping<K, T> {
    FiniteSet<K> source();

    FiniteSet<T> target();

}
