package libact4e.impl;

import libact4e.FiniteCategory;
import libact4e.FiniteFunctor;
import libact4e.Morphism;

public class ArrayFiniteFunctor<K, T> implements FiniteFunctor<K, T> {

    private final FiniteCategory<K> source;
    private final FiniteCategory<T> target;

    public ArrayFiniteFunctor(FiniteCategory<K> source, FiniteCategory<T> target) {
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
    public T call(K a) {
        return null;
    }
}
