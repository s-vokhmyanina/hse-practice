package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FiniteMonoidalPoset<T> {
    FinitePoset<T> poset();

    FiniteMonoid<T> monoid();
}
