package LibACT4E;

public interface FiniteRelation<T, K> extends Relation<T, K> {
    FiniteSet<T> source();
    FiniteSet<K> target();

}
