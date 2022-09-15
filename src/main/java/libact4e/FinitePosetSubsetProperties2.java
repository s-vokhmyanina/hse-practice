package libact4e;

import libact4e.utils.UnderDevelopment;

import java.util.List;

@UnderDevelopment
public interface FinitePosetSubsetProperties2<E> {
    boolean is_lower_set(FinitePoset<E> fp, List<E> s);

    boolean is_upper_set(FinitePoset<E> fp, List<E> s);
}