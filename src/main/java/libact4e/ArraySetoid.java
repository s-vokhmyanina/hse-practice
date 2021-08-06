package libact4e;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ArraySetoid<T> implements Setoid<T> {

    private final List<T> elements = new ArrayList<>();

    public ArraySetoid(List<T> numbers) {
        elements.addAll(numbers);
    }

    public ArraySetoid(T... numbers) {
        this(Arrays.asList(numbers));
    }

    @Override
    public boolean contains(T x) {
        return elements.contains(x);
    }

    @Override
    public Map save(Object x) {
        // todo: реализовать
        return null;
    }

    @Override
    public Object load(Map concreteRealization) {
        // todo: реализовать
        return null;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }

    public int indexOf(T element) {
        return elements.indexOf(element);
    }
}
