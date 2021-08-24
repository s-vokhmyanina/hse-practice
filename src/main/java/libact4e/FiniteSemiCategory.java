package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FiniteSemiCategory<T> extends SemiCategory<T> {
    FiniteSet<T> objects();

    FiniteSet<T> hom(T ob1, T ob2);
}
