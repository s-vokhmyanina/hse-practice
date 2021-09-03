package libact4e.impl;

import libact4e.AbstractArrayFiniteSetProduct;
import libact4e.FiniteSet;

import java.util.List;
import java.util.function.BiFunction;

public class IntegerFiniteSetProduct extends AbstractArrayFiniteSetProduct<Integer> {

    public IntegerFiniteSetProduct(List<? extends FiniteSet<Integer>> components) {
        super(components);
    }

    @Override
    protected BiFunction<Integer, Integer, Integer> projectionFunction() {
        return (integer, integer2) -> integer * integer2;
    }
}
