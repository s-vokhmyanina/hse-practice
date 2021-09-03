package libact4e;

import com.google.common.collect.ImmutableList;
import libact4e.impl.ArrayFiniteMap;
import libact4e.impl.ArrayFiniteSet;
import libact4e.utils.UnderDevelopment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

public abstract class AbstractArrayFiniteSetProduct<T> implements FiniteSetProduct<T, FiniteSet<T>> {

    private final List<? extends FiniteSet<T>> components;

    public AbstractArrayFiniteSetProduct(List<? extends FiniteSet<T>> components) {
        this.components = components;
    }

    @Override
    public List<FiniteSet<T>> components() {
        return new ArrayList<>(components);
    }

    @Override
    @SafeVarargs
    public final T pack(BiFunction<T, T, T> function, T... args) {
        T mul = function.apply(args[0], args[1]);
        for (int i = 2; i < args.length; i++) {
            mul = function.apply(mul, args[i]);
        }
        return mul;
    }

    @Override
    @SuppressWarnings("all")
    public List<FiniteMap<FiniteSet<T>, T>> projections() {
        List<FiniteMap<FiniteSet<T>, T>> pr = new ArrayList<>();
        for (var x : components) {
            T mul = pack(projectionFunction(), (T[]) ImmutableList.copyOf(x.elements()).toArray());
            pr.add(new ArrayFiniteMap<>(FiniteSet.of(x), new ArrayFiniteSet<>(mul)));
        }
        return pr;
    }

    protected abstract BiFunction<T, T, T> projectionFunction();

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("product:");
        for (FiniteSet<T> component : components) {
            builder.append("\n  - ").append(component.toString());
        }
        return builder.toString();
    }

    @Override
    @UnderDevelopment
    @SuppressWarnings("all")
    public Iterator<FiniteSet<T>> elements() {
        return (Iterator<FiniteSet<T>>) components.iterator();
    }

    @Override
    public boolean contains(FiniteSet<T> x) {
        return components.contains(x);
    }

    @Override
    public int size() {
        return components.size();
    }

    @Override
    public int indexOf(FiniteSet<T> element) {
        return components.indexOf(element);
    }

    @Override
    public FiniteSet<T> get(int i) {
        return components.get(i);
    }
}
