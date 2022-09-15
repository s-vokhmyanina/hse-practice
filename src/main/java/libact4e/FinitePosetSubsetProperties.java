package libact4e;

import java.util.Collection;
import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FinitePosetSubsetProperties<T> {
    //True if the given elements form a chain.
    //Note: s can be any collection, not necessarily ordered.
    boolean is_chain(FinitePoset<T> fp, Collection<T> s);

    //True if the given elements form an antichain.
    boolean is_antichain(FinitePoset<T> fp, Collection<T> s);
}