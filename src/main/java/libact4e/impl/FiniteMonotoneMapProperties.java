package libact4e.impl;

import libact4e.FiniteMap;
import libact4e.FinitePoset;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public class FiniteMonotoneMapProperties {
    public <K, T> boolean isMonotone(FinitePoset<K> p1, FinitePoset<T> p2, FiniteMap<K, T> m) {
        return true;
    }

    public <K, T> boolean isAntitone(FinitePoset<K> p1, FinitePoset<T> p2, FiniteMap<K, T> m) {
        return true;
    }
}
