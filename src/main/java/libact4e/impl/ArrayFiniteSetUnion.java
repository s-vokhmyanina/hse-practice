package libact4e.impl;

import libact4e.AbstractSetUnion;
import libact4e.FiniteSet;
import libact4e.FiniteSetUnion;

import java.util.Arrays;
import java.util.List;

public class ArrayFiniteSetUnion extends AbstractSetUnion implements FiniteSetUnion {

    private final List<FiniteSet<?>> components;

    public ArrayFiniteSetUnion(FiniteSet<?>... setoids) {
        components = Arrays.asList(setoids);
    }

    @Override
    public List<? extends FiniteSet<?>> components() {
        return components;
    }
}
