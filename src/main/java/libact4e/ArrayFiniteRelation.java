package libact4e;

import java.util.List;

public class ArrayFiniteRelation<T, K> implements FiniteRelation<T, K> {
    private final FiniteSet<T> source;
    private final FiniteSet<K> target;

    public ArrayFiniteRelation(List<T> s, List<K> t) {
        source = new ArrayFiniteSet<>(s);
        target = new ArrayFiniteSet<>(t);
    }

    public ArrayFiniteRelation(FiniteSet<T> s, FiniteSet<K> t) {
        source = s;
        target = t;
    }

    @Override
    public FiniteSet<T> source() {
        return source;
    }

    @Override
    public FiniteSet<K> target() {
        return target;
    }
}
