package libact4e;

public interface FiniteSet<T> extends EnumerableSet<T> {
    int size();

    int indexOf(T element);

    T get(int i);
}
