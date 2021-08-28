package libact4e.impl;

import com.google.common.collect.ImmutableList;
import libact4e.FiniteMap;
import libact4e.FiniteSet;
import libact4e.FiniteSetProduct;
import libact4e.Setoid;
import libact4e.utils.UnderDevelopment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

public class IntegerFiniteSetProduct implements FiniteSetProduct<Integer, FiniteSet<Integer>> {

    private final List<? extends FiniteSet<Integer>> components;

    public IntegerFiniteSetProduct(List<? extends FiniteSet<Integer>> components) {
        this.components = components;
    }

    @Override
    public List<FiniteSet<Integer>> components() {
        return new ArrayList<>(components);
    }

    @Override
    public Integer pack(BiFunction<Integer, Integer, Integer> function, Integer... args) {
        Integer mul = function.apply(args[0], args[1]);
        for (int i = 2; i < args.length; i++) {
            mul = function.apply(mul, args[i]);
        }
        return mul;
    }

    @Override
    public List<FiniteMap<FiniteSet<Integer>, Integer>> projections() {
        List<FiniteMap<FiniteSet<Integer>, Integer>> pr = new ArrayList<>();
        for (var x : components) {
            Integer mul = pack((i1, i2) -> i1 * i2, ImmutableList.copyOf(x.elements()).toArray(new Integer[0]));
            pr.add(new ArrayFiniteMap<>(FiniteSet.of(x), new ArrayFiniteSet<>(mul)));
        }
        return pr;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("product:");
        for (FiniteSet<Integer> component : components) {
            builder.append("\n- ").append(component.toString());
        }
        return builder.toString();
    }

    @Override
    @UnderDevelopment
    public Iterator<FiniteSet<Integer>> iterator() {
        return (Iterator<FiniteSet<Integer>>) components.iterator();
    }

    @Override
    public boolean contains(FiniteSet<Integer> x) {
        return components.contains(x);
    }
}
