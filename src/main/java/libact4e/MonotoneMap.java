package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface MonotoneMap<K, T> extends Mapping<K, T> {
    Poset<K> sourcePoset();

    Poset<T> targetPoset();
}

