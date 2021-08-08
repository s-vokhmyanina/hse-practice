package libact4e;

public interface FiniteNaturalTransformation<K, T> extends NaturalTransformation<K, T> {
    FiniteCategory<K> cat1();

    FiniteCategory<T> cat2();
}
