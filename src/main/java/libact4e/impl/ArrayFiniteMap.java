package libact4e.impl;

import libact4e.FiniteMap;
import libact4e.FiniteSet;

public class ArrayFiniteMap<K, T> implements FiniteMap<K, T> {

    private final FiniteSet<K> source;
    private final FiniteSet<T> target;

    public ArrayFiniteMap(FiniteSet<K> source, FiniteSet<T> target) {
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

    @Override
    public T apply(K a) {
        final int i = source.indexOf(a) % target.size();
        return target.get(i);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("source:\n  ")
                .append(source.toString()).append("\n")
                .append("target:\n  ")
                .append(target.toString()).append("\n")
                .append("values:");
        for (int i = 0; i < source.size(); i++) {
            final K current = source.get(i);
            final T element = target.get(i % target.size());
            builder.append("\n  - [").append(current).append(", ").append(element).append("]");
        }
        return builder.toString();
    }

    @Override
    public T call(K a) {
        return null;
    }

}
