package libact4e.impl;

import libact4e.Setoid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraySetoid<T> implements Setoid<T> {

    private final List<T> elements = new ArrayList<>();

    public ArraySetoid(List<T> numbers) {
        elements.addAll(numbers);
    }

    @SafeVarargs
    public ArraySetoid(T... numbers) {
        this(Arrays.asList(numbers));
    }

    @Override
    public boolean contains(T x) {
        return elements.contains(x);
    }


    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}
