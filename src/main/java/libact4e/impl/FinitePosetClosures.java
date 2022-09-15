package libact4e.impl;

import libact4e.FinitePoset;
import java.util.List;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FinitePosetClosures<E> {
    List<E> upper_closure(FinitePoset<E> fp, List<E> s);

    List<E> lower_closure(FinitePoset<E> fp, List<E> s);
}
