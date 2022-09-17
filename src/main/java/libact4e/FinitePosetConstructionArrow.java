package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FinitePosetConstructionArrow<C> {
    FinitePosetOfIntervals<C> arrow(FinitePoset<C> s);
}