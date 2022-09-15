package libact4e;

import libact4e.FinitePoset;
import libact4e.FiniteSet;

public interface FinitePosetConstructionDiscrete<E> {
    //Creates the discrete poset from any set.
    FinitePoset<E> discrete(FiniteSet<E> e);
}
