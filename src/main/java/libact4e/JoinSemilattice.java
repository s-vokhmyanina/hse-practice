package libact4e;

public interface JoinSemilattice<T> extends Poset<T> {
    T join(T x, T y);

    T bottom();
}
