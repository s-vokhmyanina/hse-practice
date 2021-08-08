package libact4e;

public interface MonotoneMap<K, T> extends Mapping<K, T> {
    Poset<K> sourcePoset();

    Poset<T> targetPoset();
}

