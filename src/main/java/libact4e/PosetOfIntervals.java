package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
//A poset of intervals.
public interface PosetOfIntervals<C, E> extends Poset<E> {
    //Constructs an interval given the boundaries.
    //Must throw ValueError if either a or b is not in the poset,
    //or if (a <= b) does not hold.
    E construct(C a, C b);

    //Returns the boundaries of an interval.
    C boundaries(E interval);
}
