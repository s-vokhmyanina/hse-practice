package libact4e;

import java.util.List;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FinitePosetMinMax<E> {
    //Return the minimal elements of S
    List<E> minimal(FinitePoset<E> fp, List<E> S);

    //Return the maximal elements of S
    List<E> maximal(FinitePoset<E> fp, List<E> S);
}
