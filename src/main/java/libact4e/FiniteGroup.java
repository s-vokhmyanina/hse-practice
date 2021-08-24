package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FiniteGroup<T> extends Group<T>, FiniteMonoid<T> {
    FiniteMap<T, T> inverse();
}
