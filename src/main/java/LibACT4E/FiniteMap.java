package LibACT4E;

public interface FiniteMap<K, T> extends Mapping<K, T> {
    FiniteSet<K> source();

    FiniteSet<T> target();

}
