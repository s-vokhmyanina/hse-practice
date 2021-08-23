package libact4e.impl;

import com.google.common.collect.ImmutableList;
import libact4e.FiniteMap;
import libact4e.FiniteSet;
import libact4e.FiniteSetProduct;
import libact4e.Setoid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayFiniteSetProduct implements FiniteSetProduct<Integer> {

    private final List<FiniteSet<Integer>> components;

    public ArrayFiniteSetProduct(List<FiniteSet<Integer>> components) {
        this.components = components;
    }

    @Override
    public List<FiniteSet<Integer>> components() {
        return new ArrayList<>(components);
    }

    @Override
    public Integer pack(Integer... args) {
        Integer mul = 1;
        for (var a : args) {
            mul *= a;
        }
        return mul;
    }

    @Override
    public List<FiniteMap<FiniteSet<Integer>, Integer>> projections() {
        List<FiniteMap<FiniteSet<Integer>, Integer>> pr = new ArrayList<>();
        for (var x : components) {
            Integer mul = pack(ImmutableList.copyOf(x.elements()).toArray(new Integer[0]));
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
    public Iterator<Setoid<Integer>> iterator() {
        return null;
    }

    @Override
    public boolean contains(Setoid<Integer> x) {
        return false;
    }
}
