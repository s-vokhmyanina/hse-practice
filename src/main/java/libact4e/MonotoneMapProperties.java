package libact4e;

public class MonotoneMapProperties {
    public <K, T> boolean isMonotone(FinitePoset<K> p1, FinitePoset<T> p2, FiniteMap<K, T> m) {
        return true;
    }

    public <K, T> boolean isAntitone(FinitePoset<K> p1, FinitePoset<T> p2, FiniteMap<K, T> m) {
        return true;
    }
}
