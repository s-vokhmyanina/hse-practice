package libact4e.impl;

import libact4e.*;
import libact4e.utils.UnderDevelopment;

import java.util.List;
import java.util.function.BiFunction;

public class ArrayMakeSetProduct implements MakeSetProduct {

    @Override
    @UnderDevelopment
    public <T> SetProduct<T, Setoid<T>> product(
            BiFunction<T, T, T> projectionFunction,
            List<? extends Setoid<T>> components
    ) {
        return null;
    }

    @Override
    public <T> FiniteSetProduct<T, FiniteSet<T>> finiteProduct(
            BiFunction<T, T, T> projectionFunction,
            List<? extends FiniteSet<T>> components
    ) {
        return FiniteSetProduct.of(projectionFunction, components);
    }
}
