package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FiniteRelation<K, T> extends Relation<K, T> {

    FiniteSet<K> source();

    FiniteSet<T> target();
}
