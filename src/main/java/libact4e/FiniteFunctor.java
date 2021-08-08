package libact4e;

public interface FiniteFunctor<K, T> {
    FiniteCategory<K> source();

    FiniteCategory<T> target();

    T call(K a);
}
