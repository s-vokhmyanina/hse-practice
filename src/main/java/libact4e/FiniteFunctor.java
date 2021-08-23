package libact4e;

public interface FiniteFunctor<K, T> extends Functor<K, T> {
    FiniteCategory<K> source();

    FiniteCategory<T> target();

}
