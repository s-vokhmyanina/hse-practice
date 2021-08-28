package libact4e.impl;

import libact4e.FiniteMap;
import libact4e.FiniteMonoid;
import libact4e.FiniteSet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

// todo: implement

public class ArrayFiniteMonoid<T> implements FiniteMonoid<T> {

    private final T neutral;
    private final FiniteSet<T> elements;
    private final FiniteMap<? extends FiniteSet<T>, T> values;

    public ArrayFiniteMonoid(
            T neutral,
            FiniteSet<T> elements,
            BiFunction<T, T, T> function
    ) {
        this.neutral = neutral;
        this.elements = elements;
        // мне не нравится, что там в yml product :с
        // без product (это лучше удалить)
        List<FiniteSet<T>> s = new ArrayList<>();
        List<T> t = new ArrayList<>();

        for (var a : elements) {
            for (var b : elements) {
                final FiniteSet<T> e = new ArrayFiniteSet<>(a, b);
                s.add(e);
                t.add(function.apply(a,b));
            }
        }
        final FiniteSet<FiniteSet<T>> source = new ArrayFiniteSet<>(s);
        final FiniteSet<T> target = new ArrayFiniteSet<>(t);
        values = new ArrayFiniteMap<>(source, target);
    }
    // по сути если будет product, то composition уже будет известна в projection


    // Для загрузки из файла
    public ArrayFiniteMonoid(
            T neutral,
            FiniteSet<T> elements,
            FiniteMap<? extends FiniteSet<T>, T> values
    ) {
        this.neutral = neutral;
        this.elements = elements;
        this.values = values;
    }

    @Override
    public FiniteSet<T> carrier() {
        return elements;
    }

    @Override
    public FiniteMap<? extends FiniteSet<T>, T> composition() {
        return values;
    }

    @Override
    public T identity() {
        return neutral;
    }
}
