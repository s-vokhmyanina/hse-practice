package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FiniteFunctor<K, T> extends Functor<K, T> {
    FiniteCategory<K> source();

    FiniteCategory<T> target();

}
