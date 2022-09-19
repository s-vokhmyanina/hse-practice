package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface SetDisjointUnion<C, E> {
    //Injection mapping: construct element of the i-th component.
    //Raises InvalidValue if i is not a valid index or e is not an element of the i-th component.
    E pack(Integer i, C e);

    //Returns the index of the component and the element.
    //Tuple<Integer, C> unpack(E e);
}
