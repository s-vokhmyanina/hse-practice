package libact4e.impl;

import libact4e.FiniteSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayFiniteSet<T> implements FiniteSet<T> {

    private final List<T> elements = new ArrayList<>();

    public ArrayFiniteSet(List<T> numbers) {
        elements.addAll(numbers);
    }

    @SafeVarargs
    public ArrayFiniteSet(T... numbers) {
        this(Arrays.asList(numbers));
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean contains(T x) {
        return elements.contains(x);
    }

    @Override
    public Iterator<T> elements() {
        return elements.iterator();
    }

    @Override
    public int indexOf(T element) {
        return elements.indexOf(element);
    }

    @Override
    public T get(int i) {
        return elements.get(i);
    }

    @Override
    public String toString() {
        return "elements: " + elements;
    }
}
