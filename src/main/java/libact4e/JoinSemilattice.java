package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface JoinSemilattice<T> extends Poset<T> {
    T join(T x, T y);

    T bottom();
}
