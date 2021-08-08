package libact4e;

public interface FiniteRelation<K, T> extends Relation<K, T> {
    FiniteSet<K> source();

    FiniteSet<T> target();
}
