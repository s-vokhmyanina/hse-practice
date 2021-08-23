package libact4e.impl;

import libact4e.AbstractSetUnion;
import libact4e.SetUnion;
import libact4e.Setoid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySetUnion extends AbstractSetUnion implements SetUnion {

    private final List<Setoid<?>> components;

    public ArraySetUnion(Setoid<?>... setoids) {
        components = Arrays.asList(setoids);
    }

    @Override
    public List<Setoid<?>> components() {
        return new ArrayList<>(components);
    }
}
