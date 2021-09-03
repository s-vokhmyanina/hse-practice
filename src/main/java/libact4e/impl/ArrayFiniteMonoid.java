package libact4e.impl;

import libact4e.FiniteMap;
import libact4e.FiniteMonoid;
import libact4e.FiniteSet;
import libact4e.FiniteSetProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ArrayFiniteMonoid<T> implements FiniteMonoid<T> {

    private final T neutral;
    private final FiniteSet<T> elements;
    private final FiniteMap<? extends FiniteSet<T>, T> composition;

    public ArrayFiniteMonoid(
            T neutral,
            FiniteSet<T> elements,
            BiFunction<T, T, T> function
    ) {
        this.neutral = neutral;
        this.elements = elements;

        final List<FiniteSet<T>> s = new ArrayList<>();
        final List<T> t = new ArrayList<>();

        for (var a : elements) {
            for (var b : elements) {
                s.add(new ArrayFiniteSet<>(a, b));
                t.add(function.apply(a, b));
            }
        }

        final FiniteSetProduct<T, FiniteSet<T>> source = FiniteSetProduct.of(null, s);
        final FiniteSet<T> target = new ArrayFiniteSet<>(t);
        composition = new ArrayFiniteMap<>(source, target);
    }

    // Для загрузки из файла
    public ArrayFiniteMonoid(
            T neutral,
            FiniteSet<T> elements,
            FiniteMap<? extends FiniteSet<T>, T> composition
    ) {
        this.neutral = neutral;
        this.elements = elements;
        this.composition = composition;
    }

    @Override
    public FiniteSet<T> carrier() {
        return elements;
    }

    @Override
    public FiniteMap<? extends FiniteSet<T>, T> composition() {
        return composition;
    }

    @Override
    public T identity() {
        return neutral;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        final String composition = this.composition.toString()
                .lines()
                .map(s -> "  " + s)
                .collect(Collectors.joining("\n"));

        builder.append("carrier:\n  ")
                .append(elements).append('\n')
                .append("composition:\n")
                .append(composition)
                .append("\nneutral: ").append(neutral);
        return builder.toString();
    }
}
