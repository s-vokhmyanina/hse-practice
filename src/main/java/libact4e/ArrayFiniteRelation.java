package libact4e;

import java.util.List;

public class ArrayFiniteRelation<T, K> implements FiniteRelation<T, K> {
    private final FiniteSet<T> source;
    private final FiniteSet<K> target;

    public ArrayFiniteRelation(List<T> source, List<K> target) {
        this.source = new ArrayFiniteSet<>(source);
        this.target = new ArrayFiniteSet<>(target);
    }

    public ArrayFiniteRelation(FiniteSet<T> source, FiniteSet<K> target) {
        this.source = source;
        this.target = target;
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
