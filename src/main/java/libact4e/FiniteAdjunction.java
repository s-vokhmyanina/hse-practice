package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FiniteAdjunction<K, T> {
    FiniteCategory<K> source();

    FiniteCategory<T> target();

    FiniteFunctor<K, T> left();

    FiniteFunctor<T, K> right();
}

