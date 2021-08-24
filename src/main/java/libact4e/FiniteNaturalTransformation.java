package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FiniteNaturalTransformation<K, T> extends NaturalTransformation<K, T> {
    FiniteCategory<K> cat1();

    FiniteCategory<T> cat2();
}
