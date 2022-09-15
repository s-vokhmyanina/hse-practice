package libact4e;

import libact4e.utils.UnderDevelopment;

import java.util.List;
import java.util.Optional;

@UnderDevelopment
public interface FinitePosetInfSup<E> {
    //Computes the lower bounds for the subset (possibly empty).
    List<E> lower_bounds(FinitePoset<E> fp, List<E> s);

    //Computes the upper bounds for the subset (possibly empty).
    Optional<List<E>> upper_bounds(FinitePoset<E> fp, List<E> s);

    //Computes the infimum / meet / greatest lower bound
    //for the subset, or returns None if one does not exist.
    Optional<E> infimum(FinitePoset<E> fp, List<E> s);

    //Computes the supremum for the subset if it exists,
    //or returns None if one does not exist.
    Optional<E> supremum(FinitePoset<E> fp, List<E> s);
}
