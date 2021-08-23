package libact4e.impl;

import com.google.common.collect.Lists;
import libact4e.FiniteSet;

import java.util.List;

public class FiniteSetProperties {

    public <T> boolean isSubset(FiniteSet<T> a, FiniteSet<T> b) {
        final List<T> aList = Lists.newArrayList(a.elements());
        final List<T> bList = Lists.newArrayList(b.elements());
        return bList.containsAll(aList);
    }

    public <T> boolean equal(FiniteSet<T> a, FiniteSet<T> b) {
        return isSubset(a, b) && isSubset(b, a);
    }

    public <T> boolean isStrictSubset(FiniteSet<T> a, FiniteSet<T> b) {
        return isSubset(a, b) && !isSubset(b, a);
    }
}
