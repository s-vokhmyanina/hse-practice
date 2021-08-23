package libact4e;

public interface Functor<K, T> {

    Category<K> source();

    Category<T> target();

    T call(K a);
//    Object fOb(Object o);
//
//    Morphism<T> fMor(Morphism<T> morphism);

}
