package libact4e;

public interface MeetSemilattice<T> extends Poset<T> {
    T meet(T x, T y);

    T top();
}
