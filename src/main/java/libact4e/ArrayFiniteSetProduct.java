package libact4e;

import java.util.ArrayList;
import java.util.List;

public class ArrayFiniteSetProduct<Integer> implements FiniteSetProduct<Integer> {

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
        return null;
    }

    @Override
    public List<FiniteMap<FiniteSet<Integer>, Integer>> projections() {
        return null;
    }
}
