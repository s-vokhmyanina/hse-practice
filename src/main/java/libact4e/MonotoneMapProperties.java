package libact4e;

public class MonotoneMapProperties<T, K> {
    boolean isMonotone( FinitePoset<T> p1, FinitePoset<K> p2, FiniteMap<T, K> m) {
        return true;
    }
    boolean isAntitone(FinitePoset<T> p1, FinitePoset<K> p2, FiniteMap<T, K> m) {
        return true;
    }
}
