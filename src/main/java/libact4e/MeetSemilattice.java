package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface MeetSemilattice<T> extends Poset<T> {
    T meet(T x, T y);

    T top();
}
