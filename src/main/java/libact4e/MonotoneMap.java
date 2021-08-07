package libact4e;

public interface MonotoneMap<T, K> extends Mapping<T, K> {
    Poset<T> sourcePoset();

    Poset<K> targetPoset();
}

