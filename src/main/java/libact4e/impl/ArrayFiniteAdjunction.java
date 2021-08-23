package libact4e.impl;

import libact4e.FiniteAdjunction;
import libact4e.FiniteCategory;
import libact4e.FiniteFunctor;

public class ArrayFiniteAdjunction<K, T> implements FiniteAdjunction<K, T> {

    private final FiniteCategory<K> source;
    private final FiniteCategory<T> target;

    public ArrayFiniteAdjunction(FiniteCategory<K> source, FiniteCategory<T> target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public FiniteCategory<K> source() {
        return source;
    }

    @Override
    public FiniteCategory<T> target() {
        return target;
    }

    @Override
    public FiniteFunctor<K, T> left() {
        return new ArrayFiniteFunctor<>(source, target);
    }

    @Override
    public FiniteFunctor<T, K> right() {
        return new ArrayFiniteFunctor<>(target, source);
    }
}
