package libact4e;

public interface NaturalTransformation<K, T> {
    Category<K> cat1();

    Category<T> cat2();
}
