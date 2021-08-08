package libact4e;

public interface FiniteSet<T> extends EnumerableSet<T> {
    int size();

    int indexOf(T element);

    T get(int i);

    static <T> ArrayFiniteSet<T> of(T... args) {
        return new ArrayFiniteSet<T>(args);
    }
}
