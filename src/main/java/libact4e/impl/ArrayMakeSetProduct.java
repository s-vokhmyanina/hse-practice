package libact4e.impl;

import libact4e.*;

import java.util.List;

public class ArrayMakeSetProduct<T> implements MakeSetProduct<T> {

    @Override
    public SetProduct<T, Setoid<T>> product(List<? extends Setoid<T>> components) {
        return null;
    }

    @Override
    public FiniteSetProduct<T, FiniteSet<T>> finiteProduct(List<? extends FiniteSet<T>> components) {
        return null;
    }
}
