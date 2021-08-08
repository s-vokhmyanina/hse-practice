package libact4e;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
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
    public List<FiniteMap<Integer, Integer>> projections() {
        List<FiniteMap<Integer, Integer>> pr = new ArrayList<>();
        for (var x : components) {
            Integer mul = pack(ImmutableList.copyOf(x.elements()).toArray(new Integer[0]));
            pr.add(new ArrayFiniteMap<>(x, new ArrayFiniteSet<>(mul)));
        }
        return pr;
    }
}
