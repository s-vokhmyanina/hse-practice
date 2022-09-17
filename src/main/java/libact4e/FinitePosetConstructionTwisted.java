package libact4e;

import libact4e.utils.UnderDevelopment;

@UnderDevelopment
public interface FinitePosetConstructionTwisted<C> {
    FinitePosetOfIntervals<C> twisted(FinitePoset<C> s);
}