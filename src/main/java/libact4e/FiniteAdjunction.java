package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FiniteAdjunction<K, T> {
    FiniteCategory<K> source();

    FiniteCategory<T> target();

    FiniteFunctor<K, T> left(); // source -> target

    FiniteFunctor<T, K> right(); // target -> source
}

