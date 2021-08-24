package libact4e;

import com.google.common.collect.Lists;
import libact4e.impl.ArrayFiniteSet;

import java.util.List;

public interface FiniteSet<T> extends EnumerableSet<T> {

    int size();

    int indexOf(T element);

    T get(int i);

    default List<T> toList() {
        return Lists.newArrayList(elements());
    }

    static <T> ArrayFiniteSet<T> of(T... args) {
        return new ArrayFiniteSet<>(args);
    }

    static <T> FiniteSet<T> of(List<T> source) {
        return new ArrayFiniteSet<>(source);
    }
}
