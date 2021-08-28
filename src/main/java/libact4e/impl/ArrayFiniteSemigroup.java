package libact4e.impl;

import libact4e.FiniteMap;
import libact4e.FiniteSemigroup;
import libact4e.FiniteSet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

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
        // то же, что и в моноиде ... используется продукт :с
        // без product (это лучше удалить)
     List<FiniteSet<T>> s = new ArrayList<>();
        List<T> t = new ArrayList<>();

        for (var a : carrier) {
            for (var b : carrier) {
                final FiniteSet<T> e = new ArrayFiniteSet<>(a, b);
                s.add(e);
                t.add(function.apply(a,b));
            }
        }
        final FiniteSet<FiniteSet<T>> source = new ArrayFiniteSet<>(s);
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
}
