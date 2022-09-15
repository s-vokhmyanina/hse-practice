package libact4e;

import java.util.Collection;
import java.util.Iterator;

public interface SetOfFiniteSubsets<C, E> {
    //A set of subsets.

    //Returns the contents of an element representing a subset.
    Iterator<C> contents(E e);

    //Get the element representing the given subset.
    E construct(Collection<C> elements);
}