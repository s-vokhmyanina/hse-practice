package libact4e.impl;

import libact4e.FiniteMap;
import libact4e.FiniteSet;

import java.util.stream.Collectors;

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

        final String source = this.source.toString()
                .lines()
                .map(s -> "  " + s)
                .collect(Collectors.joining("\n"));

        builder.append("source:\n")
                .append(source).append("\n")
                .append("target:\n  ")
                .append(target).append("\n")
                .append("values:");

        for (int i = 0; i < this.source.size(); i++) {
            final K current = this.source.get(i);
            final T element = target.get(i % target.size());

            String currentString = current.toString();
            if (currentString.startsWith("elements: ")) {
                currentString = currentString.substring("elements: ".length());
            }

            builder.append("\n  - [").append(currentString).append(", ").append(element).append("]");
        }

        return builder.toString();
    }
}
