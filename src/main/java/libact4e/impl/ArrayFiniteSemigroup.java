package libact4e.impl;

import libact4e.FiniteMap;
import libact4e.FiniteSemigroup;
import libact4e.FiniteSet;
import libact4e.FiniteSetProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ArrayFiniteSemigroup<T> implements FiniteSemigroup<T> {

    private final FiniteSet<T> carrier;
    private final FiniteMap<? extends FiniteSet<T>, T> composition;

    public ArrayFiniteSemigroup(
            FiniteSet<T> carrier,
            FiniteMap<? extends FiniteSet<T>, T> composition
    ) {
        this.carrier = carrier;
        this.composition = composition;
    }

    public ArrayFiniteSemigroup(
            FiniteSet<T> carrier,
            BiFunction<T, T, T> function
    ) {
        this.carrier = carrier;

        final List<FiniteSet<T>> s = new ArrayList<>();
        final List<T> t = new ArrayList<>();

        for (var a : carrier) {
            for (var b : carrier) {
                s.add(new ArrayFiniteSet<>(a, b));
                t.add(function.apply(a, b));
            }
        }

        final FiniteSetProduct<T, FiniteSet<T>> source = FiniteSetProduct.of(null, s);
        final FiniteSet<T> target = new ArrayFiniteSet<>(t);
        composition = new ArrayFiniteMap<>(source, target);
    }

    @Override
    public FiniteSet<T> carrier() {
        return carrier;
    }

    @Override
    public FiniteMap<? extends FiniteSet<T>, T> composition() {
        return composition;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        final String composition = this.composition.toString()
                .lines()
                .map(s -> "  " + s)
                .collect(Collectors.joining("\n"));

        builder.append("carrier:\n  ")
                .append(carrier).append('\n')
                .append("composition:\n")
                .append(composition);
        return builder.toString();
    }
}
