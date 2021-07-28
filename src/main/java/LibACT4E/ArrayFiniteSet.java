package LibACT4E;

import java.util.*;

public class ArrayFiniteSet<T> implements FiniteSet<T> {

    private final List<T> elements = new ArrayList<>();

    public ArrayFiniteSet(List<T> numbers) {
        elements.addAll(numbers);
    }

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
    public Map<String, T> save(T x) {
        // todo: реазиловать
        return null;
    }

    @Override
    public T load(Map<String, T> concreteRealization) {
        // todo: реализовать
        return null;
    }
}
