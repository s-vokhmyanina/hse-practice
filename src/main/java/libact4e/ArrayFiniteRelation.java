package libact4e;

import java.util.List;

public class ArrayFiniteRelation<K, T> implements FiniteRelation<K, T> {
    private final FiniteSet<K> source;
    private final FiniteSet<T> target;

    public ArrayFiniteRelation(List<K> source, List<T> target) {
        this.source = new ArrayFiniteSet<>(source);
        this.target = new ArrayFiniteSet<>(target);
    }

    public ArrayFiniteRelation(FiniteSet<K> source, FiniteSet<T> target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public FiniteSet<K> source() {
        return source;
    }

    @Override
    public FiniteSet<T> target() {
        return target;
    }
}
