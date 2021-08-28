package libact4e.impl;

import libact4e.*;
import libact4e.utils.UnderDevelopment;

import java.util.List;

public class IntegerMakeSetProduct implements MakeSetProduct<Integer> {

    @Override
    @UnderDevelopment
    public SetProduct<Integer, Setoid<Integer>> product(List<? extends Setoid<Integer>> components) {
        return null;
    }

    @Override
    public FiniteSetProduct<Integer, FiniteSet<Integer>> finiteProduct(List<? extends FiniteSet<Integer>> components) {
        return new IntegerFiniteSetProduct(components);
    }
}
